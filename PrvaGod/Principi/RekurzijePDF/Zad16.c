#include <stdio.h>

int MaxArray(int *a, int n) {
  if (n == 0)
    return 0;
  int num = a[n-1];
  int last = MaxArray(a, n - 1);
  return num > last ? num : last;
}

int main() {
  int a[] = {1, 2, 7, 7, 5, 8};
  printf("%d", MaxArray(a, 6));
  return 0;
}
