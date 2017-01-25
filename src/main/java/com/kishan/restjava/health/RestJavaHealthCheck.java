package com.kishan.restjava.health;

import com.codahale.metrics.health.HealthCheck;

public class RestJavaHealthCheck extends HealthCheck {
    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
