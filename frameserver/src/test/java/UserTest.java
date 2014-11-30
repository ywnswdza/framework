import org.junit.Test;
import org.losy.AbstractCommonTest;
import org.losy.common.mybatis.support.Pager;
import org.losy.user.entity.User;
import org.losy.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2014/11/30.
 */
public class UserTest extends AbstractCommonTest {

    @Autowired
    private IUserService service;
    private User user = new User();
    @Test
    public void testInsert(){
        user.setName("test2");
        user.setPwd("123456");
        //service.findEntityByKey(1);
        service.insert(user);
        logger.info(user);
    }

    @Test
    public void testUpdate(){
        user.setId(5);
        user.setName("test");
        user.setPwd("654321");
        service.update(user);
        logger.info(user);
    }
    @Test
    public void testPage(){
        user.setName("test");
        Pager<User> pager = service.findEntityPager(user,30, 10);
        logger.info(pager);
        user.setName(null);
        service.findEntityListLimit(user, 0, 10);
        service.findEntityList(user);
    }
}
