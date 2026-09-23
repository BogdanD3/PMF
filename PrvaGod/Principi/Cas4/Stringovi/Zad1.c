#include <ctype.h>
#include <stdbool.h>
#include <stdio.h>
#include <string.h>

bool isValid(char *pass) {
  int len = strlen(pass);

  if (len < 8 || len > 100)
    return false;

  bool big = false;
  bool low = false;
  bool num = false;

  for (int i = 0; i < len; i++) {
    if (islower(pass[i]))
      low = true;
    if (isupper(pass[i]))
      big = true;
    if (isdigit(pass[i]))
      num = true;
  }

  return big && low && num;
}

int main() {
  char pass[101];
  scanf("%100s", pass);

  if (isValid(pass))
    printf("YES\n");
  else
    printf("NO\n");

  return 0;
}
