package com.sogra.backend.sogra.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Getter
@Component
@PropertySource(value = "classpath:/application.properties")
public class DatabaseProperties {
    @Value("${db.username}")
    private String username;
    @Value("${db.password}")
    private String password;
    @Value("${db.driver-class-name}")
    private String driverClassName;
    @Value("${db.url}")
    private String url;
    @Value("${db.initial-size}")
    private Integer initialSize;
    @Value("${db.max-total}")
    private Integer maxTotal;
    @Value("${db.max-idle}")
    private Integer maxIdle;
    @Value("${db.min-idle}")
    private Integer minIdle;
    @Value("${db.max-wait-millis}")
    private Integer maxWaitMillis;
    @Value("${db.validation-query}")
    private String validationQuery;
    @Value("${db.test-on-borrow}")
    private boolean testOnBorrow;

}

