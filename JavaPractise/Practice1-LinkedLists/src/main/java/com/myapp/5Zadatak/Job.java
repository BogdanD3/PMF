package com.myapp;

public class Job {

  private String name;
  private Date start;
  private Date end;

  public Job(String name, Date start, Date end) {
    if (start.compareTo(end) > 0)
      throw new IllegalArgumentException("Invalid dates");
    this.name = name;
    this.start = start;
    this.end = end;
  }

  public Date getStart() {
    return start;
  }

  public Date getEnd() {
    return end;
  }

}
