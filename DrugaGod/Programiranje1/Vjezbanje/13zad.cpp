#include <cmath>
#include <iostream>

using namespace std;

int main() {

  int n;
  cin >> n;
  double k = 1;
  double res = 0;

  while (k <= n) {
    res += pow(-1, k) / k;
    k++;
  }

  cout << res << "\n";

  return 0;
}
