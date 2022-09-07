package com.oops.concepts;

import java.util.Date;

public class Employee1 {

	public static void main(String[] args) {
		   Employee emp= new Employee();
        emp.setEmpid(111);
        emp.setEmpname("Vedanti");
        emp.setEmpsalary(30000);
        emp.setEmpaddress("Amravati");
        emp.setEmp_dob(new Date(06-12-1995));
        emp.setEmp_doj(new Date(27-06-2022));
        System.out.println(emp);
	}
}
