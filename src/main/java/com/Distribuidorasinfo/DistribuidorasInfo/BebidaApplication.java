package com.Distribuidorasinfo.DistribuidorasInfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@SpringBootApplication
@EntityScan(basePackageClasses = { Jsr310JpaConverters.class }, basePackages = "com.Distribuidorasinfo.*")
public class BebidaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BebidaApplication.class, args);
	}

}
