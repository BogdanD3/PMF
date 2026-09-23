#include <stdio.h>

int atoiFake(char *s, int i) {
  if (s[i] == '\0')
    return 0;

  int rest = atoiFake(s, i + 1);

  int mul = 1;
  while (rest >= mul)
    mul *= 10;

  return (s[i] - '0') * mul + rest;
}

int main() {
  printf("%d", atoiFake("1234", 0));
  return 0;
}
