package com.example.Login.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class user {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "name")
    private String name;

    @Column (name = "email")
    private String email;

    @Column (name = "password")
    private String password;

}
