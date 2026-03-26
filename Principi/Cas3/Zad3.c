#include <stdio.h>
#include <string.h>
#include <ctype.h>

int IskljucivoVelika(char *str) {
  int len = strlen(str);
  for (int i = 0; i < len; i++) {
    if (!isalpha(str[i]) == 0)
      continue;
    if (str[i] == tolower(str[i]))
      return 0;
  }
  return 1;
}

int main() {
  printf("%d", IskljucivoVelika("AHIBOS2"));
  return 0;
}
