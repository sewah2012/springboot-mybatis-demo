package io.sewah.spingbootmybatisdemo.services;

import io.sewah.spingbootmybatisdemo.mybatis.models.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProduct();
    public void addProduct(Product product);
    public Product getProduct(Integer productId);
}
