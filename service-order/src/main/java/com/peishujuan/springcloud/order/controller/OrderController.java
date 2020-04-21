package com.peishujuan.springcloud.order.controller;

import com.peishujuan.springcloud.order.model.Order;
import com.peishujuan.springcloud.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order/")
public class OrderController {
    @Autowired
    private OrderService orderService;
    /**
     * 根据Id，查询order
     * @param id
     * @return
     */
    @RequestMapping("getOrderById")
    public Order getOrderById(@RequestParam("id")Integer id){
        return orderService.getOrderById(id);
    }

}
