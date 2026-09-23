#include <stdio.h>

double f1(int n) {
  if (n == 1)
    return 1;
  return n + (1.0 / f1(n - 1));
}

int main() {
  int n;
  scanf("%d", &n);
  printf("%f", f1(n));
  return 0;
}
