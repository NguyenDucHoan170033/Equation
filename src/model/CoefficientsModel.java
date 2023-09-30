/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

public class CoefficientsModel {
      

  public List<Float> calculateLinear(float a, float b) {
    List<Float> results = new ArrayList<>();
    if (a == 0 && b == 0) {
      results = null;
    } else if (a == 0) {
      results = new ArrayList<>();
    } else {
      results.add(-b / a);
    }
    return results;
  }

  public List<Float> calculateQuadratic(float a, float b, float c) {
    List<Float> results = new ArrayList<>();
    float delta = b * b - 4 * a * c;
    if (delta < 0) {
      results = null;
    } else if (delta == 0) {
      results.add(-b / (2 * a));
    } else {
     results.add((float)((-b + Math.sqrt(delta)) / (2 * a)));
     results.add((float)((-b - Math.sqrt(delta)) / (2 * a)));

    }
    return results;
  }

  public boolean isEven(float number) {
    return number % 2 == 0;
  }

  public boolean isOdd(float number) {
    return number % 2 != 0;
  }

  public boolean isSquareNumber(float number) {
    return Math.sqrt(number) % 1 == 0;
  }
}