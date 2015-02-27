package com.lukiano.cloud;

import org.springframework.cloud.ServiceInfoCreator;
import org.springframework.cloud.service.ServiceInfo;

public abstract class MyServiceInfoCreator implements ServiceInfoCreator<ServiceInfo, MyServiceData> {}