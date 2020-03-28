package com.gm.wj.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "cour_user")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String username;
    private String password;
    private String salt;
    private String name;
    private String phone;
    private String email;
    private boolean enabled;
    @Transient
    private List<AdminRole> roles;

    // 默认构造函数
    public User() {}

    // 用于配合自定义查询的构造函数
    public User(int id,String username, String name, String phone, String email, boolean enabled) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.enabled = enabled;
    }

}

