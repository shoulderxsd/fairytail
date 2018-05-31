package com.panda.fairytail.mapper;

import com.panda.fairytail.entity.ProductInfo;
import org.springframework.stereotype.Repository;

/**
 *
 *
 * @author PengCheng
 * @create 2018-05-27 5:43 PM
 */

@Repository
public interface ProductInfoMapper {
     ProductInfo getProductInfoById(String id);
}
