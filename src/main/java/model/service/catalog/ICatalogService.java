package model.service.catalog;

import model.entity.Catalog;
import model.service.IServices;

import java.util.List;

public interface ICatalogService extends IServices<Catalog, String > {
    List<Catalog> findByName(String name);

}
