#include <stdio.h>
#include <string.h>

int Sadrzi(char *str1, char *str2) {
  int arr[128] = {0};
  int len1 = strlen(str1);
  int len2 = strlen(str2);
  int counter = 0;

  for (int i = 0; i < len2; i++) {
    if (arr[str2[i]] == 0) {
      arr[str2[i]] = 1;
      counter++;
    }
  }

  for (int i = 0; i < len1; i++) {
    if (arr[str1[i]] == 1) {
      counter--;
      arr[str1[i]] = 0;
    }
  }

  if (counter == 0) return 1;
  return 0;
}

int main() { 
  printf("%d", Sadrzi("abracadabraxyz", "xyzbac"));
  return 0; 
}
