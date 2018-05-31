package com.panda.fairytail.controller;

import com.panda.fairytail.entity.ProductInfo;
import com.panda.fairytail.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author PengCheng
 * @create 2018-05-22 3:47 PM
 */
@RestController
@Slf4j
public class HelloController {

    @Autowired
    private HelloService helloService;

    @PostMapping("/test")
    public String test(String testName) {
        System.out.println(testName);
        log.error("testname:{}",testName);
        return "vueTest";

    }

    @GetMapping("test/{id}")
    public ProductInfo getProductInfoById (@PathVariable(value = "id") String id){
        ProductInfo result = helloService.getProductInfoById(id);

        return result;
    }

}
