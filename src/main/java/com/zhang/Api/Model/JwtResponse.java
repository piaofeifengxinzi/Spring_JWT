package com.zhang.Api.Model;

import java.io.Serializable;

//这是创建包含要返回给用户的JWT的响应所必需的类。

public class JwtResponse implements Serializable {
    private static final long serialVersionUID = -8091879091924046844L;
    private final String jwttoken;
    public JwtResponse(String jwttoken) {
        this.jwttoken = jwttoken;
    }
    public String getToken() {
        return this.jwttoken;
    }
}