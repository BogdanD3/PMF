#include <stdio.h>

void f3(int *a, int n) {
  if (n <= 1)
    return;
  if (a[0] % 2 == 0 && a[1] % 2 == 0) {
    a[0]--;
  }
  f3(a + 1, n - 1);
}

int main() {

  int a[] = {2, 2, 5, 7, 6, 8, 4, 3, 2, 1};
  f3(a, 10);
  for (int i = 0; i < 10; i++) {
    printf("%d", a[i]);
  }
  return 0;
}
