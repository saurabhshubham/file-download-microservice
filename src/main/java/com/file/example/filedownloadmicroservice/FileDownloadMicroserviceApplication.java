package com.file.example.filedownloadmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FileDownloadMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileDownloadMicroserviceApplication.class, args);
	}
}
