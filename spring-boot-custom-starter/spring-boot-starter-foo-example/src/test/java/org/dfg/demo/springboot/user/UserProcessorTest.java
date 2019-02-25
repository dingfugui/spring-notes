package org.dfg.demo.springboot.user;

import org.dfg.demo.springboot.account.AccountApplication;
import org.dfg.demo.api.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {AccountApplication.class, UserProcessorConfiguration.class})
public class UserProcessorTest {

    @Autowired
    ApplicationContext context;

    @Test
    public void userTest() throws Exception {
        Assert.assertTrue(context.containsBean("user"));

        User user = context.getBean(User.class);
        System.out.println(user);
        Assert.assertEquals(user.getName(), "abc");
        Assert.assertEquals(user.getAge(), 10);
    }

}
