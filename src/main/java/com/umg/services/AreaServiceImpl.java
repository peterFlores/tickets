package com.umg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umg.dao.IAreaDAO;
import com.umg.models.Area;

@Service
public class AreaServiceImpl implements IAreaService {

	
	@Autowired
	private IAreaDAO service; 
	@Override
	public List<Area> findAll() {
		// TODO Auto-generated method stub
		return (List<Area>) service.findAll();
	}

	@Override
	public Area findById(Long id) {
		// TODO Auto-generated method stub
		return service.findById(id).orElse(null);
	}

	@Override
	public void deleteById(Long id) {
		service.deleteById(id);
		
	}

	@Override
	public Area save(Area area) {
		// TODO Auto-generated method stub
		return service.save(area);
	}
}
