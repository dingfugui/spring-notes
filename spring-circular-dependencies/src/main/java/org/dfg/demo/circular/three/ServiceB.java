package org.dfg.demo.circular.three;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author fugui.ding at 2019/1/25
 */
@Component
public class ServiceB {
    private final ServiceC serviceC;

    @Autowired
    public ServiceB(ServiceC serviceC) {
        System.out.println("ServiceC()");
        this.serviceC = serviceC;
    }

}
