package com.SecureHome.main.service;

import java.util.List;

import com.SecureHome.main.model.DefaulterList;

public interface DefaulterListService {

	DefaulterList saveDefaulterList(DefaulterList dl);

	List<DefaulterList> getDefaulterList();

}
