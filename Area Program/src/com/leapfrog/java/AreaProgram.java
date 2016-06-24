/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.java;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AreaProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length, breadth;
        System.out.println("Enter the value of length(l)");
        length = input.nextDouble();

        System.out.println("Enter the value of breadth(b)");
        breadth = input.nextDouble();
        System.out.print("Area of rectangle =");
        System.out.println(length * breadth);

    }

}
