package com.leo.order.service;

import com.leo.order.entity.Item;
import com.leo.order.properties.OrderProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final RestTemplate restTemplate;
    private final OrderProperties orderProperties;

    public Item queryItemById(Long id) {

        String itemUrl = "http://app-item/items/{id}";
        Item item = restTemplate.getForObject(itemUrl, Item.class, id);
        System.out.println("訂單服務呼叫商品服務,itemId:" + id + ",item:" + item);
        return item;

//        return this.restTemplate.getForObject(orderProperties.getItem().getUrl() + id, Item.class);
    }
}


