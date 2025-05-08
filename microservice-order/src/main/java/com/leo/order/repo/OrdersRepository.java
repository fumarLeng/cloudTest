package com.leo.order.repo;

import com.leo.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Order, String> {
}
