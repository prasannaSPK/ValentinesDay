
/*
 * 
 * Well known Childhood game we all played FLAMES.A small gift from my side on this ❤ ♡ ♥ ❣VALENTINES DAY 💞 💘 💕
 * 
 * How to use this ?
 * --just run as normal java program then it pops in console to enter Your Name and then Your Crush name 
 * then relationship between you is 🔥🔥 Flamed 🔥🔥
 * 
 * q) How to use this code if you don't have java environment on your machine?
 * Ans: you can use any java compiler online 
 * example: go to this link https://www.onlinegdb.com/online_java_compiler , copy paste the code and change the class name of code from Flames to Main and run the code.
 * 
 * Note: This snippet is just for fun not intended to Hurt people feelings or their Relations,The developer is not responsible for this  snippet usage nor encourage any further disussion on this code.
 * 
 * 
 * 
 *
 * 💕 😘 ❣️ HAPPY VALENTINES DAY...HAVE FUN  😍 ❤️ 🥰 💘
 * 
 * 
 * AUTHOR:SPK 13th FEB 2022
 * 
 * 
 * */




import java.util.Arrays;
import java.util.Scanner;

public class Flames {
		public static String F = "Friends";
		public static String L = "Lovers";
		public static String A = "Affection";
		public static String M = "Marriage";
		public static String E = "Enemies";
		public static String S = "Sister";
		
		
		public static String removeSpaces(String name) {
			String arr[] = name.split(" ");
			 name = "";
			for(String e:arr) {
				name+=e;
			}
			
			return name;
		}
		
		public static int  countAfterRemovingCommons(String arr1[],String arr2[]) {
			
			int count =0;
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]!="")
					count++;
			}
			
			for(int j=0;j<arr2.length;j++) {
				if(arr2[j]!="")
					count++;
			}
			
			
			
			return count;
		}
		
		public static void removeCommonLetters(String name1,String name2) {
			
			name1 = removeSpaces(name1);
			name2 = removeSpaces(name2);
			
			int len = name1.length() - name2.length();
			
			String arr1[] = new String[name1.length()];
			String arr2[] = new String[name2.length()];
			
			for(int i=0;i<name1.length();i++) {
				arr1[i] = name1.charAt(i)+"";
			}
			
			for(int i=0;i<name2.length();i++) {
				arr2[i] = name2.charAt(i)+"";
			}
			
			
			if(len<=0) {

				
				for(int i=0;i<arr1.length;i++) {
					
					for(int j=0;j<arr2.length;j++) {
						if(arr1[i].equals(arr2[j])) {
							arr1[i]="";
							arr2[j]="";
							
							break;
						}
					}
				}
				
				//finding sum of remaining characters in both names
				
				int count = countAfterRemovingCommons(arr1,arr2);
				
				System.out.println("count is "+count);
				
				flamingYourRelation(count);
				
		
				
				
			}
			
			else {
				
				for(int i=0;i<arr2.length;i++) {
					
					for(int j=0;j<arr1.length;j++) {
						if(arr2[i].equals(arr1[j])) {
							arr2[i]="";
							arr1[j]="";
							
							break;
						}
					}
				}
				
				//finding sum of remaining characters in both names
				//System.out.println(Arrays.toString(arr1));
				//System.out.println(Arrays.toString(arr2));
				
				int count = countAfterRemovingCommons(arr1,arr2);
				
				System.out.println("count is "+count);
				flamingYourRelation(count);
				
				
				
			}
			
				
		}
		
		public static void flamingYourRelation(int no_of_remain_letters) {
			int count = no_of_remain_letters;
			//StringBuilder relation = new StringBuilder("FLAMES");
			
			String relation = "FLAMES";
			if(count == 0)//NAME 1:XYZ NAME 2:YZX (i.e same letters in both names)
				relation ="U";
			if(count==1)// it means only S remains
				relation = "S";
			
			else {
				
				while(relation.length() > 2) {
					
					int index = count % relation.length();
					if(index==relation.length()) {
						
						relation =  relation.substring(0,index-1);
						
					}
					if(index!=relation.length()) {
						if(index!=0) {
							relation =  relation.substring(index) + relation.substring(0,index-1) ;
							//System.out.println("WELCOME");
						}
						else
							relation = relation.substring(0,relation.length()-1);
					}	
					//System.out.println(relation);
					
					
							

					
				}
				
				int index = count % relation.length();
				//System.out.println("COOL");
				//in case of length == 2 IF EVEN REMINDER CUT second one in flames ...if odd cut first one in flames
				if(index == 0)
					relation =  relation.substring(0,1);
				else
					relation =  relation.substring(1);
				
				System.out.println(relation);
				
			}

			
			System.out.print("Your Relation status is: ");
			
		
			if(relation.equals("F"))
				System.out.println(F);
			if(relation.equals("L"))
				System.out.println(L);
			if(relation.equals("A"))
				System.out.println(A);
			if(relation.equals("M"))
				System.out.println(M);
			if(relation.equals("E"))
				System.out.println(E);
			if(relation.equals("S"))
				System.out.println(S);
			
			
			if(relation.equals("U"))
				System.out.println("YOU ARE UNIVERSAL COUPLE!!! NJOY");
			
		}
		
		
//		public static void flamingYourRelation(int no_of_remain_letters) {
//			int count = no_of_remain_letters;
//			String relation = "FLAMES";
//			
//			if(count==1)
//				System.out.println(relation.charAt(relation.length()-1));
//			
//		while(relation.length() > 2) {
//			
//			int temp_count = 1;
//			
//			for(int i=0;i<relation.length();i++) {
//				
//				if(temp_count==count) {
//					System.out.println(i +"****"+temp_count);
//					relation = relation.substring(i) + relation.substring(0,i-1);
//					temp_count = 1;
//					System.out.println(relation);
//					break;
//				}
//				if(i==relation.length()-1) {
//					i=0;//to loop around FLAMES string
//					
//				}
//					
//				System.out.println(i);
//				temp_count++;
//			}
//		}

			
		//}
		
		
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name1 = sc.nextLine().trim();
		System.out.println("Enter Your crush name");
		String name2 = sc.nextLine().trim();
		//System.out.println(name1 +""+name2);
		if(name1.length()==0 || name2.length()==0) {
			//we can't give empty names as input
			throw new ArithmeticException("people names can't be empty"); 
		}
		else if(name1.equals(name2)){
			// when two names are same: it means all FLAMES exist in them
			System.out.println("VERY RARE COMBO :YOUR MARRIAGE IS ALREADY DECIDED IN HEAVEN!!");
			
		}
		else
			removeCommonLetters(name1.toLowerCase(),name2.toLowerCase());
		

	}

}