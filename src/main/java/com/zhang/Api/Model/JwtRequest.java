package com.zhang.Api.Model;

import java.io.Serializable;

//存储我们从客户端收到的用户名和密码时需要此类。

public class JwtRequest implements Serializable {
    private static final long serialVersionUID = 5926468583005150707L;

    private String phonenumber;
    private String password;

    //need default constructor for JSON Parsing
    //需要JSON的默认构造函数Parsing
    public JwtRequest()
    {

    }
    public JwtRequest(String phonenumber, String password) {
        this.setPhonenumber(phonenumber);
        this.setPassword(password);
    }
    public String getPhonenumbere() {
        return this.phonenumber;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
