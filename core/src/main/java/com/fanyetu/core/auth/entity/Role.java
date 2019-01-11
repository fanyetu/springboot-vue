package com.fanyetu.core.auth.entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author zhanghaonan
*/
public class Role implements Serializable {

    private static final long serialVersionUID = 1543332476987L;


    /**
    * 主键
    * 角色ID
    * isNullAble:0
    */
    private Integer id;

    /**
    * 角色名称
    * isNullAble:0
    */
    private String name;

    /**
    * 
    * isNullAble:1
    */
    private String cnName;

    /**
    * 角色描述
    * isNullAble:1
    */
    private String description;

    /**
    * 角色类型
    * isNullAble:0
    */
    private String type;

    /**
    * 
    * isNullAble:1
    */
    private Integer createUser;

    /**
    * 
    * isNullAble:0,defaultVal:CURRENT_TIMESTAMP
    */
    private java.time.LocalDateTime createTime;

    /**
    * 
    * isNullAble:1
    */
    private Integer updateUser;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime updateTime;

    /**
    * 
    * isNullAble:1,defaultVal:0
    */
    private Integer delFlag;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setCnName(String cnName){this.cnName = cnName;}

    public String getCnName(){return this.cnName;}

    public void setDescription(String description){this.description = description;}

    public String getDescription(){return this.description;}

    public void setType(String type){this.type = type;}

    public String getType(){return this.type;}

    public void setCreateUser(Integer createUser){this.createUser = createUser;}

    public Integer getCreateUser(){return this.createUser;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}

    public void setUpdateUser(Integer updateUser){this.updateUser = updateUser;}

    public Integer getUpdateUser(){return this.updateUser;}

    public void setUpdateTime(java.time.LocalDateTime updateTime){this.updateTime = updateTime;}

    public java.time.LocalDateTime getUpdateTime(){return this.updateTime;}

    public void setDelFlag(Integer delFlag){this.delFlag = delFlag;}

