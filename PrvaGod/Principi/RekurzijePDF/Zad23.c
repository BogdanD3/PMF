#include <stdio.h>

int SubString(char *str1, char *str2) {
  if (*str2 == '\0')
    return 0;

  char *temp1 = str1;
  char *temp2 = str2;

  while (*temp1 == *temp2 && *temp1 != '\0' && *temp2 != '\0') {
    temp1++;
    temp2++;
  }

  if (*temp1 == '\0')
    return 1 + SubString(str1, str2 + 1);

  return SubString(str1, str2 + 1);
}

int main() {
  char s1[] = "ana";
  char s2[] = "banana";

  int rezultat = SubString(s1, s2);

  printf("Niska '%s' se pojavljuje %d puta u '%s'\n", s1, rezultat, s2);

  return 0;
}
