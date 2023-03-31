package com.SecureHome.main.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SecureHome.main.model.CibilScore;
import com.SecureHome.main.service.CibilScoreService;

@RestController
public class CibilScoreController {

	@Autowired
	CibilScoreService service;
	
	@PostMapping("/postCibilScore")
	public String saveCibilScore(@RequestBody CibilScore cb)
	{
		CibilScore cscore=service.saveCibilScore(cb);
		return cscore.getCibilId()+" Saved In Database";
	}
	
	@GetMapping("/getCibilScore")
	public List<CibilScore> getCibilScore()
	{
		List<CibilScore> list=service.getCibilScore();
		return list;
	}
	
	@GetMapping("/generateCibilScore")
	public String generateCibilScore()
	{
		int min=600;
		int max=900;
		
		Random random=new Random();
		CibilScore cs=new CibilScore();
		
		String cibilscore=String.valueOf(random.nextInt(max-min)+min);
		//service.saveCibilScore(cibilscore);
		return cibilscore+" Generated";
	}
	
	
	
}
