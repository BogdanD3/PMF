#include <stdio.h>

int evens(int n) {
  if (n == 0) {
    return 0;
  }
  if ((n % 10) % 2 == 0)
    return 1 + evens(n / 10);
  else
    return evens(n / 10);
}

int main() {
  printf("%d", evens(123456));
  return 0;
}
