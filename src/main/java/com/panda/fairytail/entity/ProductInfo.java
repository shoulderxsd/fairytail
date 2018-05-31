package com.panda.fairytail.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 商品类
 *
 * @author PengCheng
 * @create 2018-05-27 5:43 PM
 */

@Data
public class ProductInfo {

    /** 商品id */
    private String productId;
    /** 商品名称 */
    private String productName;
    /** 商品单价 */
    private BigDecimal productPrice;
    /** 库存 */
    private Integer productStock;
    /** 商品描述 */
    private String productDescprition;
    /** 商品小图 */
    private String productIcon;
    /** 商品状态,0正常1下架 */
    private Integer productStatus;
    /** 类目编号 */
    private Integer categoryType;

}
