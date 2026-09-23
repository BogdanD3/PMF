#include <stdio.h>

int dec2bin(int n) {
  if (n == 0)
    return 0;
  return n % 2 + 10 * dec2bin(n / 2);
}

int main() {
  int n;
  scanf("%d", &n);

  printf("%d", dec2bin(n));

  return 0;
}
