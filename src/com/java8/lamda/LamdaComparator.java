package com.java8.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student st =  new Student(10,"raj",5);
		Student st1 = new Student(11,"anbu",7);
		Student st3 = new Student(14,"bala",10);
		Student st2 = new Student(20,"sue",8);
		Student st5 = new Student(10,"bob",10);
		Student st6 = new Student(17,"A",10);
		Student st7 = new Student(18,"Zoo",10);
		List<Student> lt= new ArrayList<>();
		lt.add(st1);
		lt.add(st2);
		lt.add(st3);
		lt.add(st7);
		
		lt.add(st);
		lt.add(st6);
		lt.add(st5);
		
		 System.out.println("Before Sorting Employees list sorted by ID and Name:\n"+lt);
		//Collections.sort((List<T>) lt);
		 
		//Anonymous Class
		Collections.sort(lt, new LamdaComparator().studentNameAndCount);
				
		   System.out.println("Employees list sorted by ID and Name:\n"+lt);
		   
		   //Method local class
		   Collections.sort(lt, new Comparator<Student>(){

				@Override
				public int compare(Student o1, Student o2) {
					// TODO Auto-generated method stub
					
					
					return o1.getSubjectCount()-o2.getSubjectCount();
					
				}
		
			}
		 );
		   
			//Using Lamda expression
			
			Collections.sort(lt , (p1,p2)->{
				
				
				return p1.getSubjectCount()-(p2.getSubjectCount());
			});
			
			
			  System.out.println("Employees list sorted by Subject ID and Name:\n"+lt);
			//Another way to implement lamda
			
				Comparator<Student> comp=(p1,p2)->{
				
				
					int flag=p1.getId()-(p2.getId());
					
					if(flag==0){
						flag= p1.getSubjectCount()-(p2.getSubjectCount());
					}
					return flag;
				};
				
				Collections.sort(lt,comp);
				 System.out.println("Employees list sorted by ID and Name:\n"+lt);
			//Using Lamda expression
			
			Collections.sort(lt , (o1,o2)->{
			
				int flag=o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
				if(flag==0)
				 flag= o1.getSubjectCount()-(o2.getSubjectCount());
				
				return flag;
			});
				
		//
	}
	
	// Anonymous inner class
	Comparator<Student> studentNameAndCount = new Comparator<Student>(){

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			
			int flag=o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
			
			if(flag==0){
				flag=o1.getSubjectCount()-o2.getSubjectCount();
			}
			return flag;
		}
		
		
	};
	
	
	
}	

class Student{
	
	int id;
	String name;
	int subjectCount;
	
	Student(int id,String name,int subjectCount){
		
		this.id=id;
		this.name=name;
		this.subjectCount=subjectCount;
	}

	/**
	 * @return the subjectCount
	 */
	public int getSubjectCount() {
		return subjectCount;
	}

	/**
	 * @param subjectCount the subjectCount to set
	 */
	public void setSubjectCount(int subjectCount) {
		this.subjectCount = subjectCount;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	 @Override
	    //this is required to print the user friendly information about the Employee
	    public String toString() {
	        return "[id=" + this.id + ", name=" + this.name + ", Count=" + this.subjectCount + "]";
	    }
	
}
