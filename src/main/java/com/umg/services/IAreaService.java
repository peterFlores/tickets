package com.umg.services;

import java.util.List;

import com.umg.models.Area;

public interface IAreaService {
	public List<Area> findAll();
	public Area findById(Long id);
	public void deleteById(Long id);
	public Area save(Area area);
}
