package com.SecureHome.main.service;

import java.util.List;

import com.SecureHome.main.model.CibilScore;

public interface CibilScoreService {

	CibilScore saveCibilScore(CibilScore cb);

	List<CibilScore> getCibilScore();

	void saveCibilScore(String cibilscore);
}
