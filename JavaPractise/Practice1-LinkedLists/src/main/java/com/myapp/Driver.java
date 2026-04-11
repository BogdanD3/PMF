package com.myapp;

class Driver implements Comparable<Driver> {
  String name;
  String team;
  int[] scores;
  int[] ranks;

  public Driver(String name, String team) {
    this.name = name;
    this.team = team;
    this.scores = new int[20];
    this.ranks = new int[20];
  }

  public int compareTo(Driver b) {
    int sumA = 0;
    int sumB = 0;
    int ranksA = 0;
    int ranksB = 0;

    for (int i = 0; i < 20; i++) {
      sumA += this.scores[i];
      sumB += b.scores[i];
      if (this.ranks[i] == 1)
        ranksA++;
      if (b.ranks[i] == 1)
        ranksB++;
    }
    if (sumA != sumB) {
      return sumA > sumB ? 1 : -1;
    } else {
      if (ranksA != ranksB) {
        return ranksA > ranksB ? 1 : -1;
      } else {
        return this.name.compareTo(b.name);
      }
    }
  }
}
