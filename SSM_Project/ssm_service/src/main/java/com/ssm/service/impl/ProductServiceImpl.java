package com.ssm.service.impl;

import com.ssm.domain.PageBean;
import com.ssm.domain.Product;
import com.ssm.mapper.ProductMapper;
import com.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    /**
     * 查询所有
     * @return
     * @param pageBean
     */
    @Override
    public List<Product> findAll(PageBean pageBean) {
//        设置总记录数
        int totalCounts = productMapper.findTotalCounts();
        pageBean.setTotalCounts(totalCounts);
//        设置总页面数
        int totalPage = (int) Math.ceil(totalCounts*1.0/pageBean.getRows());
        pageBean.setTotalPage(totalPage);
        pageBean.setTotalPage((int) Math.ceil(totalCounts*1.0/pageBean.getRows()));
        return productMapper.findAll(pageBean);
    }

    /**
     * 添加商品
     * @param product
     */
    @Override
    public void addProduct(Product product) {
        productMapper.addProduct(product);
    }


    /**
     * 删除商品
     */
    @Override
    public void delProduct(Product product) {
//        productMapper.delProduct(product);
    }


}
