package io.sewah.spingbootmybatisdemo.dao;

import io.sewah.spingbootmybatisdemo.mybatis.models.Product;

import java.util.List;

public interface ProductDao {
    public List<Product> getAllProduct();
    public void addProduct(Product product);
    public Product getProduct(Integer productId);
}
