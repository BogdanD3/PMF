#include <stdio.h>

int palindrom(int *a, int n) {
  if (n <= 1) {
    return 1;
  }
  if (*a != a[n - 1])
    return 0;
  return palindrom(a + 1, n - 2) ? 1 : 0;
}

int main() {
  int a[] = {1, 2, 3, 4, 2, 1};
  printf("%d", palindrom(a, 6));
  return 0;
}
