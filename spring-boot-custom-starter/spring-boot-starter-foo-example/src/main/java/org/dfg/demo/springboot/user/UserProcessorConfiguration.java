package org.dfg.demo.springboot.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author fugui.ding at 2019/2/23
 */
@Configuration
public class UserProcessorConfiguration {
    @Bean
    public UserProcessorImpl orderDao() {
        return new UserProcessorImpl();
    }
}
