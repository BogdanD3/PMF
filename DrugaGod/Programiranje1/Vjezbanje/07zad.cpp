#include <iostream>

using namespace std;

int main() {

  int n;
  cin >> n;
  int l = 0;
  int arr[10] = {};

  while (n > 0) {
    int k = n % 10;

    if (arr[k] == 0) {
      arr[k] = 1;
      l++;
    }
    n /= 10;
  }

  if (l > 2) {
    cout << "Nije dvojak" << "\n";
  } else {
    cout << "Dvojak" << "\n";
  }

  return 0;
}
