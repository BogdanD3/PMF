#include <iostream>

using namespace std;

int main() {
  double e;
  cin >> e;

  double s = 1;
  double k;
  int n = 2;

  while (true) {
    k = (2.0 * n - 1) / (n * n);

    if (k < e)
      break;

    s += k;
    n++;
  }

  cout << s << "\n";
  return 0;
}
