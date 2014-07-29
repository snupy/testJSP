package ru.malik.tes.testJSP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ru.malik.tes.testJSP.service.EnterpriseService;

@Controller
public class EnterpriseController {
	@Autowired
	private EnterpriseService enterpriseService;
	
	@RequestMapping({"/","/home"})
	public String index(Model model) {
		System.out.println("hi");
		model.addAttribute("enterprises", enterpriseService.getAllEnterprise());
		return "index";
	}
}
