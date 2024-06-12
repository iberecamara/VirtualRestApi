package br.dev.ibere.automation.virtualization.virtual.rest.api;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import static org.springframework.boot.WebApplicationType.NONE;


@SpringBootApplication
public class VirtualRestApiApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(VirtualRestApiApplication.class).web(NONE).run();
    }

}
