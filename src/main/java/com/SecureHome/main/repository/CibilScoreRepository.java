package com.SecureHome.main.repository;

import java.util.Random;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SecureHome.main.model.CibilScore;
@Repository
public interface CibilScoreRepository extends JpaRepository<CibilScore, Integer>{

	void save(String cibilscore);


	

}
