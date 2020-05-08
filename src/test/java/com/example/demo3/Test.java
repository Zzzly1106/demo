package com.example.demo3;

import reactor.core.publisher.Flux;

/**
 * @author zhangkeshun
 * @date 2020/4/28 16:52
 * @since jdk 1.8
 */

public class Test {


    public static void main(String[] args) {
        Flux.just("hello world").subscribe(System.out::println);

    }

}
