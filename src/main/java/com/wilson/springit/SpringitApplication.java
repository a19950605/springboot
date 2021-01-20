package com.wilson.springit;

import com.wilson.springit.config.SpringitProperties;
import com.wilson.springit.domain.Comment;
import com.wilson.springit.domain.Link;
import com.wilson.springit.repository.CommentRepository;
import com.wilson.springit.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@EnableConfigurationProperties(SpringitProperties.class)
public class SpringitApplication {

    @Autowired
    private SpringitProperties springitProperties;

    public static void main(String[] args) {
        SpringApplication.run(SpringitApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
        return args -> {
            Link link = new Link("Getting Started with Spring Boot 2", "https://therealdanvega.com/spring-boot-2");
            linkRepository.save(link);

            Comment comment = new Comment("This Spring Boot 2 Link is awesome", link);
            commentRepository.save(comment);
            link.addComment(comment);

          //  System.out.println(link.getComments());
            System.out.println("we just add new comment");

//            Link firstLink = linkRepository.findByTitle("Getting started with spring boot 2");
        };
    }
}
