#include <math.h>
#include <stdio.h>

int brojCifara(int n) {
  if (n == 0)
    return 0;
  return 1 + brojCifara(n / 10);
}

int okreni(int n) {
  if (n == 0)
    return 0;
  int cif = n % 10;
  return cif * pow(10, brojCifara(n) - 1) + okreni(n / 10);
}

int main() {
  int broj;
  int result = 0;
  printf("Unesi broj :");
  scanf("%d", &broj);
  printf("Okrenut broj je: %d", okreni(broj));

  return 0;
}
