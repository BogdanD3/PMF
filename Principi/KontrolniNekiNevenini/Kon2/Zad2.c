#include <stdio.h>
#include <stdlib.h>

int zad3(int n, int k) {
  if (n == 0) {
    return 10;
  }
  int a = n % 10;
  int left = zad3(n / 10, k);
  if (a > k && a < left)
    return a;
  else
    return left;
}

int main() {
  printf("%d", zad3(1234567, 3));
  return 0;
}
