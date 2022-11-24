package io.sewah.spingbootmybatisdemo.mybatis.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Product {
    private Integer productId;
    private String productName;
    private String productDescription;
    private Integer quantity;
    private Double price;
}
