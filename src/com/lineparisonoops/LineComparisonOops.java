package com.lineparisonoops;

import java.util.Scanner;

// Creating a method 
public class LineComparisonOops {
	public void lineComparison() {
		System.out.println("Welcome to Line Comparsion Problem");

		int x1, x2, y1, y2;
		double length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 point :");
		x1 = sc.nextInt();
		System.out.println("Enter y1 point :");
		y1 = sc.nextInt();
		System.out.println("Enter x2 point :");
		x2 = sc.nextInt();
		System.out.println("Enter y2 point :");
		y2 = sc.nextInt();
		length = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
		System.out.println("length of Line is: " + "(" + x1 + "," + y1 + ")," 
		                        + "(" + x2 + "," + y2 + ")" + " " + length);
		
		int p1,p2,q2,q1;
		double length1;
		
		System.out.println("Enter x1 point");
		x1 = sc.nextInt();
		System.out.println("Enter y1 point");
		y1 = sc.nextInt();
		System.out.println("Enter x2 point");
		x2 = sc.nextInt();
		System.out.println("Enter y2 point");
		y2 = sc.nextInt();
		System.out.println("Enter p1 point");
		p1 = sc.nextInt();
		System.out.println("Enter q1 point");
		q1 = sc.nextInt();
		System.out.println("Enter p2 point");
		p2 = sc.nextInt();
		System.out.println("Enter q2 point");
		q2 = sc.nextInt();
		length = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
		length1 = Math.sqrt((p2 - p1) ^ 2 + (q2 - q1) ^ 2);
		//System.out.println("Length of Line is: " + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")" 	+ Length);
		if(length == length1) {
			System.out.println("Length is equal to length1");
		}
		else {
			System.out.println("Length is not equal to length1");
		}
		

	}

	public static void main(String[] args) {

		LineComparisonOops ls = new LineComparisonOops();
		ls.lineComparison();

	}

}
