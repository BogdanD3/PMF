#include <stdio.h>

void a(int n) {
  if (n == 0) {
    return;
  }
  a(n / 10);
  printf("%d", n % 10);
}

void b(int n) {
  if (n == 0) {
    return;
  }
  printf("%d", n % 10);
  a(n / 10);
}

int main() {
  a(12345);
  return 0;
}
