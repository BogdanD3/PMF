#include <stdio.h>
#include <string.h>

int BrPojavljivanja (char* str, char c) {
  int len = strlen(str);
  int num = 0;
  for (int i = 0; i < len; i++) {
    if (str[i] == c) num++;
  }
  return num;
} 

int main() {
   printf("%d", BrPojavljivanja("ascoahbaspa", 'a'));
    return 0;
}
