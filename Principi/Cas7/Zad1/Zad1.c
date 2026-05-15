#include <stdio.h>
#include <stdlib.h>

char *fileName(int n) {
  if (n < 50)
    return "F.txt";
  else if (n < 60)
    return "E.txt";
  else if (n < 70)
    return "D.txt";
  else if (n < 80)
    return "C.txt";
  else if (n < 90)
    return "B.txt";
  else
    return "A.txt";
}

void bodovi() {
  FILE *list = fopen("bodovi.txt", "r");
  if (list == NULL) {
    printf("Fajl nije uspjesno otvoren!\n");
    return;
  }
  int x;
  while (fscanf(list, "%d,", &x) == 1) {
    const char *name = fileName(x);

    FILE *out = fopen(name, "a");
    if (out == NULL)
      continue;

    fprintf(out, "%d, ", x);
    fclose(out);
  }
}

int main() {
  bodovi();
  return 0;
}
