package com.example.demo3.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo3.bean.Result;
import com.example.demo3.bean.Test;
import com.example.demo3.bean.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @author zhangkeshun
 * @description
 * @date 2019/12/5 15:35
 * @since jdk 1.8
 */
@Controller
@RequestMapping("/demo")
@Api("测试")
public class DemoController {

    @GetMapping("cros")
    public String cros(){

        return "cros";
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



    @GetMapping("/result")
    public Result<List<User>> getUser(){
        List<User> users=new ArrayList<>();
        User u=new User();
        u.setId("123456789");
        u.setAddress("北京");
        u.setUserName("ceshi");
        users.add(u);
        return new Result<>(200,"成功",users );
    }


    @GetMapping("/hash")
    public HashMap<String,Object> getHash(){
        HashMap<String,Object> r=new HashMap<>();
        Test t=new Test();
        t.setA1("aaa");
        t.setA2("bbb");
        t.setA3("ccc");
        t.setA4("ddd");
        r.put("t",t );
        r.put("code",200 );
        r.put("msg","成功" );
        return r;
    }



    @GetMapping("/fasejson")
    public JSONObject getFastJson(){
        JSONObject jsonObject=new JSONObject();
        Test t=new Test();
        t.setA1("aaa");
        t.setA2("bbb");
        t.setA3("ccc");
        t.setA4("ddd");
        jsonObject.put("t", t);
        jsonObject.put("code",200 );
        jsonObject.put("msg","成功" );
        return jsonObject;
    }


    @GetMapping("/string")
    public String getString(){
        JSONObject jsonObject=new JSONObject();
        Test t=new Test();
        t.setA1("aaa");
        t.setA2("bbb");
        t.setA3("ccc");
        t.setA4("ddd");
        jsonObject.put("t", t);
        jsonObject.put("code",200 );
        jsonObject.put("msg","成功" );
        return JSON.toJSONString(jsonObject);
    }



}
