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
		System.out.println("length of Line is: " + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")" + " " + length);

		int p1, p2, q2, q1;
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
		// System.out.println("Length of Line is: " + "(" + x1 + "," + y1 + ")," + "(" +
		// x2 + "," + y2 + ")" + Length);
		if (length == length1) {
			System.out.println("Length is equal to length1");
		} else {
			System.out.println("Length is not equal to length1");
		}

		if (length == length1) {
			System.out.println("Length is equal to length1 ");
		} else if (length > length1) {
			System.out.println("Length is greater than length1 ");
		} else {
			System.out.println("Length is less than length1 ");
		}
		
		
		Double line1 = Double.valueOf(length);
		Double line2 = Double.valueOf(length1);
		int val = line1.compareTo(line2);
		if (val == 0) {
			System.out.println("Two line are eqaul");
		} else if (val > 0) {
			System.out.println("Line 1 is greater than line2");
		} else
			System.out.println("Line 1 is less than line2");

		
		

	}

	public static void main(String[] args) {

		LineComparisonOops ls = new LineComparisonOops();
		ls.lineComparison();

	}

}
