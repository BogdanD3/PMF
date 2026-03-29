#include <stdio.h>
#include <string.h>

void Compress(char str[]) {
  int len = strlen(str);
  int read = 0, write = 0;

  while (read < len) {
    char current = str[read];
    int count = 0;

    while (read < len && str[read] == current) {
      read++;
      count++;
    }

    str[write++] = current;

    if (count > 1) {
      str[write++] = count + '0';
    }
  }

  str[write] = '\0';
}

int main() {
  char str[] = "aaabbbcdddd";
  Compress(str);
  printf("%s\n", str);
  return 0;
}
