#include <stdio.h>
#include <stdbool.h>


void strcp(char *str, int i, char *res) {
  if (str[i] == '\0') {
    res[i] = '\0';
    return;
  }

  res[i] = str[i];
  strcp(str, i + 1, res);
}

bool strcm(char *str, char *res, int i) {
    if (str[i] == '\0' && res[i] == '\0')
        return true;

    if (str[i] != res[i])
        return false;

    return strcm(str, res, i + 1);
}

int main() {
  char *str = "Alolita";
  char res[8];
  strcp(str, 0, res);
  printf("%s\n", res);
  printf("%d", strcm(str, res, 0));
  return 0;
}
