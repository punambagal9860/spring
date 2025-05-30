package com.nt;

public class ClassA {
	
	  int x=10;
	  int y=20;
	public void meth1()
	{
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		  ClassA aobj=new ClassA();
		  aobj.meth1();

}
}