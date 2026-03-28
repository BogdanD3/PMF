#include <stdio.h>

int proizvod(int a) {
  if (a == 0) {
    return 0;
  }
  else if (a < 10) return a;
  else {
    int temp = a % 10;
    return temp * proizvod(a/10);
  }
}

int main() {
    
  int broj;
  printf("Unesi broj :");
  scanf("%d", &broj);
  printf("Proizvod cifara broja je: %d", proizvod(broj));
    return 0;
}
