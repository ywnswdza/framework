package org.losy.role.entity;

/**
 * @entity
 * @table t_sys_role
 * @date 2014-11-30 20:09:56
 * @author losy
 */
public class Role  {

	/** id */
	private Integer id;
	/** roleName */
	private String roleName;
	/** role */
	private String role;
	/** isLock */
	private boolean isLock;

	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId() {
		return this.id;
	}
	public void setRoleName(String roleName){
		this.roleName = roleName;
	}
	public String getRoleName() {
		return this.roleName;
	}
	public void setRole(String role){
		this.role = role;
	}
	public String getRole() {
		return this.role;
	}
	public void setIsLock(boolean isLock){
		this.isLock = isLock;
	}
	public boolean getIsLock() {
		return this.isLock;
	}

	@Override
	public String toString() {
		return "Role{" +
				"id=" + id +
				", roleName='" + roleName + '\'' +
				", role='" + role + '\'' +
				", isLock=" + isLock +
				'}';
	}
}