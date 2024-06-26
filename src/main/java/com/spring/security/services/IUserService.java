package com.spring.security.services;

import com.spring.security.persistence.entities.UserEntity;

import java.util.List;

public interface IUserService {

    List<UserEntity> findAllUsers();
}
