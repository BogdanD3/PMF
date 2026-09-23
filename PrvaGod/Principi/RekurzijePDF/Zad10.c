#include <stdio.h>

int add0(int n) {
  if (n < 10) {
    if (n % 2 != 0)
      return n * 10;
    else
      return n;
  }
  int lastDigit = n % 10;
  int rest = add0(n / 10);
  if ((n % 10) % 2 != 0)
    return rest * 100 + lastDigit * 10;
  else
    return rest * 10 + lastDigit;
}

int main() {
  printf("%d", add0(12345));
  return 0;
}
