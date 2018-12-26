package com.ssm.mapper;


import com.ssm.domain.PageBean;
import com.ssm.domain.Product;
import java.util.List;


public interface ProductMapper {

     List<Product> findAll(PageBean pageBean);

    void addProduct(Product product);

    int findTotalCounts();
}
