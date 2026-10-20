#include <iostream>

using namespace std;

int main() {

  int x, y;
  cin >> x >> y;

  for (int i = 0; i < x; i++) {
    cout << "*";
  }
  cout << "\n";
  for (int i = 2; i < y; i++) {
    cout << "*";
    for (int j = 0; j < x - 2; j++) {
      cout << " ";
    }
    cout << "*";
    cout << "\n";
  }
  for (int i = 0; i < x; i++) {
    cout << "*";
  }
}
