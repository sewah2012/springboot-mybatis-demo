package io.sewah.spingbootmybatisdemo.services;

import io.sewah.spingbootmybatisdemo.dao.ProductDaoImpl;
import io.sewah.spingbootmybatisdemo.mybatis.mappers.ProductMapper;
import io.sewah.spingbootmybatisdemo.mybatis.models.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@Sql(scripts = {"/schema-test.sql", "/data-test.sql"})
@SpringBootTest
class ProductServiceImplTest {
//    @Mock
//    private ProductDaoImpl productDao;

//    @InjectMocks
    @Autowired
    private ProductServiceImpl productService;


    @Test
    void getAllProduct() {
        int expected = 4;

//        when
        var response = productService.getAllProduct();
        System.out.println(response);
        var actual = response.size();
        assertEquals(expected, actual);
//        then
//        verify(productDao).getAllProduct();
    }

    @Test
    @Disabled
    void addProduct() {
    }

    @Test
    @Disabled
    void getProduct() {
    }
}