package com.zhang.Api.Model;


//如下定义UserDTO模型类。它负责从用户获取值并将其传递到DAO层以插入数据库
//后期可以增加手机的imei
public class UserDTO {
    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String phonenumber;
    private String password;


}
