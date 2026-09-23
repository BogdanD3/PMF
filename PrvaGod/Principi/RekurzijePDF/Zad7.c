#include <stdio.h>

int obrni(int n, int p) {
  if (n == 0)
    return p;
  return obrni(n / 10, p * 10 + n%10);
}

int main() {
  printf("%d", obrni(12345, 0));
  return 0;
}
