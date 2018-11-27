package com.springboot.liberty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = MessageSourceAutoConfiguration.class)
public class SpringBootLibertyApplication extends SpringBootServletInitializer {
 
   /*public static void main(String[] args) {
      SpringApplication.run(ServletInitializer.class, args);
   }*/
 
   @Override
   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
      return application.sources(SpringApplicationBuilder.class);
   }
}


@RestController
class RESTController {
 
   @RequestMapping("/testapi")
   public String hello() {
      return "This is Test Spring Boot to Liberty App";
   }
}
 