#include <stdbool.h>
#include <stdio.h>
#include <string.h>

int findIndex(char str[], int k, int len) {
  for (int i = k; i < len; i++) {
    if (str[i] == ' ')
      return i;
  }
  return len;
}

bool isVocal(char c) {
  return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
}

void flipVocals(char str[]) {
  int k = 0;
  int len = strlen(str);
  int index = findIndex(str, k, len);

  while (k < len) {
    int left = k, right = index - 1;

    while (left < right) {
      if (isVocal(str[left])) {
        if (isVocal(str[right])) {
          char temp = str[left];
          str[left] = str[right];
          str[right] = temp;
          left++;
          right--;
        } else
          right--;
      } else
        left++;
    }

    k = index + 1;
    index = findIndex(str, k, len);
  }
}

int main() {
  char str[] = "pmf Podgorica";
  flipVocals(str);
  printf("%s", str);
  return 0;
}
