package org.dfg.demo.springboot.order;

import org.dfg.demo.api.Order;
import org.dfg.demo.api.OrderDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author fugui.ding at 2019/2/23
 */
@Configuration
public class MyOrderDaoConfiguration {

    @Bean
    public OrderDao orderDao() {
        return () -> new Order("my");
    }

}
