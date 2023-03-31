package com.SecureHome.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SecureHome.main.model.SanctionalDetails;
import com.SecureHome.main.repository.SanctionalDetailsRepository;
import com.SecureHome.main.service.SanctionalDetailsService;
@Service
public class SanctionalDetailsServiceImpl implements SanctionalDetailsService{

	@Autowired
	SanctionalDetailsRepository repo;
	
	@Override
	public SanctionalDetails saveSanctionDetails(SanctionalDetails sd) {
		SanctionalDetails sdetails=repo.save(sd);
		return sdetails;
	}

	@Override
	public List<SanctionalDetails> getSanctionDetails() {
		List<SanctionalDetails> list=repo.findAll();
		return list;
	}
}
