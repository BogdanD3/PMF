#include <stdio.h>

int faktorijel(int n) {
  if (n == 0)
    return 1;
  else
    return n * faktorijel(n - 1);
}

int main() {
  int broj;

  printf("Unesite broj: ");
  scanf("%d", &broj);

  printf("Faktorijel je: %d\n", faktorijel(broj));

  return 0;
}
