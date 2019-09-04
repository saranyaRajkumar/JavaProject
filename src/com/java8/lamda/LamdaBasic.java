package com.java8.lamda;

 

public class LamdaBasic {

	static int val=20,val1=70;
	/**
	 * (argument-list) -> {body}  
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int width=10;  
        
        //Using Annonyms InnerClass
        
		Shape innerSh= new Shape(){

			@Override
			public void draw() {
				// TODO Auto-generated method stub
				System.out.println("Inner Class Implementation");
			}
        	
        	
        };
        
        innerSh.draw();
        

        //with Lambda Expression
        Shape sh=()->{  
            System.out.println("Drawing "+width);  
        };  
        sh.draw();  
        
        
       //Using inner Class 
        int result = new Calculation(){

			@Override
			public int addtion(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
                	
        }.addtion(val, val1);
        
        
        System.out.println("Calculation inner Class Result:==>"+result);
        
        //With Argument and Return Type
        Calculation addObj = (int a,int b)->{
        	
        	return (a+b);
        	
        };
        
        System.out.println("Addition ==>"+ addObj.addtion(10, 20));
        
        //With Argument with out return keyword,data Type
        
        Calculation addObj1 = (a,b)-> (a+b);
        	
        System.out.println("Addition ==>"+ addObj1.addtion(40, 20));	
       
	}

}
