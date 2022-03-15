package com.infogalaxy.linecomparisonproblem;

import java.util.Scanner;

public class LineComparison {
    public static void compare(double length1, double length2 ){
        if(length1 == length2){
            System.out.println("Both Lines are Same.");
        }else {
            System.out.println("Lines are Not Same.");
            //UC-3 Two Length of Line Compare
            if(length1 > length2){
                System.out.println("Length of line 1 is Big");
            }else {
                System.out.println("Length of line 2 is Big");
            }
        }
    }
    public static void main(String []args){
        System.out.println(" Welcome To line Comparison Program Made By Prakash.");
        Scanner sc = new Scanner(System.in);
        //UC-1 Length of Line 1 Calculated
        double x1 = 0;
        double x2 = 0;
        double y1 = 0;
        double y2 = 0;
        //UC-2 Length of Line 2 Calculated
        double a1 = 0;
        double a2 = 0;
        double b1 = 0;
        double b2 = 0;
        System.out.println("Enter The X1 Co-Ordinates :");
        x1 = sc.nextDouble();
        System.out.println("Enter The X2  Co-Ordinates :");
        x2 = sc.nextDouble();
        System.out.println("Enter The Y1 Co-Ordinates :");
        y1 = sc.nextInt();
        System.out.println("Enter The Y2 Co-Ordinates :");
        y2 = sc.nextInt();
        double length1 = Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2));
        System.out.println(("Length of Line 1 =" + length1));

        System.out.println("Enter The A1 Co-Ordinates :");
        a1 = sc.nextDouble();
        System.out.println("Enter The A2  Co-Ordinates :");
        a2 = sc.nextDouble();
        System.out.println("Enter The B1 Co-Ordinates :");
        b1 = sc.nextInt();
        System.out.println("Enter The B2 Co-Ordinates :");
        b2 = sc.nextInt();
        double length2 = Math.sqrt(Math.pow((a1 - a2),2) + Math.pow((b1 - b2),2));
        System.out.println(("Length of Line 2 =" + length2));
        compare(length1, length2);
    }
}
