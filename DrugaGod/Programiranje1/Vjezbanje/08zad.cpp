#include <cmath>
#include <iostream>
using namespace std;

int main() {
  for (int c = 10; c <= 99; c++) {
    for (int a = 1; a < c; a++) {
      int x = c * c - a * a;
      int b = sqrt(x);

      if (b * b == x) {
        cout << c << "\n";
        break;
      }
    }
  }

  return 0;
}
