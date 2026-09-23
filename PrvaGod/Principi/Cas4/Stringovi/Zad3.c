#include <stdio.h>
#include <stdlib.h>

int *map(char **arr, int n) {
  int *result = malloc(2 * sizeof(int));
  int x = 0, y = 0;

  for (int i = 0; i < n; i++) {
    char dir[10];
    int val;

    sscanf(arr[i], "%s %d", dir, &val);

    if (dir[0] == 'N')
      y += val;
    else if (dir[0] == 'S')
      y -= val;
    else if (dir[0] == 'E')
      x += val;
    else if (dir[0] == 'W')
      x -= val;
  }

  result[0] = x;
  result[1] = y;
  return result;
}

int main() {
  char *arr[3] = {"North 5", "East 3", "South 1"};

  int *res = map(arr, 3);

  printf("%d %d\n", res[0], res[1]);

  free(res);
  return 0;
}
