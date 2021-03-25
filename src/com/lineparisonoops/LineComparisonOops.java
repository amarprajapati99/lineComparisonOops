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
		System.out.println("Length of Line is: " + "(" + x1 + "," + y1 + ")," 
		                        + "(" + x2 + "," + y2 + ")" + " " + length);
		

	}

	public static void main(String[] args) {

		LineComparisonOops ls = new LineComparisonOops();
		ls.lineComparison();

	}

}
