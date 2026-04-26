package com.myapp;

public class Sticker {

  String name;
  String rep;
  int num;

  public Sticker(String name, String rep, int num) {
    this.name = name;
    this.rep = rep;
    this.num = num;
  }

  @Override
  public String toString() {
    return "Sticker{" +
        "name='" + name + '\'' +
        ", rep='" + rep + '\'' +
        ", num=" + num +
        '}';
  }
}
