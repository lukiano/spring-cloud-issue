package com.lukiano.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.CloudFactory;
import org.springframework.cloud.config.java.ServiceScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ServiceScan
public class Main {

    @Bean
    public CloudFactory cloudFactory() {
        return new CloudFactory();
    }

    public static void main(final String[] args) throws Exception {
        ConfigurableApplicationContext cac =
                new SpringApplicationBuilder().sources(Main.class).run(args);
        MyService service = cac.getBean(MyService.class);
        service.hello();
        cac.close();
    }

}
