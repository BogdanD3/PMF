#include <ctype.h>
#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

bool isVocal(char c) {
  char lowerC = tolower(c);
  return lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' ||
         lowerC == 'u';
}

bool isFakePali(char *str) {
  int left = 0, right = strlen(str) - 1;

  while (left < right) {
    if (isVocal(str[left])) {
      left++;
    } else if (isVocal(str[right])) {
      right--;
    } else {
      if (str[left] != str[right])
        return false;

      left++;
      right--;
    }
  }

  return true;
}

int main() {
  int n;
  scanf("%d", &n);

  char *str = malloc(n + 1);
  scanf("%20s", str);

  if (isFakePali(str))
    printf("YES\n");
  else
    printf("NO\n");

  free(str);
  return 0;
}
