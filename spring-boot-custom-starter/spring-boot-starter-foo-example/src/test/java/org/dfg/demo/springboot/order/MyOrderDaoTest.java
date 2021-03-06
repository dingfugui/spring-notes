package org.dfg.demo.springboot.order;

import org.dfg.demo.api.Order;
import org.dfg.demo.springboot.account.AccountApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {AccountApplication.class, MyOrderDaoConfiguration.class})
public class MyOrderDaoTest {

    @Autowired
    ApplicationContext context;

    @Test
    public void orderTest() throws Exception {
        if (context.containsBean("order")) {
            final Order order = context.getBean(Order.class);
            System.out.println(order);
            Assert.assertEquals(order.getName(), "my");
        }
    }

}
