package com.java8.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class StreamBasic {

	Device device;
	StreamBasic(Device device){
		
		this.device=device;
	}
	
	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}
	 static void passingValue(String welcome){
		welcome = "raj";
	}
	
		public static void main1(String[] args) {
			// TODO Auto-generated method stub
			
			
			LinkedList<StreamBasic> linkedlist = new LinkedList<>();
			String str1 =null;
			passingValue(str1);
			
			System.out.println("Device Details==>"+str1);
			Device d1 = new Device("1","2");
			
			Device d2 = new Device("2","3");
			
			Device d3 = new Device("4","5");
			Device d4 = new Device("3","4");
			Device d5 = new Device("5","10");
			
			Device d6 = new Device("2","7");
			Device d7 = new Device("7","8");
			Device d9 = new Device("8","10");
			
			
			StreamBasic sb = new StreamBasic(d1);
			
			List<StreamBasic> etherNetList = new LinkedList<>();
			etherNetList.add(sb);
			
			List<StreamBasic> npeList = new LinkedList<>();
			npeList.add(new StreamBasic(d1));
			npeList.add(new StreamBasic(d2));
			npeList.add(new StreamBasic(d3));
			npeList.add(new StreamBasic(d4));
			npeList.add(new StreamBasic(d5));
			
			findPath(etherNetList,npeList);
			
			boolean found = true;
		  
			   while(found)
			   {
				   int size=etherNetList.size();
				   System.out.println("List Size ==>"+size);
					StreamBasic   etherNet =etherNetList.get(size-1);
				     for(StreamBasic npe : npeList){
				    	 
					   if(etherNet.getDevice().getEndName().equals(npe.getDevice().getStartName())){
						 
						   etherNetList.add(npe);
						    found =true;
						   break;
						}else{
							found=false;
						}
					   
				     }
			   }
		   
		   System.out.println("EtherNet List"+etherNetList.size());
		   int count=etherNetList.size();
		   etherNetList.forEach(etherNet->{
			  
			   System.out.println(etherNet.getDevice().getStartName()+":"+etherNet.getDevice().getEndName());
			  /* if(count==1){
				   System.out.println(etherNet.getDevice().getEndName()+"");
			   }*/
		   });
			
		   
		   List<String> myList = new ArrayList<String>();
			
			myList.add("1");
			myList.add("2");
			myList.add("3");
			myList.add("4");
			myList.add("5");
			
			/*Iterator<String> it = myList.iterator();
			while(it.hasNext()){
				String value = it.next();
				System.out.println("List Value:"+value);
				myList.remove(value);
				//if(value.equals("3")) myList.remove(value);
			}
			*/
			
			for(String str:myList){
				if(str.equals("4"));
				//myList.remove(str);
			}
			
			Map<Integer,String> map = new LinkedHashMap<Integer,String>();
			 map.put(1,"33");
			// map.put(2,"3");
		//	 map.put(3,"15");
			String str = map.values().toArray()[map.size()-1].toString();
			
			System.out.println("String "+str);
			
			
			
			String[] myStringArray = new String[]{"a","e","b","d"};
		}
		
		
		public static void main(String args[]){
			
		    Device d1 = new Device("1","2");
			
			Device d2 = new Device("2","3");
			
			Device d3 = new Device("4","5");
			Device d4 = new Device("3","4");
			Device d10 = new Device("3","21");
			Device d11 = new Device("5","11");
			Device d5 = new Device("11","10");
			
			Device d6 = new Device("2","7");
			Device d7 = new Device("7","8");
			Device d9 = new Device("8","10");
			
			
		/*	StreamBasic sb = new StreamBasic(d1);
			
			List<StreamBasic> etherNetList = new LinkedList<>();
			etherNetList.add(sb);*/
			
			List<StreamBasic> npeList = new LinkedList<>();
			npeList.add(new StreamBasic(d6));
			npeList.add(new StreamBasic(d2));
			npeList.add(new StreamBasic(d3));
			npeList.add(new StreamBasic(d10));
			npeList.add(new StreamBasic(d4));
			npeList.add(new StreamBasic(d5));
			npeList.add(new StreamBasic(d9));
			npeList.add(new StreamBasic(d7));
			npeList.add(new StreamBasic(d11));
			
			List<StreamBasic> tempList1 = findlongestPath(npeList,"3","10");
			List<StreamBasic> tempList2 = findlongestPath(npeList,"7","10");
			
			System.out.println("Size List 1 ==>"+tempList1.size());
			System.out.println("Size List 2 ==>"+tempList2.size());
			
			System.out.println("Device 1 Details");
			tempList1.forEach(StreamBasic->System.out.println(StreamBasic.getDevice()));
			System.out.println("Device 2 Details");
			tempList2.forEach(StreamBasic->System.out.println(StreamBasic.getDevice()));
		
		}
		
		public static List<StreamBasic> findlongestPath(List<StreamBasic> npeList,String startDeviceName,String endDeviceName){
			
			List<StreamBasic> deviceList = new LinkedList<StreamBasic>();
			
			for(int i =0;i<npeList.size();i++){
				    StreamBasic stream = npeList.get(i);
				if(startDeviceName.equals(stream.getDevice().getStartName())){
					startDeviceName =stream.getDevice().getEndName();
					deviceList.add(stream);
					npeList.remove(stream);//removing visited Nodes
					i=0;
					if(startDeviceName.equalsIgnoreCase(endDeviceName))
					    break;
					
				}
				
				
			}
			return deviceList;
			
		}
	
	
		public static void findPath(List<StreamBasic>  etherNetList , List<StreamBasic>  npeList){
			
			boolean found = true;
			  
			   while(found)
			   {
				   int size=etherNetList.size();
				   System.out.println("List Size ==>"+size);
					StreamBasic   etherNet =etherNetList.get(size-1);
				     for(int i = 0 ;i<npeList.size()-1; i++){
				    	 
				    	 StreamBasic   npe = npeList.get(0);
					   if(etherNet.getDevice().getEndName().equals(npe.getDevice().getStartName())){
						   
						   etherNetList.add(npe);
						   npeList.remove(npe);
						    found =true;
						   break;
						}else{
							found=false;
						}
					   
				     }
			   }
			
		}
		
		
		public StreamBasic findPathDetails(List<StreamBasic> npeList,int index){
			
			StreamBasic matchingNpe = npeList.get(index);
			for(int j=index+1;j<=npeList.size();j++){
				
				StreamBasic nextNpe = npeList.get(index);
				if(matchingNpe.getDevice().getStartName().equals(nextNpe.getDevice().getStartName())){
					
					
				}
			}
			
			return matchingNpe;
		}
		
}
	class Device{
		
		private String startName,EndName;
		Device(String startName,String EndName){
			
			this.startName=startName;
			this.EndName=EndName;
			
		}
		public String getStartName() {
			return startName;
		}
		public void setStartName(String startName) {
			this.startName = startName;
		}
		public String getEndName() {
			return EndName;
		}
		public void setEndName(String endName) {
			EndName = endName;
		}
		
		public String toString(){
			
			return this.startName+" ==>"+this.EndName;
		}
		
	}


