package com.leo.order.rq;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description = "傳入 ID 查詢或刪除")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CrudRq {

    @ApiModelProperty(value = "商品 ID", example = "1", required = true)
    private Long id;
}
