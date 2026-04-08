#include <stdio.h>
#include <stdlib.h>

int **f() {
  int n, m;
  printf("Unesite broj redova i kolona");
  scanf("%d %d", &n, &m);

  int **mat = malloc(sizeof(int *) * n);
  for (int i = 0; i < n; i++) {
    mat[i] = malloc(sizeof(int) * m);
  }
  return mat;
}

int main() {
  int **mat = f();
  return 0;
}
