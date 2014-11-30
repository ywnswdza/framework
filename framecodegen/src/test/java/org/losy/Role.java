package org.losy;

import org.losy.annotation.Column;
import org.losy.annotation.Table;

/**
 * Created by Administrator on 2014/11/30.
 */
@Table(name = "t_sys_role")
public class Role {
    @Column(id=true)
    private Integer id;
    @Column
    private String roleName;
    @Column
    private String role;
    @Column
    private boolean isLock;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isLock() {
        return isLock;
    }

    public void setLock(boolean isLock) {
        this.isLock = isLock;
    }
}
