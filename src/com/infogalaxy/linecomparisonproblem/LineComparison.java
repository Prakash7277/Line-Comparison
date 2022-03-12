package com.infogalaxy.linecomparisonproblem;

import java.util.Scanner;

public class LineComparison {
    public static void main(String []args){
        System.out.println(" Welcome To line Comparison Program Made By Prakash");
        Scanner sc = new Scanner(System.in);
        double x1 = 0;
        double y1 = 0;
        double x2 = 0;
        double y2 = 0;
        double length = 0;
        System.out.println("Enter The Y1 Co-Ordinates :");
        x1 = sc.nextInt();
        System.out.println("Enter The Y2  Co-Ordinates :");
        y1 = sc.nextInt();
        System.out.println("Enter The X1 Co-Ordinates :");
        x2 = sc.nextInt();
        System.out.println("Enter The X2 Co-Ordinates :");
        y2 = sc.nextInt();
        length = Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2));
        System.out.println(("Length of Line is =" + length));
    }
}
