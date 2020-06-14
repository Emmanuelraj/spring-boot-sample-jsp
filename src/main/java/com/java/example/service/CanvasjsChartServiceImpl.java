/**
 * 
 */
package com.java.example.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.example.dao.CanvasjsChartDaoImpl;
import com.java.example.interfaces.CanvasjsChartDao;
import com.java.example.interfaces.CanvasjsChartService;

/**
 * @author er
 *
 */
//CanvasjsChartService.java


public class CanvasjsChartServiceImpl implements CanvasjsChartService {
	 
	
	 CanvasjsChartDaoImpl canvasjsChartDao = new CanvasjsChartDaoImpl();
 
	
 
	@Override
	public List<List<Map<Object, Object>>> getCanvasjsChartData() {
		return canvasjsChartDao.getCanvasjsChartData();
	}
 
}  