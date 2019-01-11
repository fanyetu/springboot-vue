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
public class Menu implements Serializable {

    private static final long serialVersionUID = 1543636483285L;

    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 
    * isNullAble:1
    */
    private Integer parentId;

    /**
    * 
    * isNullAble:1
    */
    private String url;

    /**
    * 
    * isNullAble:1
    */
    private String path;

    /**
    * 
    * isNullAble:1
    */
    private String component;

    /**
    * 
    * isNullAble:1
    */
    private String name;

    /**
    * 
    * isNullAble:1
    */
    private String iconCls;

    /**
    * 
    * isNullAble:1
    */
    private Integer keepAlive;

    /**
    * 
    * isNullAble:1
    */
    private Integer requireAuth;

    /**
    * 
    * isNullAble:0,defaultVal:1
    */
    private Integer enable;

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

    public void setParentId(Integer parentId){this.parentId = parentId;}

    public Integer getParentId(){return this.parentId;}

    public void setUrl(String url){this.url = url;}

    public String getUrl(){return this.url;}

    public void setPath(String path){this.path = path;}

    public String getPath(){return this.path;}

    public void setComponent(String component){this.component = component;}

    public String getComponent(){return this.component;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setIconCls(String iconCls){this.iconCls = iconCls;}

    public String getIconCls(){return this.iconCls;}

    public void setKeepAlive(Integer keepAlive){this.keepAlive = keepAlive;}

    public Integer getKeepAlive(){return this.keepAlive;}

    public void setRequireAuth(Integer requireAuth){this.requireAuth = requireAuth;}

    public Integer getRequireAuth(){return this.requireAuth;}

    public void setEnable(Integer enable){this.enable = enable;}

    public Integer getEnable(){return this.enable;}

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
        return "Menu{" +
                "id='" + id + '\'' +
                "parentId='" + parentId + '\'' +
                "url='" + url + '\'' +
                "path='" + path + '\'' +
                "component='" + component + '\'' +
                "name='" + name + '\'' +
                "iconCls='" + iconCls + '\'' +
                "keepAlive='" + keepAlive + '\'' +
                "requireAuth='" + requireAuth + '\'' +
                "enable='" + enable + '\'' +
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

        private Menu set;

        private ConditionBuilder where;

        public UpdateBuilder set(Menu set){
            this.set = set;
            return this;
        }

        public Menu getSet(){
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

    public static class QueryBuilder extends Menu {
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

        private List<Integer> parentIdList;

        public List<Integer> getParentIdList(){return this.parentIdList;}

        private Integer parentIdSt;

        private Integer parentIdEd;

        public Integer getParentIdSt(){return this.parentIdSt;}

        public Integer getParentIdEd(){return this.parentIdEd;}

        private List<String> urlList;

        public List<String> getUrlList(){return this.urlList;}


        private List<String> fuzzyUrl;

        public List<String> getFuzzyUrl(){return this.fuzzyUrl;}

        private List<String> rightFuzzyUrl;

        public List<String> getRightFuzzyUrl(){return this.rightFuzzyUrl;}
        private List<String> pathList;

        public List<String> getPathList(){return this.pathList;}


        private List<String> fuzzyPath;

        public List<String> getFuzzyPath(){return this.fuzzyPath;}

        private List<String> rightFuzzyPath;

        public List<String> getRightFuzzyPath(){return this.rightFuzzyPath;}
        private List<String> componentList;

        public List<String> getComponentList(){return this.componentList;}


        private List<String> fuzzyComponent;

        public List<String> getFuzzyComponent(){return this.fuzzyComponent;}

        private List<String> rightFuzzyComponent;

        public List<String> getRightFuzzyComponent(){return this.rightFuzzyComponent;}
        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<String> iconClsList;

        public List<String> getIconClsList(){return this.iconClsList;}


        private List<String> fuzzyIconCls;

        public List<String> getFuzzyIconCls(){return this.fuzzyIconCls;}

        private List<String> rightFuzzyIconCls;

        public List<String> getRightFuzzyIconCls(){return this.rightFuzzyIconCls;}
        private List<Integer> keepAliveList;

        public List<Integer> getKeepAliveList(){return this.keepAliveList;}

        private Integer keepAliveSt;

        private Integer keepAliveEd;

        public Integer getKeepAliveSt(){return this.keepAliveSt;}

        public Integer getKeepAliveEd(){return this.keepAliveEd;}

        private List<Integer> requireAuthList;

        public List<Integer> getRequireAuthList(){return this.requireAuthList;}

        private Integer requireAuthSt;

        private Integer requireAuthEd;

        public Integer getRequireAuthSt(){return this.requireAuthSt;}

        public Integer getRequireAuthEd(){return this.requireAuthEd;}

        private List<Integer> enableList;

        public List<Integer> getEnableList(){return this.enableList;}

        private Integer enableSt;

        private Integer enableEd;

        public Integer getEnableSt(){return this.enableSt;}

        public Integer getEnableEd(){return this.enableEd;}

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

        public QueryBuilder parentIdBetWeen(Integer parentIdSt,Integer parentIdEd){
            this.parentIdSt = parentIdSt;
            this.parentIdEd = parentIdEd;
            return this;
        }

        public QueryBuilder parentIdGreaterEqThan(Integer parentIdSt){
            this.parentIdSt = parentIdSt;
            return this;
        }
        public QueryBuilder parentIdLessEqThan(Integer parentIdEd){
            this.parentIdEd = parentIdEd;
            return this;
        }


        public QueryBuilder parentId(Integer parentId){
            setParentId(parentId);
            return this;
        }

        public QueryBuilder parentIdList(Integer ... parentId){
            this.parentIdList = solveNullList(parentId);
            return this;
        }

        public QueryBuilder parentIdList(List<Integer> parentId){
            this.parentIdList = parentId;
            return this;
        }

        public QueryBuilder fetchParentId(){
            setFetchFields("fetchFields","parentId");
            return this;
        }

        public QueryBuilder excludeParentId(){
            setFetchFields("excludeFields","parentId");
            return this;
        }

        public QueryBuilder fuzzyUrl (List<String> fuzzyUrl){
            this.fuzzyUrl = fuzzyUrl;
            return this;
        }

        public QueryBuilder fuzzyUrl (String ... fuzzyUrl){
            this.fuzzyUrl = solveNullList(fuzzyUrl);
            return this;
        }

        public QueryBuilder rightFuzzyUrl (List<String> rightFuzzyUrl){
            this.rightFuzzyUrl = rightFuzzyUrl;
            return this;
        }

        public QueryBuilder rightFuzzyUrl (String ... rightFuzzyUrl){
            this.rightFuzzyUrl = solveNullList(rightFuzzyUrl);
            return this;
        }

        public QueryBuilder url(String url){
            setUrl(url);
            return this;
        }

        public QueryBuilder urlList(String ... url){
            this.urlList = solveNullList(url);
            return this;
        }

        public QueryBuilder urlList(List<String> url){
            this.urlList = url;
            return this;
        }

        public QueryBuilder fetchUrl(){
            setFetchFields("fetchFields","url");
            return this;
        }

        public QueryBuilder excludeUrl(){
            setFetchFields("excludeFields","url");
            return this;
        }

        public QueryBuilder fuzzyPath (List<String> fuzzyPath){
            this.fuzzyPath = fuzzyPath;
            return this;
        }

        public QueryBuilder fuzzyPath (String ... fuzzyPath){
            this.fuzzyPath = solveNullList(fuzzyPath);
            return this;
        }

        public QueryBuilder rightFuzzyPath (List<String> rightFuzzyPath){
            this.rightFuzzyPath = rightFuzzyPath;
            return this;
        }

        public QueryBuilder rightFuzzyPath (String ... rightFuzzyPath){
            this.rightFuzzyPath = solveNullList(rightFuzzyPath);
            return this;
        }

        public QueryBuilder path(String path){
            setPath(path);
            return this;
        }

        public QueryBuilder pathList(String ... path){
            this.pathList = solveNullList(path);
            return this;
        }

        public QueryBuilder pathList(List<String> path){
            this.pathList = path;
            return this;
        }

        public QueryBuilder fetchPath(){
            setFetchFields("fetchFields","path");
            return this;
        }

        public QueryBuilder excludePath(){
            setFetchFields("excludeFields","path");
            return this;
        }

        public QueryBuilder fuzzyComponent (List<String> fuzzyComponent){
            this.fuzzyComponent = fuzzyComponent;
            return this;
        }

        public QueryBuilder fuzzyComponent (String ... fuzzyComponent){
            this.fuzzyComponent = solveNullList(fuzzyComponent);
            return this;
        }

        public QueryBuilder rightFuzzyComponent (List<String> rightFuzzyComponent){
            this.rightFuzzyComponent = rightFuzzyComponent;
            return this;
        }

        public QueryBuilder rightFuzzyComponent (String ... rightFuzzyComponent){
            this.rightFuzzyComponent = solveNullList(rightFuzzyComponent);
            return this;
        }

        public QueryBuilder component(String component){
            setComponent(component);
            return this;
        }

        public QueryBuilder componentList(String ... component){
            this.componentList = solveNullList(component);
            return this;
        }

        public QueryBuilder componentList(List<String> component){
            this.componentList = component;
            return this;
        }

        public QueryBuilder fetchComponent(){
            setFetchFields("fetchFields","component");
            return this;
        }

        public QueryBuilder excludeComponent(){
            setFetchFields("excludeFields","component");
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

        public QueryBuilder fuzzyIconCls (List<String> fuzzyIconCls){
            this.fuzzyIconCls = fuzzyIconCls;
            return this;
        }

        public QueryBuilder fuzzyIconCls (String ... fuzzyIconCls){
            this.fuzzyIconCls = solveNullList(fuzzyIconCls);
            return this;
        }

        public QueryBuilder rightFuzzyIconCls (List<String> rightFuzzyIconCls){
            this.rightFuzzyIconCls = rightFuzzyIconCls;
            return this;
        }

        public QueryBuilder rightFuzzyIconCls (String ... rightFuzzyIconCls){
            this.rightFuzzyIconCls = solveNullList(rightFuzzyIconCls);
            return this;
        }

        public QueryBuilder iconCls(String iconCls){
            setIconCls(iconCls);
            return this;
        }

        public QueryBuilder iconClsList(String ... iconCls){
            this.iconClsList = solveNullList(iconCls);
            return this;
        }

        public QueryBuilder iconClsList(List<String> iconCls){
            this.iconClsList = iconCls;
            return this;
        }

        public QueryBuilder fetchIconCls(){
            setFetchFields("fetchFields","iconCls");
            return this;
        }

        public QueryBuilder excludeIconCls(){
            setFetchFields("excludeFields","iconCls");
            return this;
        }

        public QueryBuilder keepAliveBetWeen(Integer keepAliveSt,Integer keepAliveEd){
            this.keepAliveSt = keepAliveSt;
            this.keepAliveEd = keepAliveEd;
            return this;
        }

        public QueryBuilder keepAliveGreaterEqThan(Integer keepAliveSt){
            this.keepAliveSt = keepAliveSt;
            return this;
        }
        public QueryBuilder keepAliveLessEqThan(Integer keepAliveEd){
            this.keepAliveEd = keepAliveEd;
            return this;
        }


        public QueryBuilder keepAlive(Integer keepAlive){
            setKeepAlive(keepAlive);
            return this;
        }

        public QueryBuilder keepAliveList(Integer ... keepAlive){
            this.keepAliveList = solveNullList(keepAlive);
            return this;
        }

        public QueryBuilder keepAliveList(List<Integer> keepAlive){
            this.keepAliveList = keepAlive;
            return this;
        }

        public QueryBuilder fetchKeepAlive(){
            setFetchFields("fetchFields","keepAlive");
            return this;
        }

        public QueryBuilder excludeKeepAlive(){
            setFetchFields("excludeFields","keepAlive");
            return this;
        }

        public QueryBuilder requireAuthBetWeen(Integer requireAuthSt,Integer requireAuthEd){
            this.requireAuthSt = requireAuthSt;
            this.requireAuthEd = requireAuthEd;
            return this;
        }

        public QueryBuilder requireAuthGreaterEqThan(Integer requireAuthSt){
            this.requireAuthSt = requireAuthSt;
            return this;
        }
        public QueryBuilder requireAuthLessEqThan(Integer requireAuthEd){
            this.requireAuthEd = requireAuthEd;
            return this;
        }


        public QueryBuilder requireAuth(Integer requireAuth){
            setRequireAuth(requireAuth);
            return this;
        }

        public QueryBuilder requireAuthList(Integer ... requireAuth){
            this.requireAuthList = solveNullList(requireAuth);
            return this;
        }

        public QueryBuilder requireAuthList(List<Integer> requireAuth){
            this.requireAuthList = requireAuth;
            return this;
        }

        public QueryBuilder fetchRequireAuth(){
            setFetchFields("fetchFields","requireAuth");
            return this;
        }

        public QueryBuilder excludeRequireAuth(){
            setFetchFields("excludeFields","requireAuth");
            return this;
        }

        public QueryBuilder enableBetWeen(Integer enableSt,Integer enableEd){
            this.enableSt = enableSt;
            this.enableEd = enableEd;
            return this;
        }

        public QueryBuilder enableGreaterEqThan(Integer enableSt){
            this.enableSt = enableSt;
            return this;
        }
        public QueryBuilder enableLessEqThan(Integer enableEd){
            this.enableEd = enableEd;
            return this;
        }


        public QueryBuilder enable(Integer enable){
            setEnable(enable);
            return this;
        }

        public QueryBuilder enableList(Integer ... enable){
            this.enableList = solveNullList(enable);
            return this;
        }

        public QueryBuilder enableList(List<Integer> enable){
            this.enableList = enable;
            return this;
        }

        public QueryBuilder fetchEnable(){
            setFetchFields("fetchFields","enable");
            return this;
        }

        public QueryBuilder excludeEnable(){
            setFetchFields("excludeFields","enable");
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

        public Menu build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<Integer> parentIdList;

        public List<Integer> getParentIdList(){return this.parentIdList;}

        private Integer parentIdSt;

        private Integer parentIdEd;

        public Integer getParentIdSt(){return this.parentIdSt;}

        public Integer getParentIdEd(){return this.parentIdEd;}

        private List<String> urlList;

        public List<String> getUrlList(){return this.urlList;}


        private List<String> fuzzyUrl;

        public List<String> getFuzzyUrl(){return this.fuzzyUrl;}

        private List<String> rightFuzzyUrl;

        public List<String> getRightFuzzyUrl(){return this.rightFuzzyUrl;}
        private List<String> pathList;

        public List<String> getPathList(){return this.pathList;}


        private List<String> fuzzyPath;

        public List<String> getFuzzyPath(){return this.fuzzyPath;}

        private List<String> rightFuzzyPath;

        public List<String> getRightFuzzyPath(){return this.rightFuzzyPath;}
        private List<String> componentList;

        public List<String> getComponentList(){return this.componentList;}


        private List<String> fuzzyComponent;

        public List<String> getFuzzyComponent(){return this.fuzzyComponent;}

        private List<String> rightFuzzyComponent;

        public List<String> getRightFuzzyComponent(){return this.rightFuzzyComponent;}
        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<String> iconClsList;

        public List<String> getIconClsList(){return this.iconClsList;}


        private List<String> fuzzyIconCls;

        public List<String> getFuzzyIconCls(){return this.fuzzyIconCls;}

        private List<String> rightFuzzyIconCls;

        public List<String> getRightFuzzyIconCls(){return this.rightFuzzyIconCls;}
        private List<Integer> keepAliveList;

        public List<Integer> getKeepAliveList(){return this.keepAliveList;}

        private Integer keepAliveSt;

        private Integer keepAliveEd;

        public Integer getKeepAliveSt(){return this.keepAliveSt;}

        public Integer getKeepAliveEd(){return this.keepAliveEd;}

        private List<Integer> requireAuthList;

        public List<Integer> getRequireAuthList(){return this.requireAuthList;}

        private Integer requireAuthSt;

        private Integer requireAuthEd;

        public Integer getRequireAuthSt(){return this.requireAuthSt;}

        public Integer getRequireAuthEd(){return this.requireAuthEd;}

        private List<Integer> enableList;

        public List<Integer> getEnableList(){return this.enableList;}

        private Integer enableSt;

        private Integer enableEd;

        public Integer getEnableSt(){return this.enableSt;}

        public Integer getEnableEd(){return this.enableEd;}

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

        public ConditionBuilder parentIdBetWeen(Integer parentIdSt,Integer parentIdEd){
            this.parentIdSt = parentIdSt;
            this.parentIdEd = parentIdEd;
            return this;
        }

        public ConditionBuilder parentIdGreaterEqThan(Integer parentIdSt){
            this.parentIdSt = parentIdSt;
            return this;
        }
        public ConditionBuilder parentIdLessEqThan(Integer parentIdEd){
            this.parentIdEd = parentIdEd;
            return this;
        }


        public ConditionBuilder parentIdList(Integer ... parentId){
            this.parentIdList = solveNullList(parentId);
            return this;
        }

        public ConditionBuilder parentIdList(List<Integer> parentId){
            this.parentIdList = parentId;
            return this;
        }

        public ConditionBuilder fuzzyUrl (List<String> fuzzyUrl){
            this.fuzzyUrl = fuzzyUrl;
            return this;
        }

        public ConditionBuilder fuzzyUrl (String ... fuzzyUrl){
            this.fuzzyUrl = solveNullList(fuzzyUrl);
            return this;
        }

        public ConditionBuilder rightFuzzyUrl (List<String> rightFuzzyUrl){
            this.rightFuzzyUrl = rightFuzzyUrl;
            return this;
        }

        public ConditionBuilder rightFuzzyUrl (String ... rightFuzzyUrl){
            this.rightFuzzyUrl = solveNullList(rightFuzzyUrl);
            return this;
        }

        public ConditionBuilder urlList(String ... url){
            this.urlList = solveNullList(url);
            return this;
        }

        public ConditionBuilder urlList(List<String> url){
            this.urlList = url;
            return this;
        }

        public ConditionBuilder fuzzyPath (List<String> fuzzyPath){
            this.fuzzyPath = fuzzyPath;
            return this;
        }

        public ConditionBuilder fuzzyPath (String ... fuzzyPath){
            this.fuzzyPath = solveNullList(fuzzyPath);
            return this;
        }

        public ConditionBuilder rightFuzzyPath (List<String> rightFuzzyPath){
            this.rightFuzzyPath = rightFuzzyPath;
            return this;
        }

        public ConditionBuilder rightFuzzyPath (String ... rightFuzzyPath){
            this.rightFuzzyPath = solveNullList(rightFuzzyPath);
            return this;
        }

        public ConditionBuilder pathList(String ... path){
            this.pathList = solveNullList(path);
            return this;
        }

        public ConditionBuilder pathList(List<String> path){
            this.pathList = path;
            return this;
        }

        public ConditionBuilder fuzzyComponent (List<String> fuzzyComponent){
            this.fuzzyComponent = fuzzyComponent;
            return this;
        }

        public ConditionBuilder fuzzyComponent (String ... fuzzyComponent){
            this.fuzzyComponent = solveNullList(fuzzyComponent);
            return this;
        }

        public ConditionBuilder rightFuzzyComponent (List<String> rightFuzzyComponent){
            this.rightFuzzyComponent = rightFuzzyComponent;
            return this;
        }

        public ConditionBuilder rightFuzzyComponent (String ... rightFuzzyComponent){
            this.rightFuzzyComponent = solveNullList(rightFuzzyComponent);
            return this;
        }

        public ConditionBuilder componentList(String ... component){
            this.componentList = solveNullList(component);
            return this;
        }

        public ConditionBuilder componentList(List<String> component){
            this.componentList = component;
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

        public ConditionBuilder fuzzyIconCls (List<String> fuzzyIconCls){
            this.fuzzyIconCls = fuzzyIconCls;
            return this;
        }

        public ConditionBuilder fuzzyIconCls (String ... fuzzyIconCls){
            this.fuzzyIconCls = solveNullList(fuzzyIconCls);
            return this;
        }

        public ConditionBuilder rightFuzzyIconCls (List<String> rightFuzzyIconCls){
            this.rightFuzzyIconCls = rightFuzzyIconCls;
            return this;
        }

        public ConditionBuilder rightFuzzyIconCls (String ... rightFuzzyIconCls){
            this.rightFuzzyIconCls = solveNullList(rightFuzzyIconCls);
            return this;
        }

        public ConditionBuilder iconClsList(String ... iconCls){
            this.iconClsList = solveNullList(iconCls);
            return this;
        }

        public ConditionBuilder iconClsList(List<String> iconCls){
            this.iconClsList = iconCls;
            return this;
        }

        public ConditionBuilder keepAliveBetWeen(Integer keepAliveSt,Integer keepAliveEd){
            this.keepAliveSt = keepAliveSt;
            this.keepAliveEd = keepAliveEd;
            return this;
        }

        public ConditionBuilder keepAliveGreaterEqThan(Integer keepAliveSt){
            this.keepAliveSt = keepAliveSt;
            return this;
        }
        public ConditionBuilder keepAliveLessEqThan(Integer keepAliveEd){
            this.keepAliveEd = keepAliveEd;
            return this;
        }


        public ConditionBuilder keepAliveList(Integer ... keepAlive){
            this.keepAliveList = solveNullList(keepAlive);
            return this;
        }

        public ConditionBuilder keepAliveList(List<Integer> keepAlive){
            this.keepAliveList = keepAlive;
            return this;
        }

        public ConditionBuilder requireAuthBetWeen(Integer requireAuthSt,Integer requireAuthEd){
            this.requireAuthSt = requireAuthSt;
            this.requireAuthEd = requireAuthEd;
            return this;
        }

        public ConditionBuilder requireAuthGreaterEqThan(Integer requireAuthSt){
            this.requireAuthSt = requireAuthSt;
            return this;
        }
        public ConditionBuilder requireAuthLessEqThan(Integer requireAuthEd){
            this.requireAuthEd = requireAuthEd;
            return this;
        }


        public ConditionBuilder requireAuthList(Integer ... requireAuth){
            this.requireAuthList = solveNullList(requireAuth);
            return this;
        }

        public ConditionBuilder requireAuthList(List<Integer> requireAuth){
            this.requireAuthList = requireAuth;
            return this;
        }

        public ConditionBuilder enableBetWeen(Integer enableSt,Integer enableEd){
            this.enableSt = enableSt;
            this.enableEd = enableEd;
            return this;
        }

        public ConditionBuilder enableGreaterEqThan(Integer enableSt){
            this.enableSt = enableSt;
            return this;
        }
        public ConditionBuilder enableLessEqThan(Integer enableEd){
            this.enableEd = enableEd;
            return this;
        }


        public ConditionBuilder enableList(Integer ... enable){
            this.enableList = solveNullList(enable);
            return this;
        }

        public ConditionBuilder enableList(List<Integer> enable){
            this.enableList = enable;
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

        private Menu obj;

        public Builder(){
            this.obj = new Menu();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder parentId(Integer parentId){
            this.obj.setParentId(parentId);
            return this;
        }
        public Builder url(String url){
            this.obj.setUrl(url);
            return this;
        }
        public Builder path(String path){
            this.obj.setPath(path);
            return this;
        }
        public Builder component(String component){
            this.obj.setComponent(component);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder iconCls(String iconCls){
            this.obj.setIconCls(iconCls);
            return this;
        }
        public Builder keepAlive(Integer keepAlive){
            this.obj.setKeepAlive(keepAlive);
            return this;
        }
        public Builder requireAuth(Integer requireAuth){
            this.obj.setRequireAuth(requireAuth);
            return this;
        }
        public Builder enable(Integer enable){
            this.obj.setEnable(enable);
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
        public Menu build(){return obj;}
    }

}
