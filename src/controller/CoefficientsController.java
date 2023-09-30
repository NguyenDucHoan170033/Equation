/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import java.util.Scanner;
import model.CoefficientsModel;
import view.CoefficientsView;

public class CoefficientsController {
  private CoefficientsModel model = new CoefficientsModel();
  private Scanner scanner = new Scanner(System.in);
  private CoefficientsView view = new CoefficientsView();

  public void run() {
    int choice;

    do {
      view.mainMenu();
      System.out.print("Enter your choice: ");
      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          linearEquation();
          break;
        case 2:
          quadraticEquation();
          break;
        case 3:
          System.out.println("Goodbye!");
          break;
        default:
          System.out.println("Invalid choice!");
      }
    } while (choice != 3);

    scanner.close();
  }

  public  void linearEquation() {
    System.out.print("Enter a: ");
    float a = scanner.nextFloat();
    System.out.print("Enter b: ");
    float b = scanner.nextFloat();

    List<Float> results = model.calculateLinear(a, b);

    view.printNumberProperties(a, b, 0);
    view.printResults(results);
  }

  public void quadraticEquation() {
    System.out.print("Enter a: ");
    float a = scanner.nextFloat();
    System.out.print("Enter b: ");
    float b = scanner.nextFloat();
    System.out.print("Enter c: ");
    float c = scanner.nextFloat();

    List<Float> results = model.calculateQuadratic(a, b, c);
  
    view.printNumberProperties(a, b, c);
      view.printResults(results);
  }
}
    



