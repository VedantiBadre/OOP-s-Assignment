package com.oops.Shape;

public class ClassRec implements ClassShape{


	private double length;
    private double breadth;

   public ClassRec(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

   @Override
    public double area() {
       return length * breadth;
    }
}
