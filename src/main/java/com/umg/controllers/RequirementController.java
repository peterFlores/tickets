package com.umg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umg.models.Area;
import com.umg.models.Requeriment;
import com.umg.models.User;
import com.umg.services.IAreaService;
import com.umg.services.IRequirementService;
import com.umg.services.IUserService;

@RestController
@RequestMapping("requirement")
public class RequirementController {

	@Autowired
	private IRequirementService service;
	
	@Autowired
	private IAreaService serviceArea;
	
	@Autowired
	private IUserService serviceUser;
	
	@GetMapping("list")
	public List<Requeriment> list() {
		return service.findAll();
	}
	
	@PostMapping("save/area/{area}/user/{user}/user_tech/{userT}")
	public Requeriment save(@ModelAttribute Requeriment req, @PathVariable Long area, @PathVariable Long user,
			@PathVariable Long userT) {
		
		User normalUser = serviceUser.findById(user);
		User techUser = serviceUser.findById(userT);
		
		Area are = serviceArea.findById(area);
		System.out.println(userT);
		if (are == null) {
			throw new RuntimeException("NO EXISTE EL AREA");
		}
		
		if (normalUser == null || !normalUser.getRole().getRoleName().equals("NORMAL")) {
			throw new RuntimeException("USUARIO INVALIDO");
		}
		
		if (techUser == null || !techUser.getRole().getRoleName().equals("TECH")) {
			throw new RuntimeException("USUARIO TECNICO INVALIDO");
		}
		req.setArea(are);
		req.setUserReq(normalUser);
		req.setUserReceiver(techUser);
		req.setReqStatus("ACTIVO");
		return service.save(req);
	}
	
	@PostMapping("update/status/{status}/requeriment/{requirement}")
	public Requeriment save(@PathVariable String status, @PathVariable Long requirement) {
		Requeriment req = service.findById(requirement);
		req.setReqStatus(status);
		return service.save(req);
	}
}
