package pl.sztukakodu.bookmmr.catalog.application;

import org.springframework.stereotype.Controller;
import pl.sztukakodu.bookmmr.catalog.domain.Book;
import pl.sztukakodu.bookmmr.catalog.domain.CatalogService;

import java.util.List;

@Controller
public class CatalogController {
    private final CatalogService service;

    public CatalogController(CatalogService service) {
        this.service = service;
    }
    public List<Book> findByTitle(String title){
        return service.findByTitle(title);
    }
}
