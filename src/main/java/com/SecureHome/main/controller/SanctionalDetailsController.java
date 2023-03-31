package com.SecureHome.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SecureHome.main.model.SanctionalDetails;
import com.SecureHome.main.service.SanctionalDetailsService;

@RestController
public class SanctionalDetailsController {

	@Autowired
	SanctionalDetailsService service;
	
	@PostMapping("/postSanctionDetails")
	public String saveSanctionDetails(@RequestBody SanctionalDetails sd)
	{
		SanctionalDetails sdetails=service.saveSanctionDetails(sd);
		return sdetails.getSanctionId() +" Saved In Database";
	}
	
	@GetMapping("/getSanctionDetails")
	public List<SanctionalDetails> getSanctionDetails()
	{
		List<SanctionalDetails> list=service.getSanctionDetails();
		return list;
	}
	
}
