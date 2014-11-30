package org.losy.user.service.impl;

import org.losy.common.service.CommonServiceImpl;
import org.losy.user.dao.IUserMapper;
import org.losy.user.entity.User;
import org.losy.user.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2014/11/30.
 */
@Service("userService")
public class UserServiceImpl extends CommonServiceImpl<IUserMapper,User> implements IUserService {


}
