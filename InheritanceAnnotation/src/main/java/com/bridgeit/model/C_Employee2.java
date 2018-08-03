package com.bridgeit.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name = "cont_employeeTPS")  
@PrimaryKeyJoinColumn(name="ID")  

public class C_Employee2 extends Employee1 {
	 private float pay_per_hour;
	 private String contract_duration;
	 
	public float getPay_per_hour() {
		return pay_per_hour;
	}
	public void setPay_per_hour(float pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}
	public String getContract_duration() {
		return contract_duration;
	}
	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}


}
