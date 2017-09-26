package com.chinasoft.app.dao;

import java.util.List;
import com.chinasoft.app.domain.Emp;

public interface EmpDao {
	public List<Emp> listPage(String query,int currentPage,int pageSize);
}
