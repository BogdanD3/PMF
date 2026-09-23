#include <stdio.h>
#include <string.h>

int isPalindrome(char *s) {
  int k = strlen(s);
  int left = 0, right = k - 1;
  while (left < right) {
    if (s[left] != s[right])
      return 0;
    left++;
    right--;
  }
  return 1;
}

void findPalindrome() {
  char line[100];
  FILE *u = fopen("ulaz.txt", "r");
  if (!u)
    return;

  FILE *i = fopen("izlaz.txt", "w");
  while (fgets(line, sizeof(line), u)) {
    char *word = strtok(line, " \n");
    while (word != NULL) {
      if (isPalindrome(word))
        fprintf(i, "%s\n", word);
      word = strtok(NULL, " \n");
    }
  }
  fclose(u);
  fclose(i);
}

int main() {
  findPalindrome();
  return 0;
}
