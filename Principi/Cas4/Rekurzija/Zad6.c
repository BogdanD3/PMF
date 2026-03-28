#include <stdio.h>

int oddDigits(int n) {
  if (n == 0)
    return 0;

  int cifra = n % 10;
  int ostatak = oddDigits(n / 10);

  if (cifra % 2 != 0) {
    return ostatak * 100 + cifra * 10;
  } else {
    return ostatak * 10 + cifra;
  }
}

int main() {
  int broj;
  printf("Unesi broj: ");
  scanf("%d", &broj);

  printf("Rezultat: %d\n", oddDigits(broj));
  return 0;
}
