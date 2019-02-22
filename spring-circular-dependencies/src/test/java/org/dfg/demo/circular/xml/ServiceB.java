package org.dfg.demo.circular.xml;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author fugui.ding at 2019/1/25
 */
public class ServiceB {
    //@Autowired
    private ServiceA serviceA;

    public ServiceB() {
        System.out.println("ServiceB()");
    }

    public void foo() {
        System.out.println("serviceB.foo()");
    }

    @Autowired
    public void setServiceA(ServiceA serviceA) {
        System.out.println("serviceB.setServiceA()");
        this.serviceA = serviceA;
    }

}
