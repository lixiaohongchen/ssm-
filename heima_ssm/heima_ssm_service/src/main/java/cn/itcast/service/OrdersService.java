package cn.itcast.service;

import cn.itcast.domain.Orders;

import java.util.List;

public interface OrdersService {

    public List<Orders> findAll(int page, int size);
}
