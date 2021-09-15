package com.bridgelabz;
import java.util.Scanner;
public class Main{
            int x1, x2, y1, y2;
            Scanner scanner = new Scanner(System.in);

            public void welcome(){
                System.out.println("......Welcome to Line Comparison Computation Program using OOPS...");
            }
            public void lengthOfLine(){
                System.out.println("Enter Cartesian Co-ordinates");
                System.out.print("Enter the value of x1 : ");
                x1 = scanner.nextInt();
                System.out.print("Enter the value of x2 : ");
                x2 = scanner.nextInt();
                System.out.print("Enter the value of y1 : ");
                y1 = scanner.nextInt();
                System.out.print("Enter the value of y2 : ");
                y2 = scanner.nextInt();
                System.out.println("The Length of the line is : " + (Math.sqrt(Math.pow((x2 - x1), 2)) + Math.pow((y2 - y1), 2)));
            }

            public static void main(String[] args) {
                Main line = new Main();
                line.welcome();
                line.lengthOfLine();

            }
        }
