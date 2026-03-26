#include <stdio.h>

int okreni(int a, int result) {
  if (a == 0) {
    return result;
  } else {
    int temp = a % 10;
    result = result * 10 + temp;
    return okreni(a/10, result);
  }
}

int main() {
  int broj;
  int result = 0;
  printf("Unesi broj :");
  scanf("%d", &broj);
  printf("Okrenut broj je: %d", okreni(broj, result));

  return 0;
}
