package com.panda.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author PengCheng
 * @create 2018-06-11 5:17 PM
 */

@FeignClient(value = "service-hello",fallback = SchedualServiceHiHystric.class)
public interface SchedualService {
    @GetMapping(value = "/service02")
    String sayHelloFromClient(@RequestParam(value = "name") String name);
}
