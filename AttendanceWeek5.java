package Attendance;

import java.util.Scanner;

public class AttendanceWeek5 {

	   public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);  
	      int num1, num2, sum, diff;
	      num1 = sc.nextInt();
	      num2 = sc.nextInt();
	      sum = num1 + num2;
	      diff=num1-num2;

	      System.out.println("Sum of these numbers: "+sum);
	      System.out.println("Diff of these numbers: "+diff);
	   }
	}