#include <stdio.h>

int equals(char *str1, char *str2) {
  if (*str1 == '\0' && *str2 == '\0')
    return 0;
  if (*str1 == '\0' || *str2 == '\0')
    return 1;
  if (*str1 != *str2)
    return 1;
  return equals(str1 + 1, str2 + 1);
}

int main() {
  char *s1 = "palindrop";
  char *s2 = "palindrom";
  printf("%d", equals(s1, s2));
  return 0;
}
