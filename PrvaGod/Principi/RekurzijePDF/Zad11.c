#include <stdio.h>

int skalarniProizvod(int *a, int *b, int n) {
  if (n == 0) {
    return 0;
  }
  return a[0] * b[0] + skalarniProizvod(a + 1, b + 1, n - 1);
}

int main() {
  int a[] = {1, 2, 3, 4, 5};
  int b[] = {1, 2, 3, 4, 5};
  printf("%d", skalarniProizvod(a, b, 5));
  return 0;
}
