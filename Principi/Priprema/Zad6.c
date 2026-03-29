#include <stdio.h>

int NZD(int a, int b) {
  if (b == 0)
    return a;
  return NZD(b, a % b);
}

int main() {
  printf("%d", NZD(48, 18));
  return 0;
}
