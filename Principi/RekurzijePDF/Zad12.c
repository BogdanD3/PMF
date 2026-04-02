#include <stdio.h>

void trokut(int n, int i) {
  if (n == i) {
    return;
  }
  for (int j = 0; j < n - i - 1; j++) {
    printf("%c", ' ');
  }
  for (int j = 0; j <= i; j++) {
    printf("%c", '+');
  }
  printf("\n");
  trokut(n, i + 1);
}

int main() {
  trokut(6, 0);
  return 0;
}
