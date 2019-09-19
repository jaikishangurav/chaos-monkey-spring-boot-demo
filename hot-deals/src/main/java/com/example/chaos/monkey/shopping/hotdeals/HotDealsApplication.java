package com.example.chaos.monkey.shopping.hotdeals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

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
public class HotDealsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotDealsApplication.class, args);
	}
}
