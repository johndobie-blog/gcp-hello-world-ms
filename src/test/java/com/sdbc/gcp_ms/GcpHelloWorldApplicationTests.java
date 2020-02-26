package com.sdbc.gcp_ms;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static com.sdbc.gcp_ms.web.controller.HelloWorldController.HELLO_WORLD_ENDPOINT;
import static com.sdbc.gcp_ms.web.controller.HelloWorldController.HELLO_WORLD_MSG;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class GcpHelloWorldApplicationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    void testEndpointReturnsHelloWorld() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + HELLO_WORLD_ENDPOINT, String.class)).contains(HELLO_WORLD_MSG);
    }
}
