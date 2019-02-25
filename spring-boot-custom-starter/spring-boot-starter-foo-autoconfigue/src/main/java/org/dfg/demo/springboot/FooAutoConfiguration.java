package org.dfg.demo.springboot;

import org.dfg.demo.api.*;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(User.class)
//@AutoConfigureAfter(DataSourceAutoConfiguration.class)
//@ConditionalOnSingleCandidate(DataSource.class)
@EnableConfigurationProperties(FooProperties.class)
public class FooAutoConfiguration {

    private UserProcessor processor;

    public FooAutoConfiguration(ObjectProvider<UserProcessor> provider) {
        this.processor = provider.getIfAvailable();
        System.out.println("processor:" + processor);
    }

    @Bean(name = "account")
    @ConditionalOnMissingBean
    public Account getAccount() {
        System.out.println("create account");
        return new Account("011");
    }

    @Bean(name = "order")
    @ConditionalOnBean(OrderDao.class)
    @ConditionalOnMissingBean
    public Order getFooServiceByDao(OrderDao orderDao) {
        System.out.println("create order");
        Order order = orderDao.getOrder();
        return order;
    }

    @Bean(name = "user")
    @ConditionalOnMissingBean
    public User getUserByProperty(FooProperties properties) {
        System.out.println("create user");
        String name = properties.getConfig().getName();
        int age = properties.getConfig().getAge();
        User user = new User(name, age);
        if (processor != null) {
            System.out.println("process user");
            return processor.processor(user);
        }
        return user;
    }

}