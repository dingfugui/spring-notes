package org.dfg.demo.circular.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author fugui.ding at 2019/1/25
 */
@Component
public class ServiceB {
    private final ServiceA serviceA;

    @Autowired
    public ServiceB(ServiceA serviceA) {
        System.out.println("ServiceB()");
        this.serviceA = serviceA;
    }

    public void foo() {
        System.out.println("serviceB.foo()");
    }
}
