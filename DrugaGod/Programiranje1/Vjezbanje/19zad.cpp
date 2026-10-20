#include <iostream>
#include <cmath>

using namespace std;

float povrsina(float x1, float y1, float x2, float y2, float x3, float y3) {
  return fabs((1.0/2)*(x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2)));
}

int main () {
  cout << povrsina (1, 2, 3, 4, 5, 6) << "\n";
}