    public Integer getDelFlag(){return this.delFlag;}
    @Override
    public String toString() {
        return "Role{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                "cnName='" + cnName + '\'' +
                "description='" + description + '\'' +
                "type='" + type + '\'' +
                "createUser='" + createUser + '\'' +
                "createTime='" + createTime + '\'' +
                "updateUser='" + updateUser + '\'' +
                "updateTime='" + updateTime + '\'' +
                "delFlag='" + delFlag + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Role set;

        private ConditionBuilder where;

        public UpdateBuilder set(Role set){
            this.set = set;
            return this;
        }

        public Role getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends Role{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<String> cnNameList;

        public List<String> getCnNameList(){return this.cnNameList;}


        private List<String> fuzzyCnName;

        public List<String> getFuzzyCnName(){return this.fuzzyCnName;}

        private List<String> rightFuzzyCnName;

        public List<String> getRightFuzzyCnName(){return this.rightFuzzyCnName;}
        private List<String> descriptionList;

        public List<String> getDescriptionList(){return this.descriptionList;}


        private List<String> fuzzyDescription;

        public List<String> getFuzzyDescription(){return this.fuzzyDescription;}

        private List<String> rightFuzzyDescription;

        public List<String> getRightFuzzyDescription(){return this.rightFuzzyDescription;}
        private List<String> typeList;

        public List<String> getTypeList(){return this.typeList;}


        private List<String> fuzzyType;

        public List<String> getFuzzyType(){return this.fuzzyType;}

        private List<String> rightFuzzyType;

        public List<String> getRightFuzzyType(){return this.rightFuzzyType;}
        private List<Integer> createUserList;

        public List<Integer> getCreateUserList(){return this.createUserList;}

        private Integer createUserSt;

        private Integer createUserEd;

        public Integer getCreateUserSt(){return this.createUserSt;}

        public Integer getCreateUserEd(){return this.createUserEd;}

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<Integer> updateUserList;

        public List<Integer> getUpdateUserList(){return this.updateUserList;}

        private Integer updateUserSt;

        private Integer updateUserEd;

        public Integer getUpdateUserSt(){return this.updateUserSt;}

        public Integer getUpdateUserEd(){return this.updateUserEd;}

        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList(){return this.updateTimeList;}

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt(){return this.updateTimeSt;}

        public java.time.LocalDateTime getUpdateTimeEd(){return this.updateTimeEd;}

        private List<Integer> delFlagList;

        public List<Integer> getDelFlagList(){return this.delFlagList;}

        private Integer delFlagSt;

        private Integer delFlagEd;

        public Integer getDelFlagSt(){return this.delFlagSt;}

        public Integer getDelFlagEd(){return this.delFlagEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public QueryBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public QueryBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public QueryBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public QueryBuilder name(String name){
            setName(name);
            return this;
        }

        public QueryBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public QueryBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public QueryBuilder fetchName(){
            setFetchFields("fetchFields","name");
            return this;
        }

        public QueryBuilder excludeName(){
            setFetchFields("excludeFields","name");
            return this;
        }

        public QueryBuilder fuzzyCnName (List<String> fuzzyCnName){
            this.fuzzyCnName = fuzzyCnName;
            return this;
        }

        public QueryBuilder fuzzyCnName (String ... fuzzyCnName){
            this.fuzzyCnName = solveNullList(fuzzyCnName);
            return this;
        }

        public QueryBuilder rightFuzzyCnName (List<String> rightFuzzyCnName){
            this.rightFuzzyCnName = rightFuzzyCnName;
            return this;
        }

        public QueryBuilder rightFuzzyCnName (String ... rightFuzzyCnName){
            this.rightFuzzyCnName = solveNullList(rightFuzzyCnName);
            return this;
        }

        public QueryBuilder cnName(String cnName){
            setCnName(cnName);
            return this;
        }

        public QueryBuilder cnNameList(String ... cnName){
            this.cnNameList = solveNullList(cnName);
            return this;
        }

        public QueryBuilder cnNameList(List<String> cnName){
            this.cnNameList = cnName;
            return this;
        }

        public QueryBuilder fetchCnName(){
            setFetchFields("fetchFields","cnName");
            return this;
        }

        public QueryBuilder excludeCnName(){
            setFetchFields("excludeFields","cnName");
            return this;
        }

        public QueryBuilder fuzzyDescription (List<String> fuzzyDescription){
            this.fuzzyDescription = fuzzyDescription;
            return this;
        }

        public QueryBuilder fuzzyDescription (String ... fuzzyDescription){
            this.fuzzyDescription = solveNullList(fuzzyDescription);
            return this;
        }

        public QueryBuilder rightFuzzyDescription (List<String> rightFuzzyDescription){
            this.rightFuzzyDescription = rightFuzzyDescription;
            return this;
        }

        public QueryBuilder rightFuzzyDescription (String ... rightFuzzyDescription){
            this.rightFuzzyDescription = solveNullList(rightFuzzyDescription);
            return this;
        }

        public QueryBuilder description(String description){
            setDescription(description);
            return this;
        }

        public QueryBuilder descriptionList(String ... description){
            this.descriptionList = solveNullList(description);
            return this;
        }

        public QueryBuilder descriptionList(List<String> description){
            this.descriptionList = description;
            return this;
        }

        public QueryBuilder fetchDescription(){
            setFetchFields("fetchFields","description");
            return this;
        }

        public QueryBuilder excludeDescription(){
            setFetchFields("excludeFields","description");
            return this;
        }

        public QueryBuilder fuzzyType (List<String> fuzzyType){
            this.fuzzyType = fuzzyType;
            return this;
        }

        public QueryBuilder fuzzyType (String ... fuzzyType){
            this.fuzzyType = solveNullList(fuzzyType);
            return this;
        }

        public QueryBuilder rightFuzzyType (List<String> rightFuzzyType){
            this.rightFuzzyType = rightFuzzyType;
            return this;
        }

        public QueryBuilder rightFuzzyType (String ... rightFuzzyType){
            this.rightFuzzyType = solveNullList(rightFuzzyType);
            return this;
        }

        public QueryBuilder type(String type){
            setType(type);
            return this;
        }

        public QueryBuilder typeList(String ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public QueryBuilder typeList(List<String> type){
            this.typeList = type;
            return this;
        }

        public QueryBuilder fetchType(){
            setFetchFields("fetchFields","type");
            return this;
        }

        public QueryBuilder excludeType(){
            setFetchFields("excludeFields","type");
            return this;
        }

        public QueryBuilder createUserBetWeen(Integer createUserSt,Integer createUserEd){
            this.createUserSt = createUserSt;
            this.createUserEd = createUserEd;
            return this;
        }

        public QueryBuilder createUserGreaterEqThan(Integer createUserSt){
            this.createUserSt = createUserSt;
            return this;
        }
        public QueryBuilder createUserLessEqThan(Integer createUserEd){
            this.createUserEd = createUserEd;
            return this;
        }


        public QueryBuilder createUser(Integer createUser){
            setCreateUser(createUser);
            return this;
        }

        public QueryBuilder createUserList(Integer ... createUser){
            this.createUserList = solveNullList(createUser);
            return this;
        }

        public QueryBuilder createUserList(List<Integer> createUser){
            this.createUserList = createUser;
            return this;
        }

        public QueryBuilder fetchCreateUser(){
            setFetchFields("fetchFields","createUser");
            return this;
        }

        public QueryBuilder excludeCreateUser(){
            setFetchFields("excludeFields","createUser");
            return this;
        }

        public QueryBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public QueryBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public QueryBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public QueryBuilder createTime(java.time.LocalDateTime createTime){
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public QueryBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public QueryBuilder fetchCreateTime(){
            setFetchFields("fetchFields","createTime");
            return this;
        }

        public QueryBuilder excludeCreateTime(){
            setFetchFields("excludeFields","createTime");
            return this;
        }

        public QueryBuilder updateUserBetWeen(Integer updateUserSt,Integer updateUserEd){
            this.updateUserSt = updateUserSt;
            this.updateUserEd = updateUserEd;
            return this;
        }

        public QueryBuilder updateUserGreaterEqThan(Integer updateUserSt){
            this.updateUserSt = updateUserSt;
            return this;
        }
        public QueryBuilder updateUserLessEqThan(Integer updateUserEd){
            this.updateUserEd = updateUserEd;
            return this;
        }


        public QueryBuilder updateUser(Integer updateUser){
            setUpdateUser(updateUser);
            return this;
        }

        public QueryBuilder updateUserList(Integer ... updateUser){
            this.updateUserList = solveNullList(updateUser);
            return this;
        }

        public QueryBuilder updateUserList(List<Integer> updateUser){
            this.updateUserList = updateUser;
            return this;
        }

        public QueryBuilder fetchUpdateUser(){
            setFetchFields("fetchFields","updateUser");
            return this;
        }

        public QueryBuilder excludeUpdateUser(){
            setFetchFields("excludeFields","updateUser");
            return this;
        }

        public QueryBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt,java.time.LocalDateTime updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public QueryBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public QueryBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public QueryBuilder updateTime(java.time.LocalDateTime updateTime){
            setUpdateTime(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(java.time.LocalDateTime ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(List<java.time.LocalDateTime> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        public QueryBuilder fetchUpdateTime(){
            setFetchFields("fetchFields","updateTime");
            return this;
        }

        public QueryBuilder excludeUpdateTime(){
            setFetchFields("excludeFields","updateTime");
            return this;
        }

        public QueryBuilder delFlagBetWeen(Integer delFlagSt,Integer delFlagEd){
            this.delFlagSt = delFlagSt;
            this.delFlagEd = delFlagEd;
            return this;
        }

        public QueryBuilder delFlagGreaterEqThan(Integer delFlagSt){
            this.delFlagSt = delFlagSt;
            return this;
        }
        public QueryBuilder delFlagLessEqThan(Integer delFlagEd){
            this.delFlagEd = delFlagEd;
            return this;
        }


        public QueryBuilder delFlag(Integer delFlag){
            setDelFlag(delFlag);
            return this;
        }

        public QueryBuilder delFlagList(Integer ... delFlag){
            this.delFlagList = solveNullList(delFlag);
            return this;
        }

        public QueryBuilder delFlagList(List<Integer> delFlag){
            this.delFlagList = delFlag;
            return this;
        }

        public QueryBuilder fetchDelFlag(){
            setFetchFields("fetchFields","delFlag");
            return this;
        }

        public QueryBuilder excludeDelFlag(){
            setFetchFields("excludeFields","delFlag");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public Role build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<String> cnNameList;

        public List<String> getCnNameList(){return this.cnNameList;}


        private List<String> fuzzyCnName;

        public List<String> getFuzzyCnName(){return this.fuzzyCnName;}

        private List<String> rightFuzzyCnName;

        public List<String> getRightFuzzyCnName(){return this.rightFuzzyCnName;}
        private List<String> descriptionList;

        public List<String> getDescriptionList(){return this.descriptionList;}


        private List<String> fuzzyDescription;

        public List<String> getFuzzyDescription(){return this.fuzzyDescription;}

        private List<String> rightFuzzyDescription;

        public List<String> getRightFuzzyDescription(){return this.rightFuzzyDescription;}
        private List<String> typeList;

        public List<String> getTypeList(){return this.typeList;}


        private List<String> fuzzyType;

        public List<String> getFuzzyType(){return this.fuzzyType;}

        private List<String> rightFuzzyType;

        public List<String> getRightFuzzyType(){return this.rightFuzzyType;}
        private List<Integer> createUserList;

        public List<Integer> getCreateUserList(){return this.createUserList;}

        private Integer createUserSt;

        private Integer createUserEd;

        public Integer getCreateUserSt(){return this.createUserSt;}

        public Integer getCreateUserEd(){return this.createUserEd;}

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<Integer> updateUserList;

        public List<Integer> getUpdateUserList(){return this.updateUserList;}

        private Integer updateUserSt;

        private Integer updateUserEd;

        public Integer getUpdateUserSt(){return this.updateUserSt;}

        public Integer getUpdateUserEd(){return this.updateUserEd;}

        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList(){return this.updateTimeList;}

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt(){return this.updateTimeSt;}

        public java.time.LocalDateTime getUpdateTimeEd(){return this.updateTimeEd;}

        private List<Integer> delFlagList;

        public List<Integer> getDelFlagList(){return this.delFlagList;}

        private Integer delFlagSt;

        private Integer delFlagEd;

        public Integer getDelFlagSt(){return this.delFlagSt;}

        public Integer getDelFlagEd(){return this.delFlagEd;}


        public ConditionBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public ConditionBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public ConditionBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public ConditionBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public ConditionBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public ConditionBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public ConditionBuilder fuzzyCnName (List<String> fuzzyCnName){
            this.fuzzyCnName = fuzzyCnName;
            return this;
        }

        public ConditionBuilder fuzzyCnName (String ... fuzzyCnName){
            this.fuzzyCnName = solveNullList(fuzzyCnName);
            return this;
        }

        public ConditionBuilder rightFuzzyCnName (List<String> rightFuzzyCnName){
            this.rightFuzzyCnName = rightFuzzyCnName;
            return this;
        }

        public ConditionBuilder rightFuzzyCnName (String ... rightFuzzyCnName){
            this.rightFuzzyCnName = solveNullList(rightFuzzyCnName);
            return this;
        }

        public ConditionBuilder cnNameList(String ... cnName){
            this.cnNameList = solveNullList(cnName);
            return this;
        }

        public ConditionBuilder cnNameList(List<String> cnName){
            this.cnNameList = cnName;
            return this;
        }

        public ConditionBuilder fuzzyDescription (List<String> fuzzyDescription){
            this.fuzzyDescription = fuzzyDescription;
            return this;
        }

        public ConditionBuilder fuzzyDescription (String ... fuzzyDescription){
            this.fuzzyDescription = solveNullList(fuzzyDescription);
            return this;
        }

        public ConditionBuilder rightFuzzyDescription (List<String> rightFuzzyDescription){
            this.rightFuzzyDescription = rightFuzzyDescription;
            return this;
        }

        public ConditionBuilder rightFuzzyDescription (String ... rightFuzzyDescription){
            this.rightFuzzyDescription = solveNullList(rightFuzzyDescription);
            return this;
        }

        public ConditionBuilder descriptionList(String ... description){
            this.descriptionList = solveNullList(description);
            return this;
        }

        public ConditionBuilder descriptionList(List<String> description){
            this.descriptionList = description;
            return this;
        }

        public ConditionBuilder fuzzyType (List<String> fuzzyType){
            this.fuzzyType = fuzzyType;
            return this;
        }

        public ConditionBuilder fuzzyType (String ... fuzzyType){
            this.fuzzyType = solveNullList(fuzzyType);
            return this;
        }

        public ConditionBuilder rightFuzzyType (List<String> rightFuzzyType){
            this.rightFuzzyType = rightFuzzyType;
            return this;
        }

        public ConditionBuilder rightFuzzyType (String ... rightFuzzyType){
            this.rightFuzzyType = solveNullList(rightFuzzyType);
            return this;
        }

        public ConditionBuilder typeList(String ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public ConditionBuilder typeList(List<String> type){
            this.typeList = type;
            return this;
        }

        public ConditionBuilder createUserBetWeen(Integer createUserSt,Integer createUserEd){
            this.createUserSt = createUserSt;
            this.createUserEd = createUserEd;
            return this;
        }

        public ConditionBuilder createUserGreaterEqThan(Integer createUserSt){
            this.createUserSt = createUserSt;
            return this;
        }
        public ConditionBuilder createUserLessEqThan(Integer createUserEd){
            this.createUserEd = createUserEd;
            return this;
        }


        public ConditionBuilder createUserList(Integer ... createUser){
            this.createUserList = solveNullList(createUser);
            return this;
        }

        public ConditionBuilder createUserList(List<Integer> createUser){
            this.createUserList = createUser;
            return this;
        }

        public ConditionBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public ConditionBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public ConditionBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public ConditionBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public ConditionBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public ConditionBuilder updateUserBetWeen(Integer updateUserSt,Integer updateUserEd){
            this.updateUserSt = updateUserSt;
            this.updateUserEd = updateUserEd;
            return this;
        }

        public ConditionBuilder updateUserGreaterEqThan(Integer updateUserSt){
            this.updateUserSt = updateUserSt;
            return this;
        }
        public ConditionBuilder updateUserLessEqThan(Integer updateUserEd){
            this.updateUserEd = updateUserEd;
            return this;
        }


        public ConditionBuilder updateUserList(Integer ... updateUser){
            this.updateUserList = solveNullList(updateUser);
            return this;
        }

        public ConditionBuilder updateUserList(List<Integer> updateUser){
            this.updateUserList = updateUser;
            return this;
        }

        public ConditionBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt,java.time.LocalDateTime updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public ConditionBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public ConditionBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public ConditionBuilder updateTimeList(java.time.LocalDateTime ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public ConditionBuilder updateTimeList(List<java.time.LocalDateTime> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        public ConditionBuilder delFlagBetWeen(Integer delFlagSt,Integer delFlagEd){
            this.delFlagSt = delFlagSt;
            this.delFlagEd = delFlagEd;
            return this;
        }

        public ConditionBuilder delFlagGreaterEqThan(Integer delFlagSt){
            this.delFlagSt = delFlagSt;
            return this;
        }
        public ConditionBuilder delFlagLessEqThan(Integer delFlagEd){
            this.delFlagEd = delFlagEd;
            return this;
        }


        public ConditionBuilder delFlagList(Integer ... delFlag){
            this.delFlagList = solveNullList(delFlag);
            return this;
        }

        public ConditionBuilder delFlagList(List<Integer> delFlag){
            this.delFlagList = delFlag;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private Role obj;

        public Builder(){
            this.obj = new Role();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder cnName(String cnName){
            this.obj.setCnName(cnName);
            return this;
        }
        public Builder description(String description){
            this.obj.setDescription(description);
            return this;
        }
        public Builder type(String type){
            this.obj.setType(type);
            return this;
        }
        public Builder createUser(Integer createUser){
            this.obj.setCreateUser(createUser);
            return this;
        }
        public Builder createTime(java.time.LocalDateTime createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder updateUser(Integer updateUser){
            this.obj.setUpdateUser(updateUser);
            return this;
        }
        public Builder updateTime(java.time.LocalDateTime updateTime){
            this.obj.setUpdateTime(updateTime);
            return this;
        }
        public Builder delFlag(Integer delFlag){
            this.obj.setDelFlag(delFlag);
            return this;
        }
        public Role build(){return obj;}
    }

}
