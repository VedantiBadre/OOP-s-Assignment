package com.oops.Shape;

public class ClassShapeArea {

	public static void main(String[] args) {
		ClassRec r = new ClassRec(2, 12);
        System.out.println("Rectangle - Area: " + r.area());
        
        ClassSquare s = new ClassSquare(12);
        System.out.println("Square Area : "+s.area());
        
        ClassTriangle t = new ClassTriangle(8, 6);
        System.out.println("Triangle Area is "+t.area());
	}

}
