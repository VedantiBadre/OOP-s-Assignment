package com.oops.detailsCusAndEmp;

public class Demo {

	public static void main(String[] args) {
		 Department d1[]=new Department[2];
	        d1[0].setDeptid(10);
	        d1[1].setDname("Megha");
	        for(int i=0;i<d1.length;i++) {
	        	Employee e2 = new Employee(101, "neha", "indore", "01/04/2001", 15000.0, "02/06/2018", "pune", d1[i]);        
	        System.out.println(e2);
	        }

	        Customer u=new Customer();
	     // Employee e1 = new Employee(101, "Pooja", "Pune", "04/06/1999", 0, null, null, null);
	     //   Employee e1=new Employee(101, "Pooja", "Amravati", "04/06/1999", 25000.0, "08/08/2022", "Hinjewadi", null);
	        Employee e1=new Employee();
	        e1.setPid(1001);
	        System.out.println(e1.getPid());
	        
	        e1.setPname("Neelu");
	        System.out.println(e1.getPname());
	        
	        e1.setPaddress("Bhopal");
	        System.out.println(e1.getPaddress());
	        
	        e1.setDob("1/1/2000");
	        System.out.println(e1.getDob());
	        
	}

}
