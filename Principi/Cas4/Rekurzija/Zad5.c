#include <stdio.h>

int EvenDigits(int a) {
  if (a < 10) {
    if (a % 2 == 0)
      return 0;
    else
      return a;
  }
  int num = a % 10;
  int rest = EvenDigits(a / 10);

  return num % 2 != 0 ? rest * 10 + num : rest;
}

int main() {

  int broj = 0;
  printf("Unesi broj :");
  scanf("%d", &broj);
  printf("%d", EvenDigits(broj));

  return 0;
}
