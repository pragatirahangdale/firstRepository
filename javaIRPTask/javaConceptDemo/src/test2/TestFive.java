package test2;


  public class TestFive {
  private int x;
  public void foo() {
  int current = x;
  x = current + 1;
  }
  public void go() {
  for(int i=0;i<5;i++) {
  new Thread() {
  public void run() {
  foo();
  System.out.print(x + ", ");
  } }.start();
  }}}
  
  /*
A. Move the line 12 print statement into the foo() method.
B. Change line 7 to public synchronized void go() {.
C. Change the variable declaration on line 3 to private volatile int x;.
D. Wrap the code inside the foo() method with a synchronized( this ) block.
E. Wrap the for loop code inside the go() method with a synchronized
	block synchronized(this) { // for loop code here }.

   */
