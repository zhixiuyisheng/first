package com.gm.wj.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "admin_role_permission")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class AdminRolePermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    private int rid;
    private int pid;


}
