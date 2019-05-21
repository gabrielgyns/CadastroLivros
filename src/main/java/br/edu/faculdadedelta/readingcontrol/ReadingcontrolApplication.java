package br.edu.faculdadedelta.readingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages = "br.edu.faculdadedelta.readingcontrol.model")
@ComponentScan(basePackages = {"br.edu.faculdadedelta.readingcontrol.*"})
@EnableJpaRepositories(basePackages = {"br.edu.faculdadedelta.readingcontrol.repository"})
@EnableTransactionManagement
public class ReadingcontrolApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadingcontrolApplication.class, args);
	}

}
