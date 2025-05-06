package com.leo.order.service;

import com.leo.order.client.ItemClient;
import com.leo.order.entity.Item;
import com.leo.order.entity.Order;
import com.leo.order.entity.OrderDetail;
import com.leo.order.repo.OrderRepository;
import com.leo.order.rq.CrudRq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

//    private final ItemService itemService;

    private final OrderRepository orderRepository;
    private final ItemClient itemClient;

    public Order queryOrderById(String orderId) {
        return orderRepository.findById(orderId)
                .map(order -> {
                    if (order.getOrderDetails() != null) {
                        for (OrderDetail detail : order.getOrderDetails()) {
                            if (detail.getItem() != null && detail.getItem().getId() != null) {
                                Item item = itemClient.getItemById(new CrudRq(detail.getItem().getId()));
                                detail.setItem(item);
                            }
                        }
                    }
                    return order;
                })
                .orElse(null);
    }


}





