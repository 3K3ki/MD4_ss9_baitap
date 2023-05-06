package model.service.product;

import model.entity.Product;

import java.util.List;

public class ProductImp implements IProductService{
    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public boolean save(Product product) {
        return false;
    }

    @Override
    public boolean update(Product product) {
        return false;
    }

    @Override
    public Product findById(Integer id) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
