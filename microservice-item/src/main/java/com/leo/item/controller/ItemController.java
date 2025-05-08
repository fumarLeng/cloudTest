package com.leo.item.controller;

import com.leo.item.entity.Item;
import com.leo.item.rq.CrudRq;
import com.leo.item.service.ItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Api(tags = "商品管理 API")
@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @ApiOperation("建立商品")
    @PostMapping("/createItem")
    public Item createItem(@RequestBody Item item) {
        return itemService.createItem(item);
    }

    @ApiOperation("查詢單一商品")
    @PostMapping("/getItem")
    public Item getItem(@RequestBody CrudRq rq) {
        Item item = itemService.findById(rq.getId());
        log.info("item 服務回傳的  item:  {}", item.toString());
        return item;
    }

    @ApiOperation("查詢所有商品")
    @PostMapping("/getAll")
    public List<Item> getAllItems() {
        return itemService.findAll();
    }

    @ApiOperation("更新商品")
    @PostMapping("/updateItem")
    public Item updateItem(@RequestBody Item item) {
        return itemService.updateItem(item);
    }

    @ApiOperation("刪除商品")
    @PostMapping("/deleteItem")
    public String deleteItem(@RequestBody CrudRq rq) {
        itemService.deleteById(rq.getId());
        return "Delete OK";
    }

}
