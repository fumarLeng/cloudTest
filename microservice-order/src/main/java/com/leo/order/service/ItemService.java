package com.leo.order.service;

import com.leo.order.client.ItemClient;
import com.leo.order.entity.Item;
import com.leo.order.rq.CrudRq;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemClient itemClient;

    public Item queryItemById(Long id) {
        return itemClient.getItemById(new CrudRq(id));
    }
}


