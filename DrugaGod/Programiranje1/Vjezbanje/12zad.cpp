#include <iostream>

using namespace std;

int main() {

  int res = 0;
  int n = 0;
  int m = 0;

  for (int i = 1; i <= 100; i++) {
    for (int j = 1; j <= 100; j++) {
      if ((i * i) + (i * j) + (j * j) == 100) {
        if (i * i + j * j > res) {
          res = i * i + j * j;
          n = i;
          m = j;
        }
      }
    }
  }

  cout << n << " i " << m << "\n";
  return 0;
}
