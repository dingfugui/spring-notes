package org.dfg.demo.circular.set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author fugui.ding at 2019/1/25
 */
@Component
//@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ServiceB {
    //@Autowired
    private ServiceA serviceA;

    public ServiceB() {
        System.out.println("ServiceB()");
    }

    public void foo() {
        System.out.println("serviceB.foo()");
        //serviceA.foo();
    }

    @Autowired
    public void setServiceA(ServiceA serviceA) {
        System.out.println("serviceB.setServiceA()");
        this.serviceA = serviceA;
    }

}
