package tn.esprit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.CrossOrigin;
import tn.esprit.configuration.CorsConfiguration;
import tn.esprit.services.StockServiceImpl;

@EnableScheduling
@SpringBootApplication
@Import(CorsConfiguration.class)
public class CampusConnectApplication {
    public static void main(String[] args) {
        SpringApplication.run(CampusConnectApplication.class, args);
    }


}
