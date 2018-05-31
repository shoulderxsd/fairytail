package com.panda.fairytail;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 外置 tomcat 启动类
 *
 * @author PengCheng
 * @create 2018-05-22 1:45 PM
 */

public class SpringBootStartApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        //指向原先用main方法执行的Application启动类
        return builder.sources(FairytailApplication.class);
    }
}