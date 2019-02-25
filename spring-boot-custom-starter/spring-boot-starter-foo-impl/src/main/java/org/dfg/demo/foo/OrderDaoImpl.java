package org.dfg.demo.foo;


import org.dfg.demo.api.Order;
import org.dfg.demo.api.OrderDao;

/**
 * @author fugui.ding at 2017/8/11
 */
public class OrderDaoImpl implements OrderDao {

    @Override
    public Order getOrder() {
        return new Order("default");
    }
}
