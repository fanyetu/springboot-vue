package com.fanyetu.core.auth.entity;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author zhanghaonan
*/
@ToString
public class User implements Serializable {

    private static final long serialVersionUID = 1543332464609L;

    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    /**********************************************************************************************************/

    /**
    * 主键
    * 用户id
    * isNullAble:0
    */
    private Integer id;

    /**
    * 用户姓名
    * isNullAble:0
    */
    private String name;

    /**
    * 
    * isNullAble:1
    */
    private String gender;

    /**
    * 用户电话
    * isNullAble:1
    */
    private String phone;

    /**
    * 用户地址
    * isNullAble:1
    */
    private String address;

    /**
    * 是否启用
    * isNullAble:0
    */
    private Integer enable;

    /**
    * 用户名
    * isNullAble:0
    */
    private String username;

    /**
    * 密码
    * isNullAble:0
    */
    private String password;

    /**
    * 头像
    * isNullAble:1
    */
    private String avatar;

    /**
    * 备注
    * isNullAble:1
    */
    private String remark;

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
    * isNullAble:0,defaultVal:0
    */
    private Integer delFlag;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setGender(String gender){this.gender = gender;}

    public String getGender(){return this.gender;}

    public void setPhone(String phone){this.phone = phone;}

    public String getPhone(){return this.phone;}

    public void setAddress(String address){this.address = address;}

    public String getAddress(){return this.address;}

    public void setEnable(Integer enable){this.enable = enable;}

    public Integer getEnable(){return this.enable;}

    public void setUsername(String username){this.username = username;}

    public String getUsername(){return this.username;}

    public void setPassword(String password){this.password = password;}

    public String getPassword(){return this.password;}

    public void setAvatar(String avatar){this.avatar = avatar;}

    public String getAvatar(){return this.avatar;}

    public void setRemark(String remark){this.remark = remark;}

    public String getRemark(){return this.remark;}

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

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private User set;

        private ConditionBuilder where;

        public UpdateBuilder set(User set){
            this.set = set;
            return this;
        }

