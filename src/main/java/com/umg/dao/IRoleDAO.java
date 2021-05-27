package com.umg.dao;

import org.springframework.data.repository.CrudRepository;

import com.umg.models.Role;

public interface IRoleDAO extends CrudRepository<Role, Long> {

}
