package org.example.repro;

import java.io.IOException;
import java.util.List;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import jakarta.annotation.PostConstruct;
import jakarta.ws.rs.ApplicationPath;

@ApplicationPath("/jersey")
@Configuration
public class EndpointConfig extends ResourceConfig {
    private static final List<Class<?>> CONTROLLERS = List.of(
        TestController.class
    );

    @PostConstruct
    private void init() throws IOException {
        registerEndpoints();
    }

    private void registerEndpoints() {
        CONTROLLERS.forEach(this::register);
    }
}
