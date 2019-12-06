package com.example.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PetClinicVet {

    public static void main(String[] args) {

        SpringApplication.run(PetClinicVet.class, args);
    }
}
