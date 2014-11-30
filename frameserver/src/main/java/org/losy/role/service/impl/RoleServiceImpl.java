package org.losy.role.service.impl;

import org.springframework.stereotype.Service;
import org.losy.common.service.CommonServiceImpl;
import org.losy.role.dao.IRoleMapper;
import org.losy.role.entity.Role;
import org.losy.role.service.IRoleService;


/**
 * @serviceimpl
 * @table t_sys_role
 * @date 2014-11-30 20:09:56
 * @author losy
 */
@Service("roleService")
public class RoleServiceImpl extends CommonServiceImpl<IRoleMapper,Role> implements IRoleService {

	
}
