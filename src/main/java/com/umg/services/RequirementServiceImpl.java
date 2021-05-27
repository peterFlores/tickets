package com.umg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umg.dao.IRequirementDAO;
import com.umg.models.Requeriment;

@Service
public class RequirementServiceImpl implements IRequirementService {
	
	@Autowired
	private IRequirementDAO service;

	@Override
	public List<Requeriment> findAll() {
		// TODO Auto-generated method stub
		return (List<Requeriment>) service.findAll();
	}

	@Override
	public Requeriment findById(Long id) {
		// TODO Auto-generated method stub
		return service.findById(id).orElse(null);
	}

	@Override
	public void deleteById(Long id) {
		service.deleteById(id);
		
	}

	@Override
	public Requeriment save(Requeriment req) {
		// TODO Auto-generated method stub
		return service.save(req);
	}
}
