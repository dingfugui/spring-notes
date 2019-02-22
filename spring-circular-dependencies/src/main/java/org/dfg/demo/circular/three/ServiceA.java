package org.dfg.demo.circular.three;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author fugui.ding at 2019/1/25
 */
@Component
public class ServiceA {
    private final ServiceB serviceB;

    @Autowired
    public ServiceA(ServiceB serviceB) {
        System.out.println("ServiceA()");
        this.serviceB = serviceB;
    }

}
