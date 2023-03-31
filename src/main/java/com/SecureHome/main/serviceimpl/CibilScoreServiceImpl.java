package com.SecureHome.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SecureHome.main.model.CibilScore;
import com.SecureHome.main.repository.CibilScoreRepository;
import com.SecureHome.main.service.CibilScoreService;

@Service
public class CibilScoreServiceImpl implements CibilScoreService{

	@Autowired
	CibilScoreRepository repo;
	
	@Override
	public CibilScore saveCibilScore(CibilScore cb) {
		CibilScore cs=repo.save(cb);
		return cs;
	}

	@Override
	public List<CibilScore> getCibilScore() {
		List<CibilScore> list=repo.findAll();
		return list;
	}

	@Override
	public void saveCibilScore(String cibilscore) {
		repo.save(cibilscore);
		
	}

	
}
