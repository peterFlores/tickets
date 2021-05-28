package com.umg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umg.models.Area;
import com.umg.services.IAreaService;

@RestController
@RequestMapping("area")
public class AreaController {
	
	@Autowired
	private IAreaService service;
	
	@GetMapping("list")
	public List<Area> list() {
		return service.findAll();
	}
	
	@PostMapping("save")
	public Area save(@ModelAttribute Area area) {
		return service.save(area);
	}

}
