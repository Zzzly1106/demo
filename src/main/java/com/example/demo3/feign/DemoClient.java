package com.example.demo3.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @auther zhangkeshun
 * @Package${PCAKAGE_NAME}
 */

@FeignClient(name = "nacos")
public interface DemoClient {



    @RequestMapping(value = "/test/test",method = RequestMethod.GET)
    String demo();


}
