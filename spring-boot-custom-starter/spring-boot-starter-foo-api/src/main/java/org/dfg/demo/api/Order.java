package org.dfg.demo.api;

/**
 * @author fugui.ding at 2019/2/23
 */
public class Order {

    private String name;

    public Order() {
    }

    public Order(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Order:{name=%s}", name);
    }

}
