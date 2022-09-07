package com.oops.Shape;

public class ClassSquare implements ClassShape {

	private double s;
	 public ClassSquare(double s) {
	        this.s = s;  
	    }
	    @Override
	    public double area() {
	        return s*s*s*s;
	    }
}

