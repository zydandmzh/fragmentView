package com.jd.fce.demo;

/**
 * Created by mazhihui on 2020/3/28.
 */
public class Result {
    private int resultCode;
    private String msg;

    public Result(){}

    public Result(int resultCode,String msg){
        this.resultCode = resultCode;
        this.msg = msg;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
