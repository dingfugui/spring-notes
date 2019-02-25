package org.dfg.demo.springboot.account;

import org.dfg.demo.api.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AccountApplication.class)
public class AccountTest {

    @Autowired
    ApplicationContext context;

    @Test
    public void accountTest() throws Exception {
        Assert.assertTrue(context.containsBean("account"));
        Account account = context.getBean(Account.class);
        System.out.println(account);
        Assert.assertEquals(account.getNumber(), "011");
    }

}
