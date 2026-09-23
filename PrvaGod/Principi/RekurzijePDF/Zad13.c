#include <stdio.h>

int f3(int n) {
  if (n < 0)
    return -f3(-n);
  if (n < 10)
    return n;

  int last = n % 10;
  int prev = (n / 10) % 10;

  int rest = f3(n / 10);

  if (prev == 2 && last % 2 == 1)
    return rest;

  return rest * 10 + last;
}

int main() {
  printf("%d", f3(-235524));
  return 0;
}
