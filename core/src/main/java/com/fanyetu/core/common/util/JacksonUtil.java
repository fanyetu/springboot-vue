package com.fanyetu.core.common.util;

import cn.hutool.core.util.StrUtil;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * jackson工具类
 *
 * @author zhanghaonan
 *
 */
public class JacksonUtil {

	private static final Logger logger = LoggerFactory.getLogger(JacksonUtil.class);

	private static final ObjectMapper objectMapper = new ObjectMapper();

	static {
		/**
		 * 默认非空不输出，时间格式
		 */
		objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS,false);
		objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
		// 设置未定义字段不进行反序列化
        // 不要添加，当转换的json和结果对象完全不同的时候也会转换出来，转换结果对象的列都是空，会导致系统中的使用到这个对象的代码空指针
//		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
	}

	/**
	 * Object对像转换成JSON
	 *
	 * @param obj
	 * @return String
	 */
	public static String objectToJSON(Object obj) {
		if (obj != null) {
			try {
				return objectMapper.writeValueAsString(obj);
			} catch (Exception e) {
				logger.error("Java 转 json出错", e);
				throw new JacksonException(e);
			}
		}
		return null;
	}

	/**
	 * json字符串转换成JavaBean对象
	 *
	 * @param <T>
	 * @param jsonStr
	 * @param clazz
	 * @return
	 */
	public static <T> T jsonToEntity(String jsonStr, Class<T> clazz) {
		try {
			return JSONToObject(jsonStr, clazz);
		} catch (Exception e) {
			logger.error("JSON 转 Entity 失败");
			throw new JacksonException(e);
		}
	}

	/**
	 * inputstream转成javaBean
	 * @param inputStream
	 * @param clazz
	 * @param <T>
	 * @return
	 */
	public static <T> T jsonToEntity(InputStream inputStream,Class<T> clazz){
		try {
			return JSONToObject(inputStream,clazz);
		} catch (IOException e) {
			logger.error("JSON 转 Entity 失败");
			throw new JacksonException(e);
		}
	}

	/**
	 * json字符串转换Map集合
	 *
	 * @param jsonStr
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, Object> jsonToMap(String jsonStr) {
		try {
			return JSONToObject(jsonStr, Map.class);
		} catch (Exception e) {
			logger.error("JSON 转 Map 失败");
			throw new JacksonException(e);
		}
	}

	/**
	 * InputStream 转 map
	 * @param inputStream
	 * @return
	 */
	public static Map<String,Object> jsonToMap(InputStream inputStream){
		try {
			return JSONToObject(inputStream,Map.class);
		}catch (Exception e){
			logger.error("InputStream 转 Map 失败");
			throw new JacksonException(e);
		}
	}

	/**
	 * json字符串转换成list<T>
	 *
	 * @param jsonStr
	 * @return
	 */
	public static List<?> jsonToList(String jsonStr) {
		try {
			return JSONToObject(jsonStr, List.class);
		} catch (Exception e) {
			logger.error("JSON 转 List 失败");
			throw new JacksonException(e);
		}
	}

	/**
	 * json字符串转换成list<T>,T复杂对象
	 *
	 * @param jsonStr
	 * @param elementClasses
	 *            list元素类型
	 * @return
	 */
	public static List<?> jsonToList(String jsonStr, Class<?> elementClasses) {
		try {
			JavaType javaType = getCollectionType(List.class, elementClasses);
			return objectMapper.readValue(jsonStr, javaType);
		} catch (Exception e) {
			logger.error("JSON 转 List 失败");
			throw new JacksonException(e);
		}
	}

	/**
	 * json字符串转换成map<K,V>,K/V复杂对象
	 *
	 * @param jsonStr
	 * @param keyClasses
	 *            K类型
	 * @param elementClasses
	 *            V类型
	 * @return
	 */
	public static Map<?, ?> jsonToMap(String jsonStr, Class<?> keyClasses, Class<?> elementClasses) {
		try {
			JavaType javaType = getCollectionType(Map.class, keyClasses, elementClasses);
			return objectMapper.readValue(jsonStr, javaType);
		} catch (Exception e) {
			logger.error("JSON 转 Map 失败");
			throw new JacksonException(e);
		}
	}

	private static <E> E JSONToObject(String jsonStr, Class<E> clazz) throws JsonParseException,
            JsonMappingException, IOException {
		return objectMapper.readValue(jsonStr, clazz);
	}

	private static <E> E JSONToObject(InputStream inputStream, Class<E> clazz) throws JsonParseException,
            JsonMappingException, IOException {
		return objectMapper.readValue(inputStream, clazz);
	}


	private static JavaType getCollectionType(Class<?> collectionClass, Class<?>... elementClasses) {
		return objectMapper.getTypeFactory().constructParametricType(collectionClass,
				elementClasses);
	}

	/**
     * 附件id转换List
     *
     * @param fileIdsStr
     * @return List
     */
	public static List<String> jsonFileIdsToList(String fileIdsStr) {
        if(StrUtil.isEmpty(fileIdsStr) || fileIdsStr.split(",").length==0){
            return Collections.emptyList();
        }
        List<String> fileIds=new ArrayList<String>();
        for(String fileId:fileIdsStr.split(",")){
            fileIds.add(fileId);
        }
        return fileIds;
    }

	/**
	 * 转换失败抛出异常
	 */
	public static class JacksonException extends RuntimeException{
		public JacksonException() {
		}

		public JacksonException(String message) {
			super(message);
		}

		public JacksonException(String message, Throwable cause) {
			super(message, cause);
		}

		public JacksonException(Throwable cause) {
			super(cause);
		}

		public JacksonException(String message, Throwable cause, boolean enableSuppression,
								boolean writableStackTrace) {
			super(message, cause, enableSuppression, writableStackTrace);
		}
	}

}
