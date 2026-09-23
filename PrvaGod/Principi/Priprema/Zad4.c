#include <stdio.h>

int Biggest(int n) {
  if (n < 10) {
    return n;
  }
  int last = n % 10;
  int max = Biggest(n / 10);
  return (last > max) ? last : max;
}

int main() {
  printf("%d", Biggest(5867));
  return 0;
}
