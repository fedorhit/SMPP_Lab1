package SMPP_Lab1.config;

import SMPP_Lab1.service.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan("SMPP_Lab1")
public class AppConfig {


    @Bean
    MessageService messageService(){return new MessageService();}


    @Bean
    Scanner scanner(){return new Scanner(System.in);}

}
