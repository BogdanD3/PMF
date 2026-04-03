#include <stdio.h>

int okreni(int a, int result) {
  if (a == 0)
    return result;
  return okreni(a / 10, result * 10 + a % 10);
}

int main() {
  int broj;
  int result = 0;
  printf("Unesi broj :");
  scanf("%d", &broj);
  printf("Okrenut broj je: %d", okreni(broj, result));

  return 0;
}
