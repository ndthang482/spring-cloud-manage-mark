package savvycom.gw_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GwServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GwServiceApplication.class, args);
    }

}
