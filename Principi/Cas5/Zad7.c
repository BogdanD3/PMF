#include <stdio.h>

void preuredi(int *a, int n) {
  if (n <= 1)
    return;

  preuredi(a + 1, n - 1);

  if (a[0] % 2 != 0) {
    int temp = a[0];

    for (int i = 0; i < n - 1; i++) {
      a[i] = a[i + 1];
    }

    a[n - 1] = temp;
  }
}

int main() {
  int arr[] = {1, 2, 3, 4, 5, 6, 7};
  preuredi(arr, 7);
  for (int i = 0; i < 7; i++) {
    printf("%d", arr[i]);
  }
  return 0;
}
