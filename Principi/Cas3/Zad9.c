#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void Umetni(char **str1, char *str2) {
  int len1 = strlen(*str1);
  int len2 = strlen(str2);
  char *temp = malloc(sizeof(char) * (len1 + len2));
  int m = 0;

  for (int i = 0; i < len1; i++) {
    temp[m++] = (*str1)[i];
    temp[m++] = str2[i];
  }
  free(*str1);
  *str1 = temp;
}
int main() {
  char *s1 = malloc(4);
  strcpy(s1, "PMF");
  char *s2 = "AB";
  Umetni(&s1, s2);
  printf("%s", s1);
  return 0;
}
