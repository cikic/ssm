package com.ssm.controller;


import com.ssm.domain.PageBean;
import com.ssm.domain.Product;
import com.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    public ProductService productService;

    /**
     * 查询所有
     * @param model
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll(PageBean pageBean,Model model){

        List<Product> productList = productService.findAll(pageBean);
        model.addAttribute("productList",productList);
        return "product-list";
    }


    /**
     * 添加商品
     */
    @RequestMapping("/addProduct")
    public String addProduct(Product product){
        productService.addProduct(product);
        return "redirect:/product/findAll";
//        product-add
    }

    /**
     * 删除商品
     */
    @RequestMapping("/delProduct")
    public String delProdut(String[] ids){
        System.out.println("QQQQQQQQQQQQQQQQQQQQQQQQQQQQ");


        productService.delProduct(ids);
        return "redirect:/product/findAll";
    }


}
