package pl.sztukakodu.bookmmr.catalog;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.sztukakodu.bookmmr.catalog.application.CatalogController;
import pl.sztukakodu.bookmmr.catalog.domain.Book;

import java.util.List;

@Component
class ApplicationStartup implements CommandLineRunner {

    private final CatalogController catalogController;

    public ApplicationStartup(CatalogController catalogController) {
        this.catalogController = catalogController;
    }

    @Override
    public void run(String... args) throws Exception {
            List<Book> books = catalogController.findByTitle("Pan");
            books.forEach(System.out::println);
        }
}
