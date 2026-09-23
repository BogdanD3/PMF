#include <ctype.h>
#include <stdbool.h>
#include <stdio.h>
#include <string.h>

bool Pangram(char *str) {
  bool abc[26] = {false}; 
  int len = strlen(str);

  for (int i = 0; i < len; i++) {
    char c = tolower(str[i]);
    if (islower(c))
      abc[c - 'a'] = true;
  }

  for (int i = 0; i < 26; i++) {
    if (abc[i] == false)
      return false;
  }
  return true;
}

int main() {
  if (Pangram("The quick brown fox jumps over the lazy dog")) {
    printf("YES");
  } else
    printf("NO");
  return 0;
}
