#include <algorithm>
#include <iostream>

using namespace std;

struct Tjeme {
  float x, y;
};

float razdaljina(Tjeme t) { return t.x * t.x + t.y * t.y; }

void stampaj_trougao(float x1, float y1, float x2, float y2, float x3,
                     float y3) {
  Tjeme t[3] = {{x1, y1}, {x2, y2}, {x3, y3}};

  sort(t, t + 3,
       [](Tjeme a, Tjeme b) { return razdaljina(a) < razdaljina(b); });

  float smjer = (t[1].x - t[0].x) * (t[2].y - t[0].y) -
                (t[1].y - t[0].y) * (t[2].x - t[0].x);

  cout << "(" << t[0].x << ", " << t[0].y << ")\n";

  if (smjer > 0)
    swap(t[1], t[2]);

  cout << "(" << t[1].x << ", " << t[1].y << ")\n";
  cout << "(" << t[2].x << ", " << t[2].y << ")\n";
}

int main() { stampaj_trougao(1, 2, 3, 4, 5, 6); }
