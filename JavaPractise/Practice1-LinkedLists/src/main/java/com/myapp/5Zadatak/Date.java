package com.myapp;

public class Date implements Comparable<Date> {

  private int day;
  private int month;
  private int year;

  private int maxDays(int month, int year) {
    switch (month) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        return 31;

      case 4:
      case 6:
      case 9:
      case 11:
        return 30;

      case 2:
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
          return 29;
        else
          return 28;

      default:
        throw new IllegalArgumentException("Invalid month");
    }
  }

  public Date(int day, int month, int year) {

    if (year < 0)
      throw new IllegalArgumentException("Invalid year");

    if (month < 1 || month > 12)
      throw new IllegalArgumentException("Invalid month");

    int maxDays = maxDays(month, year);

    if (day < 1 || day > maxDays)
      throw new IllegalArgumentException("Invalid day");

    this.day = day;
    this.month = month;
    this.year = year;
  }

  @Override
  public int compareTo(Date b) {

    if (this.year != b.year)
      return this.year - b.year;

    if (this.month != b.month)
      return this.month - b.month;

    return this.day - b.day;
  }
}
