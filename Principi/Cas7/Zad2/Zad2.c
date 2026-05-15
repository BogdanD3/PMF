#include <ctype.h>
#include <stdio.h>

void histogram() {
  int letters[26] = {0};
  FILE *u = fopen("ulaz.txt", "r");
  if (!u)
    return;
  char c;

  while (fscanf(u, "%c", &c) == 1) {
    c = tolower(c);
    if (isalpha(c)) {
      letters[c - 'a']++;
    }
  }
  fclose(u);
  FILE *f = fopen("histogram.txt", "w");
  for (int i = 0; i < 26; i++) {
    fprintf(f, "%c: %d\n", 'a' + i, letters[i]);
  }
  fclose(f);
}

int main() {
  histogram();
  return 0;
}
