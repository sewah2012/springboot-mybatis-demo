package io.sewah.spingbootmybatisdemo.dao;

import io.sewah.spingbootmybatisdemo.models.Product;
import io.sewah.spingbootmybatisdemo.mybatis.mappers.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductDaoImpl implements ProductDao{
    private final ProductMapper mapper;
    @Override
    public List<Product> getAllProduct() {
        return mapper.getAllProduct();
    }

    @Override
    public void addProduct(Product product) {
        mapper.addProduct(product);
    }

    @Override
    public Product getProduct(Integer productId) {
        return mapper.getProduct(productId);
    }
}
