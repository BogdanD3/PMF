#include <stdio.h>

void EvenDigits(int a) {
  if (a == 0) return;

  EvenDigits(a / 10);

  if ((a % 10) % 2 == 0) {
    printf("%d", a % 10);
  }
}

int main() {


  int broj = 0;
  printf("Unesi broj :");
  scanf("%d", &broj);
  EvenDigits(broj);

  return 0; 
}
