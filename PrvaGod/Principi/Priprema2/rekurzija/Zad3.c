#include <ctype.h>
#include <stdio.h>

void decode(char *s, char *out, int *i, int *j) {
  int k = 0;

  while (s[*i] != '\0' && s[*i] != ']') {

    if (isdigit(s[*i])) {
      k = 0;
      while (isdigit(s[*i])) {
        k = k * 10 + (s[*i] - '0');
        (*i)++;
      }

      (*i)++; 

      char temp[1000];
      int t = 0;

      decode(s, temp, i, &t);

      (*i)++; 

      for (int x = 0; x < k; x++) {
        for (int y = 0; y < t; y++) {
          out[(*j)++] = temp[y];
        }
      }
    } else {
      out[(*j)++] = s[(*i)++];
    }
  }

  out[*j] = '\0';
}

int main() {
  char s[] = "3[a2[b]]";
  char out[1000];

  int i = 0, j = 0;
  decode(s, out, &i, &j);

  printf("%s", out);
}
