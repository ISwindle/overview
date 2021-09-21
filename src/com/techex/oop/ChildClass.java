package com.techex.oop;

public class ChildClass extends BaseClass implements IInterface {

    @Override
    public String returnName() {
        return "ChildClass";
    }

    public int birthOrder() {
        return 1;
    }
}
