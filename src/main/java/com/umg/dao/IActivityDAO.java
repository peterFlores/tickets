package com.umg.dao;

import org.springframework.data.repository.CrudRepository;

import com.umg.models.Activity;

public interface IActivityDAO extends CrudRepository<Activity, Long> {

}
