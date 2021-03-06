package wannshan.springb.model;

import java.util.Date;

public class TSysRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_role.id
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    private Long id;

    private String roleCode;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_role.role_name
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_role.enabled
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    private Integer enabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_role.create_time
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_role.update_time
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_role.id
     *
     * @return the value of t_sys_role.id
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_role.id
     *
     * @param id the value for t_sys_role.id
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_role.role_name
     *
     * @return the value of t_sys_role.role_name
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_role.role_name
     *
     * @param roleName the value for t_sys_role.role_name
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_role.enabled
     *
     * @return the value of t_sys_role.enabled
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_role.enabled
     *
     * @param enabled the value for t_sys_role.enabled
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_role.create_time
     *
     * @return the value of t_sys_role.create_time
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_role.create_time
     *
     * @param createTime the value for t_sys_role.create_time
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_role.update_time
     *
     * @return the value of t_sys_role.update_time
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_role.update_time
     *
     * @param updateTime the value for t_sys_role.update_time
     *
     * @mbggenerated Tue Apr 17 10:14:26 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }
}