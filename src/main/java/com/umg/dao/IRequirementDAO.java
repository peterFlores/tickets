package com.umg.dao;

import org.springframework.data.repository.CrudRepository;

import com.umg.models.Requeriment;

public interface IRequirementDAO extends CrudRepository<Requeriment, Long> {

}
