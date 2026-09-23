#include <stdio.h>
#include <string.h>

void findLetters() {
  int letters[26] = {0};
  char line[100];
  FILE *u = fopen("ulaz.txt", "r");
  if (!u)
    return;

  FILE *vocals = fopen("samoglasnici.txt", "w");
  FILE *consonants = fopen("suglasnici.txt", "w");
  while (fgets(line, sizeof(line), u)) {
    char *word = strtok(line, " \n");
    while (word != NULL) {
      for (int i = 0; word[i]; i++) {
        char c = word[i];
        if (c >= 'a' && c <= 'z') {
          letters[c - 'a']++;
        } else if (c >= 'A' && c <= 'Z') {
          letters[c - 'A']++;
        }
      }
      word = strtok(NULL, " \n");
    }
  }
  for (int i = 0; i < 26; i++) {
    char c = 'a' + i;
    if (letters[i] > 0) {
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        fprintf(vocals, "%c: %d\n", c, letters[i]);
      } else {
        fprintf(consonants, "%c: %d\n", c, letters[i]);
      }
    }
  }
  fclose(u);
  fclose(vocals);
  fclose(consonants);
}

int main() {
  findLetters();
  return 0;
}
