#include <stdbool.h>
#include <stdio.h>
#include <string.h>

void BiggestSubstring(char str[]) {
  bool arr[26] = {false};
  int starts[100];
  int end = 0, max = 1;
  int len = strlen(str);
  int left = 0, right = 0, count = 0;
  while (right < len) {
    if (!arr[str[right] - 'a']) {
      arr[str[right] - 'a'] = true;
      int current_len = right - left + 1;

      if (current_len > max) {
        max = current_len;
        count = 0;
        starts[count++] = left;
      } else if (current_len == max) {
        starts[count++] = left;
      }
      right++;
    } else {
      while (str[left] != str[right]) {
        arr[str[left] - 'a'] = false;
        left++;
      }
      left++;
      right++;
    }
  }
  for (int i = 0; i < count; i++) {
    for (int j = 0; j < max; j++) {
      printf("%c", str[starts[i] + j]);
    }
    printf("\n");
  }
}

int main() {
  BiggestSubstring("principiprogramiranja");
  return 0;
}
