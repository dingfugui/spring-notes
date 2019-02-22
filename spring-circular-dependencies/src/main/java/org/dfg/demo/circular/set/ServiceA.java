package org.dfg.demo.circular.set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author fugui.ding at 2019/1/25
 */
@Component
//@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ServiceA {
    //@Autowired
    private ServiceB serviceB;

    public ServiceA() {
        System.out.println("ServiceA()");
    }

    public void foo() {
        System.out.println("serviceA.foo()");
        serviceB.foo();
    }

    @Autowired
    public void setServiceB(ServiceB serviceB) {
        System.out.println("serviceA.setServiceB()");
        this.serviceB = serviceB;
    }
}
