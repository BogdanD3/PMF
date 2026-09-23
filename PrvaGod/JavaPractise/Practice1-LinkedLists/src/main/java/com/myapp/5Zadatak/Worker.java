package com.myapp;

public class Worker {

  private String id;
  private String name;
  private int expirience;
  private float pay;
  private Job[] jobs;

  public Worker(String id, String name, int expirience, float pay, Job[] jobs) {
    this.id = id;
    this.name = name;
    this.expirience = expirience;
    this.pay = pay;
    this.jobs = jobs;
  }

  public String getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public Job[] getJobs() {
    return this.jobs;
  }

}
