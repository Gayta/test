package com.chinasoft.app.service.impl;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import com.chinasoft.app.dao.EmpDao;
import com.chinasoft.app.domain.Emp;
import com.chinasoft.app.service.EmpService;

@Transactional
public class EmpServiceImpl implements EmpService{
	private EmpDao empDao;
	
	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

	@Override
	public List<Emp> listPage(String query, int currentPage, int pageSize) {
		return empDao.listPage(query, currentPage, pageSize);
	}

}
