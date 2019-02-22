package org.dfg.demo.circular.xml;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fugui.ding at 2019/1/25
 */
public class XmlMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
        System.out.println("start");
        context.getBean(ServiceA.class).foo();
    }
}
