package com.ssm.domain;

import java.io.Serializable;
import java.util.List;

public class PageBean implements Serializable {
    private int currentPage;    //当前页
    private int rows;   //每页显示的条数
    private int totalPage;  //总页面数
    private int totalCounts;    //总记录数
    private List<Product> productList;  //返回的数据记录集合

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getTotalPage() {

        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalCounts() {
        return totalCounts;
    }

    public void setTotalCounts(int totalCounts) {
        this.totalCounts = totalCounts;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "currentPage=" + currentPage +
                ", rows=" + rows +
                ", totalPage=" + totalPage +
                ", totalCounts=" + totalCounts +
                ", productList=" + productList +
                '}';
    }
}
