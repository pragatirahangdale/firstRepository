 package com.capgemini.service;

public class testThread extends testExamples {

	   public int gearRatio = 9;
	   public String accelerate() {  return  "Accelerate : SportsCar";  }
	   public static void main(String[] args)
	   {
		   testThread c = new testThread();
	      System.out.println( c.gearRatio+"  "+c.accelerate() );
	   }

}
