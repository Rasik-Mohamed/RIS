import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Array_Add_Data();
		
		Array_Fetch_Data_UsingIndex();
		
		Array_Verify_Data_Exist();
		
		Array_Compare_2_Arrays();
		
		Array_Remove_Data();
		
		Array_Print_Value_InLoop();
		*/
		Array_Print_Value_Sort();
		
		/*
		
		//ArrayList 1
		ArrayList<String> AL = new ArrayList<String>();
		
		//Add data to the ArrayList
		AL.add("DTCC");
		AL.add("CITI");
		AL.add("BMO");
		AL.add("RIS");
		
		AL.size();
		for (int i=0; i<AL.size();i++) {
			if(AL.get(i).equals("BMO")) {
				System.out.println("Arraylist Value for the BMO value is : "+i);
			}
			
		}*/
		
	}
	
	
	
	
		
		
		public static void Array_Add_Data() {
			
			//ArrayList 1
			ArrayList<String> AL = new ArrayList<String>();
			
			//Add data to the ArrayList
			AL.add("DTCC");
			AL.add("CITI");
			AL.add("BMO");
			AL.add("RIS");
			
			System.out.println(AL);
					
					
			
		}
		
		
		
		
		
		
		
		public static void Array_Fetch_Data_UsingIndex() {
			
			//ArrayList 1
			ArrayList<String> AL = new ArrayList<String>();
			
			//Add data to the ArrayList
			AL.add("DTCC");
			AL.add("CITI");
			AL.add("BMO");
			AL.add("RIS");
			
					
			//Fetch data from ArrayList1 using Index
			String SR = AL.get(0);
			System.out.println("Fetch :" + SR);
			
		}
		
		
		
		
		
		
		public static void Array_Verify_Data_Exist() {
			
			//ArrayList 1
			ArrayList<String> AL = new ArrayList<String>();
			
			//Add data to the ArrayList
			AL.add("DTCC");
			AL.add("CITI");
			AL.add("BMO");
			AL.add("RIS");
					
					
			boolean AE = AL.contains("BMO");
			if(AE) {
				System.out.println("Contains :" + AL.get(2));
			}
		}
		
		
		
		
		
		
		public static void Array_Compare_2_Arrays() {
			//ArrayList 1
			ArrayList<String> AL = new ArrayList<String>();
			
			//Add data to the ArrayList
			AL.add("DTCC");
			AL.add("CITI");
			AL.add("BMO");
			AL.add("RIS");
			
			//ArrayList 2
			ArrayList<String> AL2 = new ArrayList<String>();
			
			//Add data to the ArrayList
			AL2.add("DTCC");
			AL2.add("CITI");
			AL2.add("BMO");
			AL2.add("RIS");
			
							
			//Compare 2 Arraylist data
			boolean AE2 = AL.equals(AL2);
			System.out.println("Compare 2 Array :" + AE2);
		}
		
		
		
		
		public static void Array_Remove_Data() {
			
			//ArrayList 1
			ArrayList<String> AL = new ArrayList<String>();
			//Add data to the ArrayList
			AL.add("DTCC");
			AL.add("CITI");
			AL.add("BMO");
			AL.add("RIS");
			
			//ArrayList 2
			ArrayList<String> AL2 = new ArrayList<String>();
			//Add data to the ArrayList
			AL2.add("DTCC");
			AL2.add("CITI");
			AL2.add("BMO");
			AL2.add("RIS");
			
			//Remove data from ArrayList1 using Index
			AL.remove(3);
			boolean AE3 = AL.contains("RIS");
			if(AE3==true) {
				System.out.println("Not Remove by Index :" + AE3);	
			}else {
				System.out.println("Remove by Index :" + AE3);
			}
					
			//Remove data from ArrayList2 using value
			AL2.remove("IL");
			boolean AE4 = AL2.contains("IL");
			if(!AE4==true) {
				System.out.println("Not Remove by Value :" + AE4);	
			}else {
				System.out.println("Remove by Value :" + AE4);
			}
		}
		
		public static void Array_Print_Value_InLoop() {
			
			//ArrayList 1
			ArrayList<String> AL = new ArrayList<String>();
			//Add data to the ArrayList
			AL.add("DTCC");
			AL.add("CITI");
			AL.add("BMO");
			AL.add("RIS");
			
			//ArrayList 2
			ArrayList<String> AL2 = new ArrayList<String>();
			//Add data to the ArrayList
			AL2.add("DTCC");
			AL2.add("CITI");
			AL2.add("BMO");
			AL2.add("RIS");
					
			//Print all ArrayList1 value using Iterator and While loop
			Iterator itr = AL.iterator();
			while(itr.hasNext()) {
				String str1 = itr.next().toString();
				System.out.println(str1);
				
			}
			System.out.println("*****************************************");
			//Print all ArrayList2 value without Iterator and for loop
			for (String SRef:AL2) {
				String str2 = SRef.toString();
				System.out.println(str2);
				
			}
		}
		
		
		public static void Array_Print_Value_Sort() {
			
			ArrayList<Integer> AL3 = new ArrayList<Integer>();
			AL3.add(11);
			AL3.add(21);
			AL3.add(01);
			AL3.add(99);
			
			//Print all ArrayList3 value is ascending order with Iterator and while loop
			Collections.sort(AL3);
			Iterator itr2 = AL3.iterator();
			while(itr2.hasNext()) {
				String str3 = itr2.next().toString();
				System.out.println(str3);
			}
			
			System.out.println("*****************************************");
			//Print all ArrayList3 value is descending order without Iterator and for loop
			
			//Collections.sort(AL3);
			Collections.reverse(AL3);
			for(Integer x:AL3) {
				String str4 = x.toString();
				System.out.println(str4);
				
			}
		}
