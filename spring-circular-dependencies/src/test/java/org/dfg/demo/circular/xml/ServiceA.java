package org.dfg.demo.circular.xml;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author fugui.ding at 2019/1/25
 */
public class ServiceA {
    //@Autowired
    private ServiceB serviceB;

    public ServiceA() {
        System.out.println("ServiceA()");
    }

    public void foo() {
        System.out.println("serviceA.foo()");
    }

    @Autowired
    public void setServiceB(ServiceB serviceB) {
        System.out.println("serviceA.setServiceB()");
        this.serviceB = serviceB;
    }
}
