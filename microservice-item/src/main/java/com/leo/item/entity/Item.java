package com.leo.item.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@ApiModel(description = "商品資訊")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "商品 ID", example = "1")
    @Column(name = "id")
    private Long id;

    @ApiModelProperty(value = "商品名稱", example = "商品1")
    @Column(name = "name")
    private String name;

    @ApiModelProperty(value = "圖片網址", example = "http://圖片1")
    @Column(name = "image")
    private String image;

    @ApiModelProperty(value = "商品描述", example = "商品描述1")
    @Column(name = "description")
    private String description;

    @ApiModelProperty(value = "商品價格", example = "1000")
    @Column(name = "price")
    private Long price;

}
