package com.kishan.restjava;

import com.kishan.restjava.health.RestJavaHealthCheck;
import com.kishan.restjava.resource.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class RestJava extends Application<RestJavaConfiguration> {


    public static void main(String[] args) throws Exception {
        new RestJava().run(args);
    }

    @Override
    public void run(RestJavaConfiguration configuration, Environment environment) throws Exception {
        registerResources(environment);
        registerHealthChecks(environment);
    }

    private void registerResources(Environment environment) {
        environment.jersey().register(HelloWorldResource.class);
    }

    private void registerHealthChecks(Environment environment) {
        environment.healthChecks().register("restjava", new RestJavaHealthCheck());
    }
}
