package com.panda.fairytail.service.serviceImpl;

import com.panda.fairytail.entity.ProductInfo;
import com.panda.fairytail.mapper.ProductInfoMapper;
import com.panda.fairytail.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 测试
 *
 * @author PengCheng
 * @create 2018-05-28 12:01 PM
 */

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Override
    public ProductInfo getProductInfoById(String id) {
        return productInfoMapper.getProductInfoById(id);
    }
}
