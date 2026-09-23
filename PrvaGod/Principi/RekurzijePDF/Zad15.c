#include <stdio.h>

int RemoveEvens(int n) {
  if (n < 10) {
    return (n % 2 == 0) ? 0 : n;
  }
  int a = n % 10;
  int left = RemoveEvens(n / 10);
  return a % 2 == 0 ? left : left * 10 + a;
}

int main() {
  printf("%d", RemoveEvens(1234568));
  return 0;
}
