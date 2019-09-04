package com.java8.forEach;

import java.util.ArrayList;
import java.util.List;

public class ForEachBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> rollNoList = new ArrayList();
		
		rollNoList.add(1);
		rollNoList.add(12);
		rollNoList.add(41);
		rollNoList.add(40);
		rollNoList.add(21);
		rollNoList.add(52);
		rollNoList.add(38);
		List oddList =new ArrayList();
		List evenList = new ArrayList();
		rollNoList.forEach(noList->System.out.println(noList));
		
		
		rollNoList.forEach(noList->{
			
			
			if((Integer)noList%2 == 0){
				evenList.add(noList);
			}else{
				oddList.add(noList);
			}
		});
		
		
		System.out.println("Even Number");
		evenList.forEach(evenNumber->System.out.println(evenNumber));
		System.out.println("Odd Number");
		oddList.forEach(oddNumber->System.out.println(oddNumber));
	}

}

