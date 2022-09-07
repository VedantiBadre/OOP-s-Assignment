package com.oops.Shape;

public class ClassTriangle implements ClassShape {

	private double base;
    private double height;
    
    public ClassTriangle(double base, double height) {
        this.base=base;
        this.height=height;
    }
   @Override
    public double area() {
        return (base*height)/2;
    }
}

