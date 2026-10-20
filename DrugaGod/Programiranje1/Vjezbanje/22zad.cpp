#include <iostream>
using namespace std;

int parne_cifre(int n) {
  if (n < 10) {
    if (n % 2 == 0)
      return 0;
    else
      return n;
  }

  int cif = n % 10;
  int ostatak = n / 10;

  if (cif % 2 == 0) {
    return parne_cifre(ostatak);
  } else {
    return parne_cifre(ostatak) * 10 + cif;
  }
}

int main() {
  cout << parne_cifre(123456) << endl;
  return 0;
}
