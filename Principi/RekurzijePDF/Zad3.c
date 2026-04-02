#include <stdio.h>

int Biggest(int n) {
  if (n < 10) {
    return n;
  }
  int a = n % 10;
  int b = Biggest(n / 10);
  return (a > b) ? a : b;
}

int main() {
  printf("%d", Biggest(12366453));
  return 0;
}
