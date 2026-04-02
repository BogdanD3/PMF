#include <stdio.h>
#include <stdlib.h>

void makeArray(int *end_of_arr, int n) {
  if (n < 10) {
    end_of_arr[0] = n;
    return;
  }
  *end_of_arr = n % 10;
  makeArray(end_of_arr - 1, n / 10);
}

void printArray(int *arr, int n) {
  if (n == 0) {
    printf("%d", *arr);
    return;
  }
  printArray(arr, n - 1);
  printf("%d", arr[n]);
}

int main() {
  int *a = malloc(sizeof(int) * 5);
  makeArray(a + 4, 12345);
  printArray(a, 4);
  free(a);
  return 0;
}
