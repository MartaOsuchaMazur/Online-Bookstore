package pl.sztukakodu.bookmmr.catalog.domain;

import java.util.List;

public interface CatalogRepository {
    List<Book> findAll();

}
