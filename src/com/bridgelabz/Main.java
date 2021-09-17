package com.bridgelabz;
import java.util.Scanner;
public class Main{

        int x1, y1, x2, y2, x3, y3, x4, y4;
        double line1, line2;
        Scanner scanner = new Scanner(System.in);

        public static void welcome(){
            System.out.println("......Welcome to Line Comparison Computation Program using OOPS...");
        }
        public double lengthOfLine1(){
            System.out.println("Enter Cartesian Co-ordinatesvfor first line");
            System.out.print("Enter the value of x1 : ");
            x1 = scanner.nextInt();
            System.out.print("Enter the value of x2 : ");
            x2 = scanner.nextInt();
            System.out.print("Enter the value of y1 : ");
            y1 = scanner.nextInt();
            System.out.print("Enter the value of y2 : ");
            y2 = scanner.nextInt();
            line1 = Math.sqrt(Math.pow((x2 - x1), 2)) + Math.pow((y2 - y1), 2);
            System.out.println("Length of the line1 is : "+line1);
            return line1;
        }
        public double lengthOfLine2(){
            System.out.println("Enter Cartesian Co-ordinates for second line");
            System.out.print("Enter the value of x3 : ");
            x3 = scanner.nextInt();
            System.out.print("Enter the value of x4 : ");
            x4 = scanner.nextInt();
            System.out.print("Enter the value of y3 : ");
            y3 = scanner.nextInt();
            System.out.print("Enter the value of y4 : ");
            y4 = scanner.nextInt();
            line2 = Math.sqrt(Math.pow((x4 - x3), 2)) + Math.pow((y4 - y3), 2);
            System.out.println("Length of the line2 is : "+line1);
            return line2;
        }

        double line1Length = lengthOfLine1();
        double line2Length = lengthOfLine2();
        public void equalsTo() {
            if (line1Length == line2Length) {
                System.out.println("The length of both the Lines are Equal");
            } else {
                System.out.println("Calling compareTo method");
            }
        }

        public void compareTo() {
            if (line1Length > line2Length) {
                System.out.println("The length of Line1 is greater than Line2 ");
            } else if (line2Length > line1Length){
                System.out.println("The length of Lines2 is greater than Line1");
            }else {
                System.out.println();
            }
        }

        public static void main(String[] args) {
            welcome();
            Main line = new Main();
            line.equalsTo();
            line.compareTo();
        }
    }