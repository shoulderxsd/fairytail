package com.panda.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author PengCheng
 * @create 2018-06-11 5:20 PM
 */
@RestController
public class HelloController {
    @Autowired
    SchedualService schedualService;
    @GetMapping(value = "/hello")
    public String sayHi(@RequestParam String name){
        return schedualService.sayHelloFromClient(name);
    }

}
