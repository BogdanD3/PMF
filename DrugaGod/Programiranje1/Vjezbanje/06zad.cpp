#include <cmath>
#include <iostream>

using namespace std;

int main() {

  int n;
  cin >> n;
  int res = 0;

  if (n <= 1) return 1;

  for (int i = 1; i <= sqrt(n); i++) {
    if (n % i == 0) {
      res += i;

      if (i != 1 && n / i != i) {
        res += n / i;
      }
    }
  }

  if (res == n) {
    cout << "Savrsen" << "\n";
  } else {
    cout << "Nije savrsen" << "\n";
  }

  return 0;
}
