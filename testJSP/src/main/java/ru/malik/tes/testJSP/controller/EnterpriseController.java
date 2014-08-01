package ru.malik.tes.testJSP.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ru.malik.tes.testJSP.domain.Enterprise;
import ru.malik.tes.testJSP.service.EnterpriseService;

@Controller
@RequestMapping({"/enteprise"})
public class EnterpriseController {
	@Autowired
	private EnterpriseService enterpriseService;
	
	@RequestMapping(method = RequestMethod.GET, params ="new")
	public String createEnterprise(Model model){
		System.out.println("hi");
		model.addAttribute(new Enterprise());
		
		return "enterprise/edit";
	}
	

	@RequestMapping()
	public String index(Model model) {
		
		model.addAttribute("enterprises", enterpriseService.getAllEnterprise());
		return "index";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String addEnterprise(@Valid Enterprise enterprise, BindingResult bindingResult, Model model){
		if(bindingResult.hasErrors()){
			return "enterprise/edit";
		}
		enterpriseService.addEnterprise(enterprise);
		return "enterprise/edit";
	}
}
