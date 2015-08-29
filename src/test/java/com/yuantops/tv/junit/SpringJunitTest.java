package com.yuantops.tv.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yuantops(yuan.tops@gmail.com) on 2015/8/27.
 * Testcase template class
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application-root-context.xml")
public class SpringJunitTest {
    @Test
    public void testNull() {
        return;
    }
}
