package org.dfg.demo.circular.three;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author fugui.ding at 2019/1/25
 */
@Configuration
@ComponentScan
public class ThreeMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ThreeMain.class);
        System.out.println("start");
        context.getBean(ServiceA.class);
    }
}
