package com.example.chaos.monkey.shopping.bestseller.toys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.serviceregistry.ServiceRegistry;
import org.springframework.cloud.kubernetes.registry.KubernetesServiceRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import io.dekorate.kubernetes.annotation.ImagePullPolicy;
import io.dekorate.kubernetes.annotation.KubernetesApplication;
import io.dekorate.kubernetes.annotation.Probe;
import io.dekorate.kubernetes.annotation.ServiceType;

@SpringBootApplication
@EnableDiscoveryClient
@KubernetesApplication(
		livenessProbe = @Probe(httpActionPath = "/actuator/health"),
		readinessProbe = @Probe(httpActionPath = "/actuator/health"),
		serviceType = ServiceType.NodePort,
		imagePullPolicy = ImagePullPolicy.Always
		)
public class BestsellerToysApplication {

	public static void main(String[] args) {
		SpringApplication.run(BestsellerToysApplication.class, args);
	}
}
