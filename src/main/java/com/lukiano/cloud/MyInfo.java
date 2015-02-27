package com.lukiano.cloud;

import org.springframework.cloud.service.BaseServiceInfo;
import org.springframework.cloud.service.ServiceInfo;

@ServiceInfo.ServiceLabel("my-info")
public class MyInfo extends BaseServiceInfo {
    public MyInfo() {
        super("my-info");
    }
}
