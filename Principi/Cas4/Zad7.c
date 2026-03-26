#include <stdio.h>

int sum(int num) {
  if (num == 0)
    return 0;
  else
    return num % 10 + sum(num / 10);
}

int digitalRoot(int num) {
  if (num / 10 == 0)
    return num;
  else {
    return digitalRoot(sum(num));
  }
}

int main() {

  int num = 1231224;
  printf("Digital root is: %d", digitalRoot(num));
  return 0;
}
