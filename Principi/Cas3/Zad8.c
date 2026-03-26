#include <stdio.h>
#include <string.h>

int zad8(char *str) {
  int len = strlen(str);
  int move = 1;
  int start = len / 2;

  if (len % 2 == 0 || str[start] != 'c')
    return 0;
  while (2 * move + 1 < len) {
    if (str[start - move] == 'a' && str[start + move] == 'b') {
      move++;
    } else {
      return 0;
    }
  }
  return 1;
}

int main() {
  printf("%d\n", zad8("c"));       // 1 – nula a i b, samo c
  printf("%d\n", zad8("acb"));     // 1 – 1 a, 1 b, c u sredini
  printf("%d\n", zad8("aacbb"));   // 1 – 2 a, 2 b, c u sredini
  printf("%d\n", zad8("aaacbbb")); // 1 – 3 a, 3 b, c u sredini
  printf("%d\n", zad8("aaccb"));   // 0 – više od jednog c
  printf("%d\n", zad8("aacb")); // 1 – 2 a, 1 b, c u sredini (nije validno prema
  printf("%d\n", zad8("bac"));  // 0 – počinje sa b
  printf("%d\n", zad8("aacbbc")); // 0 – znak nakon b nije kraj
  printf("%d\n", zad8("aaabbb")); // 0 – nema c
  printf("%d\n", zad8("acbb"));   // 0 – broj b != broj a
  return 0;
}
