package com.leo.order.service;

import com.leo.order.client.ItemClient;
import com.leo.order.dto.OrderDto;
import com.leo.order.entity.Item;
import com.leo.order.entity.Order;
import com.leo.order.entity.OrderDetail;
import com.leo.order.repo.OrderDetailRepository;
import com.leo.order.repo.OrdersRepository;
import com.leo.order.rq.CrudRq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderDetailRepository orderDetailRepository;
    private final OrdersRepository ordersRepository;
    private final ItemClient itemClient;

    public OrderDto queryOrderById(String orderId) {
        Order order = ordersRepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        List<OrderDetail> details = orderDetailRepository.findByOrderId(orderId);

        for (OrderDetail detail : details) {
            Item item = itemClient.getItemById(new CrudRq(detail.getItemId()));
            detail.setItem(item); // 設回每個 detail
        }

        return new OrderDto(order, details); // items 不用額外傳
    }

}





