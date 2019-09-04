package com.thread;

public class Callable {

	public static void main(String args[]){
		
		ParentClass ps = new Subclass();
		System.out.println(ps.sumofNumber());
	ps.numberValue();
	
	Subclass sb = new Subclass();
	sb.numberValue();
	}
}

class ParentClass{
	
public Object sumofNumber(){
		
		return 2;
	}

public void numberValue(){
	
	System.out.println("LoadParent");
}
	
}
class Subclass extends ParentClass{
	
   public Integer sumofNumber(){
		
		return 4;
	}
   
   public void numberValue(){
		
		System.out.println("LoadChild");
	}
	
}