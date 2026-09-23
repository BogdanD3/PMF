#include <stdio.h>
#include <string.h>

void swap(char *a, char *b) {
  char temp = 'a';
  temp = *a;
  *a = *b;
  *b = temp;
}

void Glas(char *str) {
  int len = strlen(str);
  int left = 0, right = len - 1;

  while (left < right) {
    if (str[left] == 'a' || str[left] == 'e' || str[left] == 'i' ||
        str[left] == 'o' || str[left] == 'u') {
      left++;
    } else {
      if (str[right] == 'a' || str[right] == 'e' || str[right] == 'i' ||
          str[right] == 'o' || str[right] == 'u') {
        swap(&str[left], &str[right]);
        right--;
        left++;
      } else {
        right--;
      }
    }
  }
}

int main() {

  char string[] = "dvoiwqpsabahsdaoio";
  Glas(string);
  printf("%s\n", string);
  return 0;
}
