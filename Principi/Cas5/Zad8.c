#include <stdio.h>

int zad8(int x, int n) {
  if (n == 0)
    return 1; // x^0 = 1
  if (n % 2 != 0)
    return x * zad8(x * x, (n - 1) / 2);
  else
    return zad8(x * x, n / 2);
}

int main() {
  int x, n;
  scanf("%d %d", &x, &n);
  printf("%d", zad8(x, n));

  return 0;
}
