#include <iostream>
using namespace std;

int main() {
  for (int n = 100; n <= 999; n++) {
    int l = 0;
    int m = n;

    while (m > 0) {
      int k = m % 10;
      l += k * k * k;
      m /= 10;
    }

    if (l == n)
      cout << n << "\n";
  }

  return 0;
}
