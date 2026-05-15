#include <stdio.h>
#include <string.h>

void findWords(char *w) {
  char line[100];
  FILE *u = fopen("ulaz.txt", "r");
  if (!u)
    return;

  FILE *i = fopen("izlaz.txt", "w");
  while (fgets(line, sizeof(line), u)) {
    char *word = strtok(line, " \n");
    while (word != NULL) {
      if (strstr(word, w))
        fprintf(i, "%s\n", word);
      word = strtok(NULL, " \n");
    }
  }
  fclose(u);
  fclose(i);
}

int main() {
  findWords("prog");
  return 0;
}
