#include <stdio.h>
#include <string.h>

int num(char rim) {
  switch (rim) {
  case 'I':
    return 1;
  case 'V':
    return 5;
  case 'X':
    return 10;
  case 'L':
    return 50;
  case 'C':
    return 100;
  case 'D':
    return 500;
  case 'M':
    return 1000;
  default:
    return -1;
  }
  return 0;
}

int Rome2Dec(char *s) {
  int len = strlen(s);
  int number = 0;
  for (int i = 0; i < len; i++) {
    int one = num(s[i]);
    if (i == len) {
      number += s[i];
      continue;
    }
    if (one < num(s[i + 1])) {
      number -= one;
    } else {
      number += one;
    }
  }
  return number;
}

int main() {
  printf("%d", Rome2Dec("XLIII"));
  return 0;
}
