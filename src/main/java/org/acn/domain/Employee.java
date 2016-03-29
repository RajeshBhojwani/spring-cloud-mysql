package org.acn.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`Employee`")
public class Employee {
	
	@Id
	private volatile String id;
	
	@Column(nullable = false)
    private String employeeName;

	Employee(){
		
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Employee(String id, String employeeName) {
		super();
		this.id = id;
		this.employeeName = employeeName;
	}

	
}