        public User getSet(){
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

    public static class QueryBuilder extends User{
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
        private List<String> genderList;

        public List<String> getGenderList(){return this.genderList;}


        private List<String> fuzzyGender;

        public List<String> getFuzzyGender(){return this.fuzzyGender;}

        private List<String> rightFuzzyGender;

        public List<String> getRightFuzzyGender(){return this.rightFuzzyGender;}
        private List<String> phoneList;

        public List<String> getPhoneList(){return this.phoneList;}


        private List<String> fuzzyPhone;

        public List<String> getFuzzyPhone(){return this.fuzzyPhone;}

        private List<String> rightFuzzyPhone;

        public List<String> getRightFuzzyPhone(){return this.rightFuzzyPhone;}
        private List<String> addressList;

        public List<String> getAddressList(){return this.addressList;}


        private List<String> fuzzyAddress;

        public List<String> getFuzzyAddress(){return this.fuzzyAddress;}

        private List<String> rightFuzzyAddress;

        public List<String> getRightFuzzyAddress(){return this.rightFuzzyAddress;}
        private List<Integer> enableList;

        public List<Integer> getEnableList(){return this.enableList;}

        private Integer enableSt;

        private Integer enableEd;

        public Integer getEnableSt(){return this.enableSt;}

        public Integer getEnableEd(){return this.enableEd;}

        private List<String> usernameList;

        public List<String> getUsernameList(){return this.usernameList;}


        private List<String> fuzzyUsername;

        public List<String> getFuzzyUsername(){return this.fuzzyUsername;}

        private List<String> rightFuzzyUsername;

        public List<String> getRightFuzzyUsername(){return this.rightFuzzyUsername;}
        private List<String> passwordList;

        public List<String> getPasswordList(){return this.passwordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}
        private List<String> avatarList;

        public List<String> getAvatarList(){return this.avatarList;}


        private List<String> fuzzyAvatar;

        public List<String> getFuzzyAvatar(){return this.fuzzyAvatar;}

        private List<String> rightFuzzyAvatar;

        public List<String> getRightFuzzyAvatar(){return this.rightFuzzyAvatar;}
        private List<String> remarkList;

        public List<String> getRemarkList(){return this.remarkList;}


        private List<String> fuzzyRemark;

        public List<String> getFuzzyRemark(){return this.fuzzyRemark;}

        private List<String> rightFuzzyRemark;

        public List<String> getRightFuzzyRemark(){return this.rightFuzzyRemark;}
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

        public QueryBuilder fuzzyGender (List<String> fuzzyGender){
            this.fuzzyGender = fuzzyGender;
            return this;
        }

        public QueryBuilder fuzzyGender (String ... fuzzyGender){
            this.fuzzyGender = solveNullList(fuzzyGender);
            return this;
        }

        public QueryBuilder rightFuzzyGender (List<String> rightFuzzyGender){
            this.rightFuzzyGender = rightFuzzyGender;
            return this;
        }

        public QueryBuilder rightFuzzyGender (String ... rightFuzzyGender){
            this.rightFuzzyGender = solveNullList(rightFuzzyGender);
            return this;
        }

        public QueryBuilder gender(String gender){
            setGender(gender);
            return this;
        }

        public QueryBuilder genderList(String ... gender){
            this.genderList = solveNullList(gender);
            return this;
        }

        public QueryBuilder genderList(List<String> gender){
            this.genderList = gender;
            return this;
        }

        public QueryBuilder fetchGender(){
            setFetchFields("fetchFields","gender");
            return this;
        }

        public QueryBuilder excludeGender(){
            setFetchFields("excludeFields","gender");
            return this;
        }

        public QueryBuilder fuzzyPhone (List<String> fuzzyPhone){
            this.fuzzyPhone = fuzzyPhone;
            return this;
        }

        public QueryBuilder fuzzyPhone (String ... fuzzyPhone){
            this.fuzzyPhone = solveNullList(fuzzyPhone);
            return this;
        }

        public QueryBuilder rightFuzzyPhone (List<String> rightFuzzyPhone){
            this.rightFuzzyPhone = rightFuzzyPhone;
            return this;
        }

        public QueryBuilder rightFuzzyPhone (String ... rightFuzzyPhone){
            this.rightFuzzyPhone = solveNullList(rightFuzzyPhone);
            return this;
        }

        public QueryBuilder phone(String phone){
            setPhone(phone);
            return this;
        }

        public QueryBuilder phoneList(String ... phone){
            this.phoneList = solveNullList(phone);
            return this;
        }

        public QueryBuilder phoneList(List<String> phone){
            this.phoneList = phone;
            return this;
        }

        public QueryBuilder fetchPhone(){
            setFetchFields("fetchFields","phone");
            return this;
        }

        public QueryBuilder excludePhone(){
            setFetchFields("excludeFields","phone");
            return this;
        }

        public QueryBuilder fuzzyAddress (List<String> fuzzyAddress){
            this.fuzzyAddress = fuzzyAddress;
            return this;
        }

        public QueryBuilder fuzzyAddress (String ... fuzzyAddress){
            this.fuzzyAddress = solveNullList(fuzzyAddress);
            return this;
        }

        public QueryBuilder rightFuzzyAddress (List<String> rightFuzzyAddress){
            this.rightFuzzyAddress = rightFuzzyAddress;
            return this;
        }

        public QueryBuilder rightFuzzyAddress (String ... rightFuzzyAddress){
            this.rightFuzzyAddress = solveNullList(rightFuzzyAddress);
            return this;
        }

        public QueryBuilder address(String address){
            setAddress(address);
            return this;
        }

        public QueryBuilder addressList(String ... address){
            this.addressList = solveNullList(address);
            return this;
        }

        public QueryBuilder addressList(List<String> address){
            this.addressList = address;
            return this;
        }

        public QueryBuilder fetchAddress(){
            setFetchFields("fetchFields","address");
            return this;
        }

        public QueryBuilder excludeAddress(){
            setFetchFields("excludeFields","address");
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

        public QueryBuilder fuzzyUsername (List<String> fuzzyUsername){
            this.fuzzyUsername = fuzzyUsername;
            return this;
        }

        public QueryBuilder fuzzyUsername (String ... fuzzyUsername){
            this.fuzzyUsername = solveNullList(fuzzyUsername);
            return this;
        }

        public QueryBuilder rightFuzzyUsername (List<String> rightFuzzyUsername){
            this.rightFuzzyUsername = rightFuzzyUsername;
            return this;
        }

        public QueryBuilder rightFuzzyUsername (String ... rightFuzzyUsername){
            this.rightFuzzyUsername = solveNullList(rightFuzzyUsername);
            return this;
        }

        public QueryBuilder username(String username){
            setUsername(username);
            return this;
        }

        public QueryBuilder usernameList(String ... username){
            this.usernameList = solveNullList(username);
            return this;
        }

        public QueryBuilder usernameList(List<String> username){
            this.usernameList = username;
            return this;
        }

        public QueryBuilder fetchUsername(){
            setFetchFields("fetchFields","username");
            return this;
        }

        public QueryBuilder excludeUsername(){
            setFetchFields("excludeFields","username");
            return this;
        }

        public QueryBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public QueryBuilder fuzzyPassword (String ... fuzzyPassword){
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public QueryBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public QueryBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public QueryBuilder password(String password){
            setPassword(password);
            return this;
        }

        public QueryBuilder passwordList(String ... password){
            this.passwordList = solveNullList(password);
            return this;
        }

        public QueryBuilder passwordList(List<String> password){
            this.passwordList = password;
            return this;
        }

        public QueryBuilder fetchPassword(){
            setFetchFields("fetchFields","password");
            return this;
        }

        public QueryBuilder excludePassword(){
            setFetchFields("excludeFields","password");
            return this;
        }

        public QueryBuilder fuzzyAvatar (List<String> fuzzyAvatar){
            this.fuzzyAvatar = fuzzyAvatar;
            return this;
        }

        public QueryBuilder fuzzyAvatar (String ... fuzzyAvatar){
            this.fuzzyAvatar = solveNullList(fuzzyAvatar);
            return this;
        }

        public QueryBuilder rightFuzzyAvatar (List<String> rightFuzzyAvatar){
            this.rightFuzzyAvatar = rightFuzzyAvatar;
            return this;
        }

        public QueryBuilder rightFuzzyAvatar (String ... rightFuzzyAvatar){
            this.rightFuzzyAvatar = solveNullList(rightFuzzyAvatar);
            return this;
        }

        public QueryBuilder avatar(String avatar){
            setAvatar(avatar);
            return this;
        }

        public QueryBuilder avatarList(String ... avatar){
            this.avatarList = solveNullList(avatar);
            return this;
        }

        public QueryBuilder avatarList(List<String> avatar){
            this.avatarList = avatar;
            return this;
        }

        public QueryBuilder fetchAvatar(){
            setFetchFields("fetchFields","avatar");
            return this;
        }

        public QueryBuilder excludeAvatar(){
            setFetchFields("excludeFields","avatar");
            return this;
        }

        public QueryBuilder fuzzyRemark (List<String> fuzzyRemark){
            this.fuzzyRemark = fuzzyRemark;
            return this;
        }

        public QueryBuilder fuzzyRemark (String ... fuzzyRemark){
            this.fuzzyRemark = solveNullList(fuzzyRemark);
            return this;
        }

        public QueryBuilder rightFuzzyRemark (List<String> rightFuzzyRemark){
            this.rightFuzzyRemark = rightFuzzyRemark;
            return this;
        }

        public QueryBuilder rightFuzzyRemark (String ... rightFuzzyRemark){
            this.rightFuzzyRemark = solveNullList(rightFuzzyRemark);
            return this;
        }

        public QueryBuilder remark(String remark){
            setRemark(remark);
            return this;
        }

        public QueryBuilder remarkList(String ... remark){
            this.remarkList = solveNullList(remark);
            return this;
        }

        public QueryBuilder remarkList(List<String> remark){
            this.remarkList = remark;
            return this;
        }

        public QueryBuilder fetchRemark(){
            setFetchFields("fetchFields","remark");
            return this;
        }

        public QueryBuilder excludeRemark(){
            setFetchFields("excludeFields","remark");
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

        public User build(){return this;}
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
        private List<String> genderList;

        public List<String> getGenderList(){return this.genderList;}


        private List<String> fuzzyGender;

        public List<String> getFuzzyGender(){return this.fuzzyGender;}

        private List<String> rightFuzzyGender;

        public List<String> getRightFuzzyGender(){return this.rightFuzzyGender;}
        private List<String> phoneList;

        public List<String> getPhoneList(){return this.phoneList;}


        private List<String> fuzzyPhone;

        public List<String> getFuzzyPhone(){return this.fuzzyPhone;}

        private List<String> rightFuzzyPhone;

        public List<String> getRightFuzzyPhone(){return this.rightFuzzyPhone;}
        private List<String> addressList;

        public List<String> getAddressList(){return this.addressList;}


        private List<String> fuzzyAddress;

        public List<String> getFuzzyAddress(){return this.fuzzyAddress;}

        private List<String> rightFuzzyAddress;

        public List<String> getRightFuzzyAddress(){return this.rightFuzzyAddress;}
        private List<Integer> enableList;

        public List<Integer> getEnableList(){return this.enableList;}

        private Integer enableSt;

        private Integer enableEd;

        public Integer getEnableSt(){return this.enableSt;}

        public Integer getEnableEd(){return this.enableEd;}

        private List<String> usernameList;

        public List<String> getUsernameList(){return this.usernameList;}


        private List<String> fuzzyUsername;

        public List<String> getFuzzyUsername(){return this.fuzzyUsername;}

        private List<String> rightFuzzyUsername;

        public List<String> getRightFuzzyUsername(){return this.rightFuzzyUsername;}
        private List<String> passwordList;

        public List<String> getPasswordList(){return this.passwordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}
        private List<String> avatarList;

        public List<String> getAvatarList(){return this.avatarList;}


        private List<String> fuzzyAvatar;

        public List<String> getFuzzyAvatar(){return this.fuzzyAvatar;}

        private List<String> rightFuzzyAvatar;

        public List<String> getRightFuzzyAvatar(){return this.rightFuzzyAvatar;}
        private List<String> remarkList;

        public List<String> getRemarkList(){return this.remarkList;}


        private List<String> fuzzyRemark;

        public List<String> getFuzzyRemark(){return this.fuzzyRemark;}

        private List<String> rightFuzzyRemark;

        public List<String> getRightFuzzyRemark(){return this.rightFuzzyRemark;}
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

        public ConditionBuilder fuzzyGender (List<String> fuzzyGender){
            this.fuzzyGender = fuzzyGender;
            return this;
        }

        public ConditionBuilder fuzzyGender (String ... fuzzyGender){
            this.fuzzyGender = solveNullList(fuzzyGender);
            return this;
        }

        public ConditionBuilder rightFuzzyGender (List<String> rightFuzzyGender){
            this.rightFuzzyGender = rightFuzzyGender;
            return this;
        }

        public ConditionBuilder rightFuzzyGender (String ... rightFuzzyGender){
            this.rightFuzzyGender = solveNullList(rightFuzzyGender);
            return this;
        }

        public ConditionBuilder genderList(String ... gender){
            this.genderList = solveNullList(gender);
            return this;
        }

        public ConditionBuilder genderList(List<String> gender){
            this.genderList = gender;
            return this;
        }

        public ConditionBuilder fuzzyPhone (List<String> fuzzyPhone){
            this.fuzzyPhone = fuzzyPhone;
            return this;
        }

        public ConditionBuilder fuzzyPhone (String ... fuzzyPhone){
            this.fuzzyPhone = solveNullList(fuzzyPhone);
            return this;
        }

        public ConditionBuilder rightFuzzyPhone (List<String> rightFuzzyPhone){
            this.rightFuzzyPhone = rightFuzzyPhone;
            return this;
        }

        public ConditionBuilder rightFuzzyPhone (String ... rightFuzzyPhone){
            this.rightFuzzyPhone = solveNullList(rightFuzzyPhone);
            return this;
        }

        public ConditionBuilder phoneList(String ... phone){
            this.phoneList = solveNullList(phone);
            return this;
        }

        public ConditionBuilder phoneList(List<String> phone){
            this.phoneList = phone;
            return this;
        }

        public ConditionBuilder fuzzyAddress (List<String> fuzzyAddress){
            this.fuzzyAddress = fuzzyAddress;
            return this;
        }

        public ConditionBuilder fuzzyAddress (String ... fuzzyAddress){
            this.fuzzyAddress = solveNullList(fuzzyAddress);
            return this;
        }

        public ConditionBuilder rightFuzzyAddress (List<String> rightFuzzyAddress){
            this.rightFuzzyAddress = rightFuzzyAddress;
            return this;
        }

        public ConditionBuilder rightFuzzyAddress (String ... rightFuzzyAddress){
            this.rightFuzzyAddress = solveNullList(rightFuzzyAddress);
            return this;
        }

        public ConditionBuilder addressList(String ... address){
            this.addressList = solveNullList(address);
            return this;
        }

        public ConditionBuilder addressList(List<String> address){
            this.addressList = address;
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

        public ConditionBuilder fuzzyUsername (List<String> fuzzyUsername){
            this.fuzzyUsername = fuzzyUsername;
            return this;
        }

        public ConditionBuilder fuzzyUsername (String ... fuzzyUsername){
            this.fuzzyUsername = solveNullList(fuzzyUsername);
            return this;
        }

        public ConditionBuilder rightFuzzyUsername (List<String> rightFuzzyUsername){
            this.rightFuzzyUsername = rightFuzzyUsername;
            return this;
        }

        public ConditionBuilder rightFuzzyUsername (String ... rightFuzzyUsername){
            this.rightFuzzyUsername = solveNullList(rightFuzzyUsername);
            return this;
        }

        public ConditionBuilder usernameList(String ... username){
            this.usernameList = solveNullList(username);
            return this;
        }

        public ConditionBuilder usernameList(List<String> username){
            this.usernameList = username;
            return this;
        }

        public ConditionBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public ConditionBuilder fuzzyPassword (String ... fuzzyPassword){
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public ConditionBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public ConditionBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public ConditionBuilder passwordList(String ... password){
            this.passwordList = solveNullList(password);
            return this;
        }

        public ConditionBuilder passwordList(List<String> password){
            this.passwordList = password;
            return this;
        }

        public ConditionBuilder fuzzyAvatar (List<String> fuzzyAvatar){
            this.fuzzyAvatar = fuzzyAvatar;
            return this;
        }

        public ConditionBuilder fuzzyAvatar (String ... fuzzyAvatar){
            this.fuzzyAvatar = solveNullList(fuzzyAvatar);
            return this;
        }

        public ConditionBuilder rightFuzzyAvatar (List<String> rightFuzzyAvatar){
            this.rightFuzzyAvatar = rightFuzzyAvatar;
            return this;
        }

        public ConditionBuilder rightFuzzyAvatar (String ... rightFuzzyAvatar){
            this.rightFuzzyAvatar = solveNullList(rightFuzzyAvatar);
            return this;
        }

        public ConditionBuilder avatarList(String ... avatar){
            this.avatarList = solveNullList(avatar);
            return this;
        }

        public ConditionBuilder avatarList(List<String> avatar){
            this.avatarList = avatar;
            return this;
        }

        public ConditionBuilder fuzzyRemark (List<String> fuzzyRemark){
            this.fuzzyRemark = fuzzyRemark;
            return this;
        }

        public ConditionBuilder fuzzyRemark (String ... fuzzyRemark){
            this.fuzzyRemark = solveNullList(fuzzyRemark);
            return this;
        }

        public ConditionBuilder rightFuzzyRemark (List<String> rightFuzzyRemark){
            this.rightFuzzyRemark = rightFuzzyRemark;
            return this;
        }

        public ConditionBuilder rightFuzzyRemark (String ... rightFuzzyRemark){
            this.rightFuzzyRemark = solveNullList(rightFuzzyRemark);
            return this;
        }

        public ConditionBuilder remarkList(String ... remark){
            this.remarkList = solveNullList(remark);
            return this;
        }

        public ConditionBuilder remarkList(List<String> remark){
            this.remarkList = remark;
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

        private User obj;

        public Builder(){
            this.obj = new User();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder gender(String gender){
            this.obj.setGender(gender);
            return this;
        }
        public Builder phone(String phone){
            this.obj.setPhone(phone);
            return this;
        }
        public Builder address(String address){
            this.obj.setAddress(address);
            return this;
        }
        public Builder enable(Integer enable){
            this.obj.setEnable(enable);
            return this;
        }
        public Builder username(String username){
            this.obj.setUsername(username);
            return this;
        }
        public Builder password(String password){
            this.obj.setPassword(password);
            return this;
        }
        public Builder avatar(String avatar){
            this.obj.setAvatar(avatar);
            return this;
        }
        public Builder remark(String remark){
            this.obj.setRemark(remark);
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
        public User build(){return obj;}
    }

}
