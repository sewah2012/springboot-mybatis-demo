package io.sewah.spingbootmybatisdemo.mybatis.mappers;

import io.sewah.spingbootmybatisdemo.mybatis.models.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    public List<Product> getAllProduct();
    public void addProduct(Product product);
    public Product getProduct(@Param("productId") Integer productId);
}
