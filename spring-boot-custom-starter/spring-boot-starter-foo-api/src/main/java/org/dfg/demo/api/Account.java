package org.dfg.demo.api;

/**
 * @author fugui.ding at 2019/2/23
 */
public class Account {

    private String number;

    public Account() {
    }

    public Account(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("Account:{number=%s}", number);
    }

}
