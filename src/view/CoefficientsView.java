/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.List;
import model.CoefficientsModel;

public class CoefficientsView {
    private CoefficientsModel model = new CoefficientsModel();

    public  void mainMenu() {
        System.out.println("1. Solve Linear Equation");
        System.out.println("2. Solve Quadratic Equation");
        System.out.println("3. Exit");
    }

    public  void printResults(List<Float> results) {
        if (results == null) {
            System.out.println("The equation has no solution");
        } else if (results.isEmpty()) {
            System.out.println("The equation has infinitely many solutions");
        } else {
            System.out.print("The solution(s) is/are: ");
            for (Float result : results) {
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }

    public  void printNumberProperties(float a, float b, float c) {
        System.out.println("Number properties:");

        if (a != 0) {
            if (model.isEven(a)) {
                System.out.println(a + " is even");
            }
            if (model.isOdd(a)) {
                System.out.println(a + " is odd");
            }
            if (model.isSquareNumber(a)) {
                System.out.println(a + " is a square number");
            }
        }

        if (b != 0) {
            if (model.isEven(b)) {
                System.out.println(b + " is even");
            }
            if (model.isOdd(b)) {
                System.out.println(b + " is odd");
            }
            if (model.isSquareNumber(b)) {
                System.out.println(b + " is a square number");
            }
        }

        if (c != 0) {
            if (model.isEven(c)) {
                System.out.println(c + " is even");
            }
            if (model.isOdd(c)) {
                System.out.println(c + " is odd");
            }
            if (model.isSquareNumber(c)) {
                System.out.println(c + " is a square number");
            }
        }
    }
}

