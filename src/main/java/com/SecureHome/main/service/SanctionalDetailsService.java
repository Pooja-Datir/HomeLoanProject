package com.SecureHome.main.service;

import java.util.List;

import com.SecureHome.main.model.SanctionalDetails;

public interface SanctionalDetailsService {

	SanctionalDetails saveSanctionDetails(SanctionalDetails sd);

	List<SanctionalDetails> getSanctionDetails();
	
}
