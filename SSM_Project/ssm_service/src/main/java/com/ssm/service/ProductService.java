package com.ssm.service;

import com.ssm.domain.PageBean;
import com.ssm.domain.Product;
import java.util.List;


public interface ProductService {

    List<Product> findAll(PageBean pageBean);

    void addProduct(Product product);

    void delProduct(Product product);
}
