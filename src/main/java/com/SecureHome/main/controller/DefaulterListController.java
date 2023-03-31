package com.SecureHome.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SecureHome.main.model.DefaulterList;
import com.SecureHome.main.service.DefaulterListService;

@RestController
public class DefaulterListController {

	@Autowired
	DefaulterListService service;
	
	@PostMapping("/postDefaulterList")
	public String saveDefaulterList(@RequestBody DefaulterList dl)
	{
		DefaulterList dlist=service.saveDefaulterList(dl);
		return dlist.getDefaulterId()+" Saved In Database";
	}
	
	@GetMapping("/getDefaulterList")
	public List<DefaulterList> getDefaulterList()
	{
		List<DefaulterList> list=service.getDefaulterList();
		return list;
	}
}
