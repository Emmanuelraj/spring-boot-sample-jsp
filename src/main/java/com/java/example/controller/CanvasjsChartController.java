/**
 * 
 */
package com.java.example.controller;

/**
 * @author er
 *
 */
import java.util.List;
import java.util.Map;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.example.interfaces.CanvasjsChartService;
import com.java.example.service.CanvasjsChartServiceImpl;
 

 
@Controller
@RequestMapping("/canvasjschart")
public class CanvasjsChartController {
 
	
	 
	 CanvasjsChartServiceImpl canvasjsChartService = new CanvasjsChartServiceImpl();
 
	@RequestMapping(method = RequestMethod.GET)
	public String springMVC(ModelMap modelMap) {
		List<List<Map<Object, Object>>> canvasjsDataList = canvasjsChartService.getCanvasjsChartData();
		modelMap.addAttribute("dataPointsList", canvasjsDataList);
		return "chart";
	}
 
}                       