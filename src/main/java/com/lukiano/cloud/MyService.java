package com.lukiano.cloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

public class MyService implements InitializingBean {

    private Logger log = LoggerFactory.getLogger(MyService.class);

    public MyService() {
        log.warn("BUILDING");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.warn("YEAH");
    }

    public void hello() {
        log.warn("Hello there");
    }
}
