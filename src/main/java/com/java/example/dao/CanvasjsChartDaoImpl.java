package com.java.example.dao;

import java.util.List;
import java.util.Map;

import com.java.example.interfaces.CanvasjsChartDao;
import com.java.example.model.CanvasjsChartData;

public class CanvasjsChartDaoImpl implements CanvasjsChartDao {
	 
	@Override
	public List<List<Map<Object, Object>>> getCanvasjsChartData() {
		return CanvasjsChartData.getCanvasjsDataList();
	}
 
}  