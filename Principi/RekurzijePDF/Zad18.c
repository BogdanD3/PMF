#include <stdio.h>

void f3(int *arr, int n, int sum) {
  if (n <= 0)
    return;
  int num = arr[0];
  if (sum < num) {
    arr[0] = 0;
  }
  f3(arr + 1, n - 1, sum + num);
}

int main() {

  int arr[] = {1, 2, 4, 12, 9};
  f3(arr, 5, 0);
  for (int i = 0; i < 10; i++) {
    printf("%d ", arr[i]);
  }
  return 0;
}
