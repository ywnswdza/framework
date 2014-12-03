package org.losy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 * Created by Administrator on 2014/11/30.
 */
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration
public class AbstractCommonTest extends AbstractJUnit4SpringContextTests{
    @Test
    public void test(){}
}
