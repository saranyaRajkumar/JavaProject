package com.java8.functionalInterface;

/**
 * @author ab98210
 *
 */
public class FunctionalInterfaceBasic implements functional{

	/**
	 * @param arg
	 */
	public static void main(String arg[]){
		
		System.out.println("From Main method");
		
		functional.staticMethod();
		
		FunctionalInterfaceBasic implObj = new FunctionalInterfaceBasic();
		implObj.abstractMethod();
		implObj.MethodImpl();
		
		
		
		
	}
	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("Abstract Method Implementation");
	}

}



/**
 * @author ab98210
 * Interface contain only one abstract method then it will be called as Functional Interface
 * It can contain any number of static and default method
 */
@FunctionalInterface
interface functional{
	
	void abstractMethod();
	
	/**
	 * method introduced in java 8
	 * 
	 */
	default void MethodImpl(){
		
		System.out.println("Default method implementation");
	}
	
	/**
	 * method introduced in java 8
	 * 
	 */
	static void staticMethod(){
		
		System.out.println("Interface static method implementation");
	}
}