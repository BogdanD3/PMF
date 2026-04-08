#include <stdio.h>

int findK(int n) {
  if (n < 10) {
    return n;
  }
  int suma = 0;
  while (n != 0) {
    suma += n % 10;
    n /= 10;
  }
  return 1 + findK(suma);
}

int main() {
  printf("%d", findK(595));
  return 0;
}
