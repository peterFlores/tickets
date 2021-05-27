package com.umg.services;

import java.util.List;

import com.umg.models.Activity;

public interface IActivityService {
	public List<Activity> findAll();
	public Activity findById(Long id);
	public void deleteById(Long id);
	public Activity save(Activity activity);
}
