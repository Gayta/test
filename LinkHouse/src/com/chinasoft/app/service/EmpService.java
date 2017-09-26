package com.chinasoft.app.service;

import java.util.List;
import com.chinasoft.app.domain.Emp;

public interface EmpService {
	
	public List<Emp> listPage(String q,int currentPage,int pageSize);
	
}
