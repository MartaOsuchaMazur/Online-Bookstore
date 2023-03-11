package pl.sztukakodu.bookmmr;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.sztukakodu.bookmmr.catalog.application.CatalogController;
import pl.sztukakodu.bookmmr.catalog.domain.Book;
import pl.sztukakodu.bookmmr.catalog.domain.CatalogService;


import java.util.List;

@SpringBootApplication
public class OnlineBookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineBookstoreApplication.class, args);
	}

}
