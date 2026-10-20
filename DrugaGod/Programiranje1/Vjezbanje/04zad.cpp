#include <iostream>

using namespace std;

int main() {

  int n;
  cin >> n;

  int *arr = new int[10]();

  while (n > 0) {
    int k = n % 10;
    arr[k]++;
    n /= 10;
  }

  int res = 0;
  for (int i = 0; i < 10; i++) {
    if (arr[i] > 0)
      res++;
  }
  cout << res << "\n";

  delete[] arr;
  return 0;
}
