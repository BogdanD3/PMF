#include <stdio.h>

void djeljivi(int k) {
  FILE *u = fopen("ulaz.txt", "r");
  FILE *i = fopen("izlaz.txt", "w");
  if (!u)
    return;
  int x;

  while (fscanf(u, "%d,", &x) == 1) {
    if (x % k == 0) {
      fprintf(i, "%d\n", x);
    }
  }
  fclose(u);
  fclose(i);
}

int main() {
  int n;
  scanf("%d", &n);
  djeljivi(n);
  return 0;
}
