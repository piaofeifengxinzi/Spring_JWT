package com.zhang.Api.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

//它将在执行数据库操作时使用


@Entity
@Table(name = "user")
public class DAOUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String phonenumber;
    @Column
    @JsonIgnore
    private String password;

    public String getUsername() {
        return phonenumber;
    }

    public void setUsername(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
