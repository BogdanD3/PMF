#include <stdio.h>
#include <stdlib.h>

int plocice(int n) {
  if (n == 0 || n == 1)
    return 1;

  return plocice(n - 1) + plocice(n - 2);
}

int main() {
  printf("%d", plocice(5));
  return 0;
}
