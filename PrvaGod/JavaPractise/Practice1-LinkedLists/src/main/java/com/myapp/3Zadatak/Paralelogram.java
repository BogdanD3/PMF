package com.myapp;

public class Paralelogram implements Comparable<Paralelogram> {

  private double[] x;
  private double[] y;

  public Paralelogram(double[] x, double[] y) {
    this.x = x;
    this.y = y;
  }

  public double surface() {
    double ABx = x[1] - x[0];
    double ABy = y[1] - y[0];

    double ADx = x[3] - x[0];
    double ADy = y[3] - y[0];

    return Math.abs(ABx * ADy - ABy * ADx);
  }

  private double length(int i, int j) {
    return Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));
  }

  public double perimeter() {
    double a = length(0, 1);
    double b = length(1, 2);
    return 2 * (a + b);
  }

  @Override
  public int compareTo(Paralelogram p) {
    if (this.surface() < p.surface())
      return -1;
    if (this.surface() > p.surface())
      return 1;

    if (this.perimeter() < p.perimeter())
      return -1;
    if (this.perimeter() > p.perimeter())
      return 1;

    return 0;
  }

  @Override
  public String toString() {
    return "(" + x[0] + "," + y[0] + ")-" +
        "(" + x[1] + "," + y[1] + ")-" +
        "(" + x[2] + "," + y[2] + ")-" +
        "(" + x[3] + "," + y[3] + ")";
  }
}
