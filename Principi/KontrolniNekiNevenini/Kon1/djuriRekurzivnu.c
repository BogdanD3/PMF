#include <stdio.h>

int najveciParni(int n) {
  if (n < 10) {
    if (n % 2 == 0)
      return n;
    else
      return -1;
  }
  int num = n % 10;
  int last = najveciParni(n / 10);
  if (num % 2 == 0 && last < num)
    return num;
  else
    return last;
}

int main() {
  printf("%d", najveciParni(1357));
  return 0;
}
