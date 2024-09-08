package org.wasif.ticketmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TicketmicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketmicroserviceApplication.class, args);
	}

}
