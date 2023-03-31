package com.SecureHome.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SecureHome.main.model.DefaulterList;
import com.SecureHome.main.repository.DefaulterListRepository;
import com.SecureHome.main.service.DefaulterListService;
@Service
public class DefaulterListServiceImpl implements DefaulterListService{

	@Autowired
	DefaulterListRepository repo;

	@Override
	public DefaulterList saveDefaulterList(DefaulterList dl) {
		DefaulterList dlist=repo.save(dl);
		return dlist;
	}

	@Override
	public List<DefaulterList> getDefaulterList() {
		List<DefaulterList> list=repo.findAll();
		return list;
	}
	
}
