package cn.itcast.service;


import cn.itcast.domain.Product;

import java.util.List;

public interface ProductService {


    public List<Product> findAll();

    void save(Product product);
}
