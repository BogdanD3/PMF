#include <iostream>

using namespace std;

bool trougao(float x1, float y1, float x2, float y2, float x3, float y3) {
  return ((1.0/2)*(x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2)) != 0);
}

int main () {
  if (trougao (1, 2, 3, 4, 5, 6)) {
    cout << "Trokut" << "\n";
  }
  else {
    cout << "Nije trokut" << "\n";
  }
}
