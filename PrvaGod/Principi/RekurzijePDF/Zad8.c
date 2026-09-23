#include <stdio.h>

void swap(int *a, int *b) {
  int temp = *a;
  *a = *b;
  *b = temp;
}

void flipArray(int *a, int n) {
  if (n <= 1) {
    return;
  }
  swap(a, &a[n - 1]);
  flipArray(a + 1, n - 2);
}

int main() {
  int b[] = {1, 2, 3, 4, 5, 6};
  flipArray(b, 6);
  for (int i = 0; i < 6; i++) {
    printf("%d", b[i]);
  }
  return 0;
}
