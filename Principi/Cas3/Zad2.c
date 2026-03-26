#include <stdio.h>
#include <string.h>

void StampajObratno (char* str) {
  int len = strlen(str);
  for (int i = len - 1; i >= 0; i--) {
    printf("%c", str[i]);
  }
}

int main() {
    StampajObratno("mikamajka");
    return 0;
}
