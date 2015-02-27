package com.lukiano.cloud;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.cloud.AbstractCloudConnector;
import org.springframework.cloud.FallbackServiceInfoCreator;
import org.springframework.cloud.app.ApplicationInstanceInfo;
import org.springframework.cloud.service.BaseServiceInfo;

public final class MyConnector extends AbstractCloudConnector<MyServiceData> {

    public MyConnector() {
        super(MyServiceInfoCreator.class);
    }

    @Override
    public boolean isInMatchingCloud() {
        return true;
    }

    @Override
    public ApplicationInstanceInfo getApplicationInstanceInfo() {
        return new ApplicationInstanceInfo() {

            @Override
            public String getInstanceId() {
                return "1";
            }

            @Override
            public String getAppId() {
                return "spring-cloud-issue";
            }

            @Override
            public Map<String, Object> getProperties() {
                return Collections.emptyMap();
            }
        };
    }

    protected List<MyServiceData> getServicesData() {
        return Collections.singletonList(new MyServiceData());
    }

    @Override
    protected FallbackServiceInfoCreator<BaseServiceInfo,MyServiceData> getFallbackServiceInfoCreator() {
        return new FallbackServiceInfoCreator<BaseServiceInfo,MyServiceData>() {

            @Override
            public BaseServiceInfo createServiceInfo(MyServiceData serviceData) {
                return new MyInfo();
            }
        };
    }
}