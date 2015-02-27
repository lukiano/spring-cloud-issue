package com.lukiano.cloud;

import org.springframework.cloud.service.AbstractServiceConnectorCreator;
import org.springframework.cloud.service.ServiceConnectorConfig;

public class MyServiceCreator extends AbstractServiceConnectorCreator<MyService, MyInfo> {

    @Override
    public MyService create(MyInfo serviceInfo, ServiceConnectorConfig serviceConnectorConfig) {
        return new MyService();
    }
}
