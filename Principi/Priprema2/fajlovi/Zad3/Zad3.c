#include <ctype.h>
#include <stdio.h>
#include <string.h>

int check(char c) {
  if (tolower(c) == 'a' || tolower(c) == 'e' || tolower(c) == 'i' ||
      tolower(c) == 'o' || tolower(c) == 'u')
    return 1;
  return 0;
}

int isAl(char *s) {
  int k = strlen(s);
  if (k == 1)
    return 1;
  for (int i = 1; i < k; i++) {
    if (!(check(s[i - 1]) ^ check(s[i])))
      return 0;
  }
  return 1;
}

void findAlternatives() {
  char line[100];
  FILE *u = fopen("ulaz.txt", "r");
  if (!u)
    return;

  FILE *i = fopen("izlaz.txt", "w");
  while (fgets(line, sizeof(line), u)) {
    char *word = strtok(line, " \n");
    while (word != NULL) {
      if (isAl(word))
        fprintf(i, "%s\n", word);
      word = strtok(NULL, " \n");
    }
  }
  fclose(u);
  fclose(i);
}

int main() {
  findAlternatives();
  return 0;
}
