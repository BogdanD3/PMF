#include <iostream>
using namespace std;

float broj_riba(int x, int p, int s) {
  if (s < x)
    return 0;

  return 1 + broj_riba(x, p, s * (100 - p) / 100.0);
}

int main() {
  cout << broj_riba(100, 20, 200) << "\n";
  return 0;
}
