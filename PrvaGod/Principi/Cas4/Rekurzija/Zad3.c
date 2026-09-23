#include <stdio.h>

int proizvod(int a) {
  if (a < 10)
    return a;

  return a % 10 * proizvod(a / 10);
}

int main() {

  int broj;
  printf("Unesi broj :");
  scanf("%d", &broj);
  printf("Proizvod cifara broja je: %d", proizvod(broj));
  return 0;
}
