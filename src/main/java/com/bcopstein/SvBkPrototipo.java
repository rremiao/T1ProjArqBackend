package com.bcopstein;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.bcopstein.core.repository"})
@EnableJpaRepositories(basePackages = {"com.bcopstein.core.repository"})
@EntityScan(basePackages = {"com.bcopstein.business.entity"}) 
public class SvBkPrototipo {
  public static void main(String[] args) {
    SpringApplication.run(SvBkPrototipo.class, args);
  }
}
