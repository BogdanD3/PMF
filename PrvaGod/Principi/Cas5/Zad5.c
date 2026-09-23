#include <math.h>
#include <stdio.h>

double f4(int n, int i) {
  if (i == n)
    return sqrt(n);
  return sqrt(i + f4(n, i + 1));
}

int main() {
  int n;
  scanf("%d", &n);
  printf("%f", f4(n, 1));
  return 0;
}
