#include <stdio.h>
#include <string.h>

int Podstring(char *str1, char* str2) {
  int left = 0, right = 0;
  int len1 = strlen(str1);
  int len2 = strlen(str2);
  
  while (left < len1) {
    if (str1[left + right] == str2[right]) {
      right++;
      if (right == len2) return 1;
    } else {
      right = 0;
      left++;
    }
  }
  return 0;
}

int main() {
    printf("%d", Podstring("d ddvefac", "d d"));
    return 0;
}
