package com.joker.springboot.base.dao.entity;

import java.util.Date;

public class UpmsUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_user.user_id
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_user.name
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_user.login_id
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    private String loginId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_user.password
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_user.salt
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    private String salt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_user.mobile_no
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    private String mobileNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_user.email
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_user.status
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_user.version
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    private Integer version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_user.created_by
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    private String createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_user.created_time
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    private Date createdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_user.last_upd_by
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    private String lastUpdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_user.last_upd_time
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    private Date lastUpdTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_user.user_id
     *
     * @return the value of upms_user.user_id
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_user.user_id
     *
     * @param userId the value for upms_user.user_id
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_user.name
     *
     * @return the value of upms_user.name
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_user.name
     *
     * @param name the value for upms_user.name
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_user.login_id
     *
     * @return the value of upms_user.login_id
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_user.login_id
     *
     * @param loginId the value for upms_user.login_id
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_user.password
     *
     * @return the value of upms_user.password
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_user.password
     *
     * @param password the value for upms_user.password
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_user.salt
     *
     * @return the value of upms_user.salt
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_user.salt
     *
     * @param salt the value for upms_user.salt
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_user.mobile_no
     *
     * @return the value of upms_user.mobile_no
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_user.mobile_no
     *
     * @param mobileNo the value for upms_user.mobile_no
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo == null ? null : mobileNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_user.email
     *
     * @return the value of upms_user.email
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_user.email
     *
     * @param email the value for upms_user.email
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_user.status
     *
     * @return the value of upms_user.status
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_user.status
     *
     * @param status the value for upms_user.status
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_user.version
     *
     * @return the value of upms_user.version
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_user.version
     *
     * @param version the value for upms_user.version
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_user.created_by
     *
     * @return the value of upms_user.created_by
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_user.created_by
     *
     * @param createdBy the value for upms_user.created_by
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_user.created_time
     *
     * @return the value of upms_user.created_time
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_user.created_time
     *
     * @param createdTime the value for upms_user.created_time
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_user.last_upd_by
     *
     * @return the value of upms_user.last_upd_by
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    public String getLastUpdBy() {
        return lastUpdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_user.last_upd_by
     *
     * @param lastUpdBy the value for upms_user.last_upd_by
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    public void setLastUpdBy(String lastUpdBy) {
        this.lastUpdBy = lastUpdBy == null ? null : lastUpdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_user.last_upd_time
     *
     * @return the value of upms_user.last_upd_time
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    public Date getLastUpdTime() {
        return lastUpdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_user.last_upd_time
     *
     * @param lastUpdTime the value for upms_user.last_upd_time
     *
     * @mbg.generated Sat Apr 21 22:51:18 CST 2018
     */
    public void setLastUpdTime(Date lastUpdTime) {
        this.lastUpdTime = lastUpdTime;
    }
}