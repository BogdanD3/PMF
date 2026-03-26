#include <stdio.h>
#include <string.h>

int Razliciti(char *str) {
  int arr[26] = {0};
  int len = strlen(str);

  for (int i = 0; i < len; i++) {
    arr[str[i] - 'a']++;
    if (arr[str[i] - 'a'] > 1)
      return 0;
  }
  return 1;
}

int main() { 
  printf("%d", Razliciti("sadfsagn"));
  return 0; 
}
