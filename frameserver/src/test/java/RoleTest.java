import org.junit.Test;
import org.losy.AbstractCommonTest;
import org.losy.common.mybatis.support.Pager;
import org.losy.role.entity.Role;
import org.losy.role.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2014/11/30.
 */
public class RoleTest extends AbstractCommonTest {
    @Autowired
    IRoleService service;
    List<Role> list = new ArrayList<Role>();
    Role role = new Role();

    @Test
    public void testAdd(){
        role.setRoleName("role");
        role.setRole("mgr");
        role.setIsLock(false);
        service.insert(role);
    }

    @Test
    public void testAddBath(){
        for(int i = 0;i < 100;i++) {
            role = new Role();
            role.setRoleName("role" + i);
            role.setRole("mgr" + i);
            role.setIsLock(i % 2 == 0);
            list.add(role);
        }
        service.insertBatch(list);
    }

    @Test
    public void testUpdate(){
        role.setId(1);
        role.setRole("su");
        service.update(role);
    }

    @Test
    public void testDelete(){
        service.removeByKey(1);
    }

    @Test
    public void testDeleteBatch(){
        List<Serializable> list1 = new ArrayList<Serializable>();
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        service.removeByKeys(list1);
    }
@Test
    public void testQuery(){
        Role q = new Role();
        role = service.findEntityByKey(10);
        logger.info(role);
        q.setRoleName("role");
        list   = service.findEntityList(q);
        logger.info(list);
        Pager<Role> pager = service.findEntityPager(q,30,10);
        logger.info(pager);
            list   = service.findEntityListLimit(q,10,20);
            logger.info(list);
    }
}
