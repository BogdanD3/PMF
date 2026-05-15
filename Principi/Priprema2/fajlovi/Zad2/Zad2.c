#include <stdio.h>

void nums(int k) {
  FILE *u = fopen("ulaz.txt", "r");
  if (!u)
    return;
  FILE *i = fopen("izlaz.txt", "w");
  if (!i)
    return;
  int x;
  while (fscanf(u, "%d,", &x) == 1) {
    if (x % k == 0)
      fprintf(i, "%d\n", x);
  }
  fclose(u);
  fclose(i);
}

int main() {
  nums(3);
  return 0;
}
