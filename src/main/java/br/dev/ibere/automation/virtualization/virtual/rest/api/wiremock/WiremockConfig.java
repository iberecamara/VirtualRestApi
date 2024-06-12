package br.dev.ibere.automation.virtualization.virtual.rest.api.wiremock;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;


@Configuration
public class WiremockConfig {

    @Value("${wiremocks.responses.folder}")
    private String responsesFolder;

    @Bean
    public WireMockServer getWireMockServer() {
        WireMockServer wireMockServer = new WireMockServer(
                options()
                        .port(8080)
                        .templatingEnabled(true)
                        .usingFilesUnderClasspath(responsesFolder)
        );
        wireMockServer.start();
        return wireMockServer;
    }


}
