package com.chinasoft.app.action;

import java.util.List;
import org.apache.struts2.ServletActionContext;
import com.chinasoft.app.domain.Emp;
import com.chinasoft.app.service.EmpService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class EmpAction extends ActionSupport implements ModelDriven<Emp>{
	private Integer page;
	
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}

	private Emp emp = new Emp();
	//注入userService
	private EmpService empService;

	public void setEmpService(EmpService empService) {
		this.empService = empService;
	}

	public String findPage(){
//		int page = (int) ServletActionContext.getRequest().getAttribute("page");
		if(page==null) {
			List<Emp> list = this.empService.listPage("from Emp", 1, 5);
			ServletActionContext.getRequest().setAttribute("list", list);
			return SUCCESS;
		}
		List<Emp> list = this.empService.listPage("from Emp", page, 5);
		return SUCCESS;
	}
	
	@Override
	public Emp getModel() {
		return emp;
	}

}
