#include <ctype.h>
#include <stdbool.h>
#include <stdio.h>
#include <string.h>

bool isVocal(char c) {
  if (tolower(c) == 'a' || tolower(c) == 'e' || tolower(c) == 'i' ||
      tolower(c) == 'o' || tolower(c) == 'u') {
    return true;
  }
  return false;
}

void sub(char *str) {
  int len = strlen(str);
  int left = 0, right = 0;
  int start = 0, end = 0, max = 0, counter = 0;

  while (right < len) {

    if (isVocal(str[right])) {
      counter++;
    }

    if (counter > 3) {
      while (left < len && !isVocal(str[left])) {
        left++;
      }

      if (left < len) {
        left++;
        counter--;
      }
    }
    int curr_len = right - left + 1;
    if (curr_len > max) {
      max = curr_len;
      start = left;
      end = right;
    }

    right++;
  }
  for (int i = start; i <= end; i++) {
    printf("%c", str[i]);
  }
}

int main() {

  sub("programiranje");
  return 0;
}
