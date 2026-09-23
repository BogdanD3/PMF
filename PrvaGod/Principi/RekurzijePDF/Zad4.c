#include <stdio.h>

int remove1(int n, int x) {
  if (n == 0) {
    return 0;
  }
  int a = n % 10;
  int b = remove1(n / 10, x);
  if (a != x)
    return b * 10 + a;
  else
    return remove1(n / 10, x);
}

int main() {
  printf("%d", remove1(123224, 2));
  return 0;
}
