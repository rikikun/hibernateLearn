package com.augmentis.action;

import org.apache.struts2.convention.annotation.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.augmentis.Department;
import com.augmentis.Employee;
import com.augmentis.MainApp;
import com.opensymphony.xwork2.ActionSupport;

@Namespace("")
@ResultPath(value="/")
public class EmployeeAction extends ActionSupport {
	/**
	 * 
	 */
	Employee em;
	Department dp;
	MainApp app;
	private static final long serialVersionUID = 1L;
	@Action(value="FristAnnotaion", results={
			@Result(name="success",location="successful.jsp"),
			@Result(name="korn" ,location="korn.jsp")
		})
	public String execute(){
		ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		em=(Employee)context.getBean("Employee");
		dp=(Department)context.getBean("Department");
		app=(MainApp)context.getBean("MainApp");
		em.setDepartment(dp);
		app.addEmployee(em);
		return "korn";
	}
	public Employee getEm() {
		return em;
	}
	public void setEm(Employee em) {
		this.em = em;
	}
	public Department getDp() {
		return dp;
	}
	public void setDp(Department dp) {
		this.dp = dp;
	}
}
