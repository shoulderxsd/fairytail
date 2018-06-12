package com.panda.feign;

import org.springframework.stereotype.Component;

/**
 * @author PengCheng
 * @create 2018-06-12 11:27 PM
 */
@Component
public class SchedualServiceHiHystric implements SchedualService{
    @Override
    public String sayHelloFromClient(String name) {
        return "sorry 服务已断开" + name;
    }
}
