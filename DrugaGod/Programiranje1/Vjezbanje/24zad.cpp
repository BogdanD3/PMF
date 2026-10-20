#include <iostream>
using namespace std;

int main() {
  int n;
  cin >> n;
  int m = n;

  while (m != 0) {
    int k = m % 10;
    m /= 10;
    if (k ==0 || n % k != 0) {
      cout << "ne" << "\n";
      return 0;
    }
  }

  cout << "da" << "\n";

  return 0;
}
