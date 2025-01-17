package com.msvc_student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsvcStudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsvcStudentApplication.class, args);
    }

}
