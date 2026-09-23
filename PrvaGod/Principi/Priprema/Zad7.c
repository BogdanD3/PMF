#include <stdio.h>

int MinEl(int *a, int i, int len) {
  if (len == 0) return -1;
  if (i == len - 1)
    return a[i];
  int min1 = a[i];
  int min2 = MinEl(a, i + 1, len);
  return (min1 < min2) ? min1 : min2;
}

int main() {
  int a[] = {1, 2, 3, 4, 5, 6};
  int b[] = {3, 4, 7, 8, 9, 12, 46};
  printf("%d", MinEl(a, 0, 6));
  return 0;
}
