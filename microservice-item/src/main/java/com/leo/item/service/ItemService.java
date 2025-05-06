package com.leo.item.service;

import com.leo.item.entity.Item;
import com.leo.item.repo.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public Item findById(Long id) {
        return itemRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"找不到 ID : " + id + "的商品"));
    }

    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    public Item updateItem(Item item) {
        if (!itemRepository.existsById(item.getId())) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "找不到要更新的商品 ID：" + item.getId());
        }
        return itemRepository.save(item);
    }

    public void deleteById(Long id) {
        if (!itemRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "找不到要刪除的商品 ID：" + id);
        }
        itemRepository.deleteById(id);
    }

}




