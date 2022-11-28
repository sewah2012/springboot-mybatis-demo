package io.sewah.spingbootmybatisdemo.services;
import io.sewah.spingbootmybatisdemo.dao.ProductDao;
import io.sewah.spingbootmybatisdemo.mybatis.models.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{
    private final ProductDao productDao;

    @Override
    public List<Product> getAllProduct() {
        return productDao.getAllProduct();
    }

    @Override
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    @Override
    public Product getProduct(Integer productId) {
        return productDao.getProduct(productId);
    }
}
