#include <stdio.h>

void f(int arr[], int n) {
  if (n <= 2)
    return;

  int prev = arr[0];
  int curr = arr[1];
  int next = arr[2];

  f(arr + 1, n - 1);

  if (prev == curr - next) {
    arr[1] = 0;
  }
}

int main() {
  int arr[] = {4, 4, 3, 6, 3, 3};
  int n = 6;

  f(arr, n);

  for (int i = 0; i < n; i++) {
    printf("%d", arr[i]);
  }

  return 0;
}
