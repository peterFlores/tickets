package com.umg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umg.dao.IActivityDAO;
import com.umg.models.Activity;

@Service
public class ActivityServiceImpl implements IActivityService {

	@Autowired
	private IActivityDAO service;
	
	@Override
	public List<Activity> findAll() {
		// TODO Auto-generated method stub
		return (List<Activity>) service.findAll();
	}

	@Override
	public Activity findById(Long id) {
		// TODO Auto-generated method stub
		return service.findById(id).orElse(null);
	}

	@Override
	public void deleteById(Long id) {
		service.deleteById(id);
		
	}

	@Override
	public Activity save(Activity activity) {
		// TODO Auto-generated method stub
		return service.save(activity);
	}
}
