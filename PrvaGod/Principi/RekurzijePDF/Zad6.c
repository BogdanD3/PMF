#include <stdio.h>

void hex(int n) {
  if (n == 0)
    return;
  int num = n % 16;
  hex(n / 16);
  if (num < 10)
    printf("%d", num);
  else
    printf("%c", 'A' + num % 10);
}

int main() {
  hex(2356);
  return 0;
}
