package com.example.demo3.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo3.bean.Test;
import com.example.demo3.bean.User;
import com.example.demo3.feign.DemoClient;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @auther zhangkeshun
 * @Package${PCAKAGE_NAME}
 */
@RestController
@RequestMapping("/test")
@Api("测试")
public class TestController {


    @Resource
    private DemoClient demoClient;


    @GetMapping("sso")
    public String getStr(String str) {
        System.out.println("sso联调测试+" + str);
        return str;
    }


    @GetMapping("/ceshi/{time}")
    public String ceshi(@PathVariable int time) throws InterruptedException {
        Thread.sleep(time);
        System.out.println("ceshi当前时间为：" + System.currentTimeMillis());
        return "ceshi B  time=" + time;
    }

    @GetMapping("/error")
    public void error() {
        int a = 1 / 0;
    }

    @GetMapping("/ceshi")
    public String ceshi12(int time) throws InterruptedException {
        Thread.sleep(time);
        System.out.println("ceshi当前时间为：" + System.currentTimeMillis());
        return "ceshi A time=" + time;
    }


    @GetMapping("/msp")
    public String msp(int time) throws InterruptedException {
        Thread.sleep(time);
        System.out.println("ceshi当前时间为：" + System.currentTimeMillis());
        return "MSP A time=" + time;
    }


    @GetMapping("/ceshi/ss/{time}")
    public String ceshi1(@PathVariable int time) throws InterruptedException {
        Thread.sleep(time);
        System.out.println("ceshi当前时间为：" + System.currentTimeMillis());
        return "ceshi C time=" + time;
    }


    @GetMapping("/ceshi/sss/{time}")
    public String sss(@PathVariable int time) throws InterruptedException {
        Thread.sleep(time);
        System.out.println("ceshi当前时间为：" + System.currentTimeMillis());
        return "ceshi sss time=" + time;
    }


    @GetMapping("/demo/{time}")
    public String ceshi11(@PathVariable int time) throws InterruptedException {
        Thread.sleep(time);
        System.out.println("demo当前时间为：" + System.currentTimeMillis());
        return "demo time=" + time;
    }

    @GetMapping("/ratelimit")
    public String ceshi2() {
        System.out.println("ratelimit当前时间为：" + System.currentTimeMillis());
        return "限流测试";
    }

    @GetMapping("/ratelimit1")
    public String ceshi3() {
        System.out.println("ratelimit1111111111当前时间为：" + System.currentTimeMillis());
        return "限流测试1111111111";
    }


    @GetMapping("/demo")
    public String demo() {
        return demoClient.demo();
    }


    @ApiOperation(value = "计算+", notes = "加法")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "a", paramType = "path", value = "数字a", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "b", paramType = "path", value = "数字b", required = true, dataType = "Long")
    })
    @GetMapping("/{a}/{b}")
    public Integer get(@PathVariable Integer a, @PathVariable Integer b) {
        return a + b;
    }


    @GetMapping("/user")
    public User getUser() {
        User u = new User();
        u.setId("get");
        u.setAddress("北京");
        return u;
    }


    @PostMapping("/user")
    public User postUser() {
        User u = new User();
        u.setId("post");
        u.setAddress("北京");
        u.setUserName("null");
        return u;
    }


    @PutMapping("/user")
    public User putUser() {
        User u = new User();
        u.setId("put");
        u.setAddress("北京");
        u.setUserName("");
        return u;
    }

    @DeleteMapping("/user")
    public User delUser() {
        User u = new User();
        u.setId("del");
        u.setAddress("北京");
        u.setUserName("ceshi");
        return u;
    }


    @RequestMapping(value = "/user", method = RequestMethod.PATCH)
    public User patchUser() {
        User u = new User();
        u.setId("patch");
        u.setAddress("北京");
        u.setUserName("ceshi");
        return u;
    }


    @RequestMapping(value = "/user", method = RequestMethod.HEAD)
    public User headUser() {
        User u = new User();
        u.setId("head");
        u.setAddress("北京");
        u.setUserName("ceshi");
        return u;
    }


    @RequestMapping(value = "/user", method = RequestMethod.OPTIONS)
    public User optionsUser() {
        User u = new User();
        u.setId("options");
        u.setAddress("北京");
        u.setUserName("ceshi");
        return u;
    }


    @RequestMapping(value = "/user", method = RequestMethod.TRACE)
    public User traceUser() {
        User u = new User();
        u.setId("trace");
        u.setAddress("北京");
        u.setUserName("ceshi");
        return u;
    }


    @GetMapping("/test")
    public Test getTest() {
        Test t = new Test();
        t.setA1("aaa");
        t.setA2("bbb");
        t.setA3("ccc");
        t.setA4("ddd");
        return t;
    }


}
