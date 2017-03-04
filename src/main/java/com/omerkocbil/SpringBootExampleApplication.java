package com.omerkocbil;

import com.omerkocbil.service.Post;
import com.omerkocbil.service.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.faces.webapp.FacesServlet;

/**
 * Created by jan on 23.01.2017.
 */

@SpringBootApplication
public class SpringBootExampleApplication implements CommandLineRunner {

    @Autowired
    private PostRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootExampleApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        for (int i = 0; i < 5; i++) {
            repository.save(new Post("My post number #" + (i+1)));
        }
    }

}
