package com.capgemini.test1;

public class TwoThreads {
	private static Object resource = new Object();
	 
	  private static void delay(long n) {
	  try { Thread.sleep(n); }
	  catch (Exception e) { System.out.print("Error "); }
	  }
	 
	  public static void main(String[] args) {
	  System.out.print("StartMain ");
	  new Thread1().start();
	  delay(1000);
	 // Thread t2 = new Thread2();
	//  t2.start();
	  delay(1000);
	//  t2.interrupt
	//  delay(1000);
	  System.out.print("EndMain ");
}
}
 
