package com.java.test;

public class TestClass {

	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*byte a  = 20;
		short b = 200;
		int c = 200000;
		long d = 20000000000l;
		
		System.out.println("byte a = "+ a);
		System.out.println("short b = " + b);
		System.out.println("int c = " + c);
		System.out.println("long d = " + d);
		
		char val = 'A';
		boolean boolTrue = true;
		boolean boolFalse = false;
		
		System.out.println("char val = " + val);
		System.out.println("boolean boolTrue = " + boolTrue);
		System.out.println("boolean boolFalse = " + boolFalse);
		
		String str = "Hello Java";
		int[] arr = new int[]{1, 2, 3, 4};
		TestClass test = new TestClass();
		
		System.out.println("String str = " + str);
		System.out.println("int[] arr = " + arr);
		System.out.println("TestClass test = " + test);
		
		int num1 = 20;
		int num2 = 10;
		int num3 = 30;
		
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));
		
		System.out.println("num1++ = " + num1++);
		System.out.println("num1 = " + num1);
		System.out.println("++num1 = " + ++num1);

		System.out.println("num1 > num2 && ++num1 < num3 = " + (num1 > num2 && ++num1 < num3));
		System.out.println("num1 = " + num1);
		System.out.println("num1 > num2 & ++num1 < num3 = " + (num1 > num2 & ++num1 < num3));
		System.out.println("num1 = " + num1);
		System.out.println("num1 > num2 || ++num1 < num3 = " + (num1 > num2 || ++num1 < num3));
		System.out.println("num1 = " + num1);
		System.out.println("num1 > num2 | ++num1 < num3 = " + (num1 > num2 | ++num1 > num3));
		System.out.println("num1 = " + num1);
		
		System.out.println(num1 < num2 ? num1 : num2);
*/		
		
		int age = 19;
		int weight = 51;
		if(age > 18) {
			if(weight > 50) {
			System.out.println("Eligible for boxing...");
			}
			else {
				System.out.println("Not eligible for boxing...");
			}
		}
		else {
			System.out.println("Age must be greater than 18");
		}
		
		
		int number = 500;
		
		switch(number) {
			
		case 100: System.out.println("Number is 100"); break;
		
		case 200: System.out.println("Number is 200"); break;
		
		case 300: System.out.println("Number is 300"); break;
		
		case 400: System.out.println("Number is 400"); break;
		
		default: System.out.println("Number is not matching with any case..."); 
		
		}
		
		
//		for(int i = 1; i <=10; i++) {
//			System.out.println(2 * i - 1);
//		}
//		
		
//		for (int i = 1; i <= 10; i++) {
//            // Check if the number is odd
//            if (i % 2 != 0) {
//                // Print the odd number
//                System.out.println(i);
//            }
//	 }
		
//		for(int i = 1; i <= 13; i+=2) {
//			System.out.println(i);
//		}
//		
//		
//		int i = 10;
//		i-=5; // i = i - 5
//		System.out.println(i);
//		i*=5; // i = i * 5
//		System.out.println(i);
//		i/=5; // i = i / 5
//		System.out.println(i);
		
//		int i = 10;
//		while(i >= 1) {
//			System.out.println(i);
//			i-=2;
//		}
//		
		
		
//	int i = 10;
//	do {
//		if(i == 10) {
//		System.out.println(i*i);
//		}
//		else {
//			System.out.println(i + i);
//		}
//		i--;
//	}while(i>10);
//		
//	
//	
//	int a = 10; 
//	while(a > 10) {
//		if(a == 10) {
//			System.out.println(a*a);
//			}
//			else {
//				System.out.println(a+a);
//			}
//			i--;
//	}
		
		
	int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] intArr1 = new int[10];
	
	System.out.println("intArr:");
	for(int i = 0; i < intArr.length; i++) {
		System.out.print(intArr[i] + "\t");
	}
	System.out.println("\n");
	System.out.println("intArr1:");
	for(int i = 0; i < intArr1.length; i++) {
		System.out.print(intArr1[i] + "\t");
	}
	
	System.out.println("\n");
	int[][] intArr3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15}, {16, 17, 18}};
//	System.out.println("intArr3:");
//	for(int i = 0; i < intArr3.length; i++) {
//		for(int j= 0; j < intArr3[i].length; j++) {
//			System.out.print(Math.pow(intArr3[i][j], 2) + "\t");
//		}
//		System.out.println("\n");
//	}
//	
	System.out.println("intArr3:"); 
	for(int i=0; i<intArr3.length; i*=i) 
		{
			for(int j=0; j<intArr3.length; j*=j) {
				System.out.print(intArr3[i][j]+ "\t");
			}
		}
	
	
		
		
		}
	
	/**
	 * this method adds two integer values
	 * @param a takes first integer values to be added
	 * @param b takes second integer values to be added
	 * @return the sum of both the integer parameters
	 */
	public int add (int a, int b) {
		return a + b;
	}
}
