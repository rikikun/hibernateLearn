package com.augmentis;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee {
	   @Id
	   @Column(name="id")
	   private int id;
	   
	   @Column(name="first_name")
	   private String firstName; 
	   
	   @Column(name="last_name")
	   private String lastName;
	   
	   @Column(name="salary")
	   private int salary;
	   
	   @ManyToOne
	   @JoinColumn(name="DEPARTMENT_ID")
	   private Department department;
	   public Employee() {
		// TODO Auto-generated constructor stub
	}
	   public Employee(String frist,String last,int sala,Department dp) {
		firstName=frist;
		lastName=last;
		salary=sala;
		department=dp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}

}