/*

		//ArrayList 1
		ArrayList<String> AL = new ArrayList<String>();
		
		//Add data to the ArrayList
		AL.add("DTCC");
		AL.add("CITI");
		AL.add("BMO");
		AL.add("RIS");
		
		//ArrayList 2
		ArrayList<String> AL2 = new ArrayList<String>();
		
		//Add data to the ArrayList
		AL2.add("DTCC");
		AL2.add("CITI");
		AL2.add("BMO");
		AL2.add("RIS");
		
		//Fetch data from ArrayList1 using Index
		String SR = AL.get(0);
		System.out.println("Fetch :" + SR);
		
		//Verify Data exist in ArrayList1
		boolean AE = AL.contains("BMO");
		if(AE) {
			System.out.println("Contains :" + AE);
		}
				
		//Compare 2 Arraylist data
		boolean AE2 = AL.equals(AL2);
		System.out.println("Compare 2 Array :" + AE2);
		
		//Remove data from ArrayList1 using Index
		AL.remove(3);
		boolean AE3 = AL.contains("RIS");
		if(AE3==true) {
			System.out.println("Not Remove by Index :" + AE3);	
		}else {
			System.out.println("Remove by Index :" + AE3);
		}
				
		//Remove data from ArrayList2 using value
		AL2.remove("IL");
		boolean AE4 = AL2.contains("IL");
		if(!AE4==true) {
			System.out.println("Not Remove by Value :" + AE4);	
		}else {
			System.out.println("Remove by Value :" + AE4);
		}
		System.out.println("*****************************************");
		//Print all ArrayList1 value using Iterator and While loop
		Iterator itr = AL.iterator();
		while(itr.hasNext()) {
			String str1 = itr.next().toString();
			System.out.println(str1);
			
		}
		System.out.println("*****************************************");
		//Print all ArrayList2 value without Iterator and for loop
		for (String SRef:AL2) {
			String str2 = SRef.toString();
			System.out.println(str2);
			
		}
		
		ArrayList<Integer> AL3 = new ArrayList<Integer>();
		AL3.add(11);
		AL3.add(21);
		AL3.add(01);
		AL3.add(99);
		
		System.out.println("*****************************************");
		//Print all ArrayList3 value is ascending order with Iterator and while loop
		Collections.sort(AL3);
		Iterator itr2 = AL3.iterator();
		while(itr2.hasNext()) {
			String str3 = itr2.next().toString();
			System.out.println(str3);
			
		}
		
		System.out.println("*****************************************");
		//Print all ArrayList3 value is descending order without Iterator and for loop
		
		//Collections.sort(AL3);
		Collections.reverse(AL3);
		for(Integer x:AL3) {
			String str4 = x.toString();
			System.out.println(str4);
			
		}
		
	}*/
	
	
}
