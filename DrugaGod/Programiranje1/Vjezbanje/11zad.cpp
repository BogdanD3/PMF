#include <iostream>

using namespace std;

int main() {

  int n;
  cin >> n;
  int res = 0;

  while (n > 9) {
    int k = 0;
    while (n > 0) {
      k += n % 10;
      n /= 10;
    }
    res++;
    n = k;
  }
  cout << res << "\n";
  return 0;
}
