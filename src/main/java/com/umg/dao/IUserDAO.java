package com.umg.dao;

import org.springframework.data.repository.CrudRepository;

import com.umg.models.User;

public interface IUserDAO extends CrudRepository<User, Long> {

}
