package com.leo.order.dto;

import com.leo.order.entity.Item;
import com.leo.order.entity.Order;
import com.leo.order.entity.OrderDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    private Order order;
    private List<OrderDetail> orderDetails;
}