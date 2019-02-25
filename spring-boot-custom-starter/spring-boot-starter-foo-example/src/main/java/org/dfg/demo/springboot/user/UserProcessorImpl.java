package org.dfg.demo.springboot.user;

import org.dfg.demo.api.User;
import org.dfg.demo.api.UserProcessor;

/**
 * @author fugui.ding at 2019/2/23
 */
//@Component
public class UserProcessorImpl implements UserProcessor {
    @Override
    public User processor(User user) {
        user.setAge(user.getAge() + 1);
        return user;
    }
}
