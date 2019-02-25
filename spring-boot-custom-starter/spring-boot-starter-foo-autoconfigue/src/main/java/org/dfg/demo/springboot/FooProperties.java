package org.dfg.demo.springboot;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "foo")
public class FooProperties implements InitializingBean {

    private User config;

    public User getConfig() {
        return config;
    }

    public void setConfig(User config) {
        this.config = config;
    }

    @Override
    public void afterPropertiesSet() {
        if (config == null) {
            config = new User();
            config.name = "tony";
            config.age = 18;
        }
    }

    public static class User {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}