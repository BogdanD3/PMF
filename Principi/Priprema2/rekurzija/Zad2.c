#include <stdio.h>

int f(int n, int prev) {
  if (n == 0)
    return 1;

  if (prev == 1)
    return f(n - 1, 0); 

  return f(n - 1, 0) + f(n - 1, 1);
}

int count(int n) { return f(n, 0); }

int main() { printf("%d", count(4)); }
