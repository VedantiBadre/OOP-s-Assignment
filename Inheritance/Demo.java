package com.oops.Inheritance;

public class Demo {

	public static void main(String[] args) {
        ClassElectronics e1=new ClassElectronics(1, "Cropton", "10-12-2022");
        ClassElectronics e2=new ClassMobile(2, "Samsung", "12-09-2021");
        ClassElectronics e3=new ClassLCD(3, "Sony", "06-12-2018");
        ClassElectronics e4=new ClassLaptop(4, "Asus", "26-05-2020");
        
        System.out.println("Electronic="+e1);
        System.out.println("Mobile="+e2);
        System.out.println("LCD="+e3);
        System.out.println("Laptop="+e4);
    }
}
