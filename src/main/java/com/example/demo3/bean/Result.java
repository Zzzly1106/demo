package com.example.demo3.bean;

import java.io.Serializable;

/**
 * @author zhangkeshun
 * @description
 * @date 2019/12/10 13:48
 * @since jdk 1.8
 */
public class Result<T> implements Serializable {

    private int code;

    private String msg;

    private T data;


    public Result(int code,String msg){
        this.code=code;
        this.msg=msg;
    }


    public Result(int code,String msg,T data){
        this.code=code;
        this.msg=msg;
        this.data=data;
    }
}
