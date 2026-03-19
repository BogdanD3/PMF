package com.myapp;

public class Zad4 {

  public static boolean Simetricna(int mat[][]) {
    if (mat.length != mat[0].length)
      return false;
    for (int i = 0; i < mat.length; i++) {
      for (int j = i + 1; j < mat[0].length; j++) {
        if (mat[i][j] != mat[j][i])
          return false;
      }
    }
    return true;
  }

}
