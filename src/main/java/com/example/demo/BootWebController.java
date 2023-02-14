package com.example.demo;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BootWebController {
	protected Log logger = LogFactory.getLog(this.getClass());

	@RequestMapping(value = "/")
	public String bootWeb(@RequestParam Map<String, Object> requestMap, Model model) throws Exception{
		model.addAttribute("requestMap", requestMap);
		return "bootWeb";
	}
}
