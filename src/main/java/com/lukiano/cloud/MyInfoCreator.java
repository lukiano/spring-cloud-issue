package com.lukiano.cloud;

public class MyInfoCreator extends MyServiceInfoCreator {

    @Override
    public boolean accept(MyServiceData serviceData) {
        return true;
    }

    @Override
    public MyInfo createServiceInfo(MyServiceData serviceData) {
        return new MyInfo();
    }
}
