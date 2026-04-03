#include <ctype.h>
#include <stdio.h>
#include <string.h>

int isVocal(char c) {
  return (tolower(c) == 'a' || tolower(c) == 'e' || tolower(c) == 'i' ||
          tolower(c) == 'o' || tolower(c) == 'u');
}

void longestWord(char *str) {
  int len = strlen(str);
  int start = 0, end = 0, tempstart = 0, max = 0;
  int counter = 0;
  for (int i = 0; i < len; i++) {
    if (isVocal(str[i])) {
      counter++;
    }
    if (str[i] == ' ' || i + 1 == len) {
      if (i - tempstart > max && counter == 3) {
        max = i - tempstart;
        start = tempstart;
        if (i + 1 == len)
          end = i;
        else
          end = i - 1;
      }
      tempstart = i + 1;
      counter = 0;
      continue;
    }
  }
  if (start == 0 && end == 0) {
    printf("%d", -1);
    return;
  }
  for (int i = start; i <= end; i++) {
    printf("%c", str[i]);
  }
}

int main() {
  longestWord("ja volim da jako puno aii");
  return 0;
}
