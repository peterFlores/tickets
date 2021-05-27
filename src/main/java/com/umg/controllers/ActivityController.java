package com.umg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.umg.models.Activity;
import com.umg.models.Project;
import com.umg.models.User;
import com.umg.services.IActivityService;
import com.umg.services.IProjectService;
import com.umg.services.IUserService;

@RestController
@RequestMapping("activity")
public class ActivityController {
	
	@Autowired
	private IActivityService service;
	
	@Autowired
	private IUserService serviceU;
	
	@Autowired
	private IProjectService serviceP;
	
	@GetMapping("list")
	public List<Activity> list() {
		return service.findAll();
	}
	
	@PostMapping("save/user/{userT}/project/{project}")
	public Activity save(@ModelAttribute Activity act, @PathVariable Long userT, @PathVariable Long project) {
		User user = serviceU.findById(userT);
		Project pj = serviceP.findById(project);
		
		if (user != null && pj != null) {
			act.setUserTech(user);
			act.setProject(pj);
			act.setActivityStatus("PENDIENTE");
			act.setActivityProgress(0.0);
			return service.save(act);
		}
		return null;
	}
	
	@PostMapping("update/activity/{id}")
	public Activity save (@PathVariable Long id, @RequestParam  Double progress) {
		Activity act = service.findById(id);
		act.setActivityProgress(progress);
		if (progress >= 100.0) {
			act.setActivityStatus("COMPLETADO");
		} else {
			act.setActivityStatus("EN PROCESO");

		}
		return service.save(act);
	}
}
