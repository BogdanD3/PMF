#include <stdio.h>
#include <stdlib.h>

int sum(int *a, int *b) { return *a + (*b); }

int max(int *a, int *b) {
  if (*a > *b)
    return *a;
  return *b;
}

void factoriel(int *a) {
  int temp = 1;
  for (int i = 1; i <= *a; i++) {
    temp *= i;
  }
  *a = temp;
}

void printArray(int *arr, int len) {
  printf("[");
  for (int i = 0; i < len; i++) {
    if (i + 1 == len) {
      printf("%d", arr[i]);
      continue;
    }
    printf("%d ", arr[i]);
  }
  printf("]\n");
}

void swap(int *a, int *b) {
  int temp = *a;
  *a = *b;
  *b = temp;
}

void reverse(int *arr, int len) {
  int left = 0;
  int right = len - 1;
  while (left < right) {
    swap(&arr[left], &arr[right]);
    left++;
    right--;
  }
}

void fillMatrix(int **matrix, int len) {
  for (int i = 0; i < len; i++) {
    for (int j = 0; j < len; j++) {
      matrix[i][j] = rand() % (30 - 1 + 1) + 1;
    }
  }
}

void dandm(int a, int b, int *d, int *c) {
  *d = a / b;
  *c = a * b;
}

int sumArray(int *arr, int len) {
  int sum = 0;
  for (int i = 0; i < len; i++) {
    sum += *(arr + i);
  }
  return sum;
}

int maxElement(int *arr, int len) {
  int max = *arr;
  int *end = arr + len;
  while (arr < end) {
    if (*arr > max) {
      max = *arr;
    }
    arr++;
  }
  return max;
}

void copyArray(int *arr, int *arr2, int len) {
  int *end = arr + len;
  while (arr < end) {
    *arr2 = *arr;
    arr2++;
    arr++;
  }
}

int main() {

  int a, b, c, d;
  printf("Unesite obije vrijednosti: ");
  scanf("%d %d", &a, &b);
  printf("%d\n", sum(&a, &b));
  printf("%d\n", max(&a, &b));
  int r = a;
  factoriel(&a);
  printf("%d\n", a);
  a = r;

  int len = 7;
  int arr[] = {2, 6, 3, 8, 5, 1, 5};
  printArray(arr, len);
  // printf("Unesite obije vrijednosti: ");
  // scanf("%d", &len);
  reverse(arr, len);
  printArray(arr, len);
  printf("\n");

  int **matrix = malloc(sizeof(int *) * len);
  for (int i = 0; i < len; i++) {
    matrix[i] = malloc(len * sizeof(int));
  }
  fillMatrix(matrix, len);
  for (int i = 0; i < len; i++) {
    printArray(matrix[i], len);
  }

  printf("\n");
  printf("\n");

  int *arr2 = malloc(sizeof(int) * len);
  dandm(a, b, &d, &c);
  printf("%d %d\n", d, c);
  printf("%d\n", sumArray(arr, len));
  printf("%d\n", maxElement(arr, len));
  copyArray(arr, arr2, len);
  printArray(arr, len);
  printArray(arr2, len);

  free(arr2);
  for (int i = 0; i < len; i++) {
    free(matrix[i]);
  }
  free(matrix);

  return 0;
}
