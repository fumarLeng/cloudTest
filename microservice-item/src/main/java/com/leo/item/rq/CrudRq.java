package com.leo.item.rq;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "傳入 ID 查詢或刪除")
@Data
public class CrudRq {

    @ApiModelProperty(value = "商品 ID", example = "1", required = true)
    private Long id;
}
