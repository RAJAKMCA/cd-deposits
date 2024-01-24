package com.abybank.cdeposits;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cassandra.CqlSessionBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.nio.file.Path;

@SpringBootApplication
@ComponentScan(basePackages = { "com.abybank.cdeposits.*" })
@OpenAPIDefinition(info = @Info(title = "Certified Deposits API", version = "3.0", description = "Certified Deposits Information"))
public class CdepositsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CdepositsApplication.class, args);
	}
	@Bean
	public CqlSessionBuilderCustomizer sessionBuilderCustomizer(DataStaxAstraProperties astraProperties) {

		Path bundle = astraProperties.getSecureConnectBundle().toPath();
		return builder -> builder.withCloudSecureConnectBundle(bundle);
	}
}
