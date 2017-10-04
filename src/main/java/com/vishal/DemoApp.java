package com.vishal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.Environment;

/**
 * @author Vishal
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class DemoApp {

  @Autowired
  Environment env;
  
  public static void main(String[] args) {
    SpringApplication.run(DemoApp.class, args);
  }

}
