#include <stdio.h>

void f(int a[], int n, int x) {
  if (n <= 1)
    return;

  f(a + 1, n - 1, x);
  if (a[0] + a[1] == x) {
    a[0] = 0;
    a[1] = 0;
  }
}
int main() {
  int a[] = {1, 2, 3, 4, 5, 6};
  f(a, 6, 3);
  for (int i = 0; i < 6; i++) {
    printf("%d", a[i]);
  }
  return 0;
}
