package org.losy.role.dao;
import org.springframework.stereotype.Repository;
import org.losy.common.dao.ICommonMapper;
import org.losy.role.entity.Role;
/**
 * @intefacedao
 * @table t_sys_role
 * @date 2014-11-30 20:09:56
 * @author losy
 */
@Repository("roleDao")
public interface IRoleMapper extends ICommonMapper<Role> {

}