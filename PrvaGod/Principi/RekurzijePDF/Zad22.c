#include <stdio.h>

char *SubString(char *str1, char *str2) {
  if (*str1 == '\0')
    return NULL;

  char *temp1 = str1;
  char *temp2 = str2;

  while (*temp1 == *temp2 && *temp1 != '\0' && *temp2 != '\0') {
    temp1++;
    temp2++;
  }

  if (*temp2 == '\0')
    return str1;

  return SubString(str1 + 1, str2);
}

int main() {
  char *s1 = "motikaalla";
  char *s2 = "tika";

  printf("%s", SubString(s1, s2));
  return 0;
}
