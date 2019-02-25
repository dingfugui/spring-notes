package org.dfg.demo.springboot.order;

import org.dfg.demo.api.OrderDao;
import org.dfg.demo.foo.OrderDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author fugui.ding at 2019/2/23
 */
@Configuration
public class DefaultOrderDaoConfiguration {

    @Bean
    public OrderDao orderDao() {
        return new OrderDaoImpl();
    }

}
