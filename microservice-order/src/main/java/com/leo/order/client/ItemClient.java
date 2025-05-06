package com.leo.order.client;

import com.leo.order.entity.Item;
import com.leo.order.rq.CrudRq;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "app-item")
public interface ItemClient {

    @PostMapping("/items/getItem")
    Item getItemById(@RequestBody CrudRq rq);
}
