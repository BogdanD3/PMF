#include <iostream>

using namespace std;

int main() {

  int n;
  cin >> n;

  int arr[10] = {};

  while (n > 0) {
    int k = n % 10;
    arr[k]++;
    n /= 10;
  }

  int res = 0;
  int max = 0;
  for (int i = 0; i < 10; i++) {
    if (arr[i] > max) {
      res = i;
      max = arr[i];
    }
  }
  cout << res << "\n";

  return 0;
}
