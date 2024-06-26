package com.spring.security.persistence.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="user")
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    private String email;

    private String password;



}
