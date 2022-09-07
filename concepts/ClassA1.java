package com.oops.concepts;

import java.util.Scanner;

public class ClassA1 {



		   double L;
		    double W;
		    double H;



		   public ClassA1(double L, double W, double H) {
		        super();



		   }



		   public ClassA1() {
		        super();
		        // TODO Auto-generated constructor stub
		    }



		   void areaOfTraingle(double L, double W, double H) {
		        double Traingle = L * W * H;



		       System.out.println("print area of tringle-" + Traingle);
		    }



		   void areaOfRectangle(double L, double H, double W) {



		       double Rectangle = L * W;



		       System.out.println("print area of Rectangle-" + Rectangle);
		    }



		   void areaOfSquare(double L, double H, double W) {



		       double Square = L * L;
		        System.out.println("print area of Square-" + Square);



		   }



		}



		