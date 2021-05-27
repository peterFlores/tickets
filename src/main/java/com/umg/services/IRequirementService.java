package com.umg.services;

import java.util.List;

import com.umg.models.Requeriment;

public interface IRequirementService {
	public List<Requeriment> findAll();
	public Requeriment findById(Long id);
	public void deleteById(Long id);
	public Requeriment save(Requeriment req);
}
