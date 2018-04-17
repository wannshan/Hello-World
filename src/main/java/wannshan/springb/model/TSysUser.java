package wannshan.springb.model;

import java.util.Date;

public class TSysUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_user.id
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_user.user_name
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_user.password
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_user.sex
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    private Integer sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_user.enabled
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    private Integer enabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_user.create_time
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_user.update_time
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_user.id
     *
     * @return the value of t_sys_user.id
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_user.id
     *
     * @param id the value for t_sys_user.id
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_user.user_name
     *
     * @return the value of t_sys_user.user_name
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_user.user_name
     *
     * @param userName the value for t_sys_user.user_name
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_user.password
     *
     * @return the value of t_sys_user.password
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_user.password
     *
     * @param password the value for t_sys_user.password
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_user.sex
     *
     * @return the value of t_sys_user.sex
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_user.sex
     *
     * @param sex the value for t_sys_user.sex
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_user.enabled
     *
     * @return the value of t_sys_user.enabled
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_user.enabled
     *
     * @param enabled the value for t_sys_user.enabled
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_user.create_time
     *
     * @return the value of t_sys_user.create_time
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_user.create_time
     *
     * @param createTime the value for t_sys_user.create_time
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_user.update_time
     *
     * @return the value of t_sys_user.update_time
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_user.update_time
     *
     * @param updateTime the value for t_sys_user.update_time
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}