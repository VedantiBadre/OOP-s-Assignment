package com.oops.Finalize;

public class ClassDemo {

	 public static void main(String[] args) {
         
	        ClassEmployee e1=new ClassEmployee(501);
	        ClassEmployee e2=new ClassEmployee(502);
	        ClassEmployee e3=new ClassEmployee(503);
	        ClassEmployee e4=new ClassEmployee(504);
	        ClassEmployee e5=new ClassEmployee(505);
	            
	            e2=null;
	            e5=null;
	            System.gc();
	            
	            for(int i=1;i<6;i++) {
	                String e="e"+i;
	                System.out.println(e+":"+e.hashCode());
	            }
	            System.out.println("e2="+e2);
	            System.out.println("e5="+e5);
	            
	    }
	}

