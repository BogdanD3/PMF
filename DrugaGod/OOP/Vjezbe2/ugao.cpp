#include <iostream>
#include <math.h>
using namespace std;

class Ugao {
private:
  double vrijednost;

public:
  Ugao(double vrijednost) { set_rad(vrijednost); }

  void set_rad(double v) {
    int circles = v / (M_PI * 2);
    if (circles < 0)
      circles--;
    v = v - circles * (M_PI * 2);
    this->vrijednost = v;
  }

  double get_rad() const { return vrijednost; }
  double get_step() const { return 360 / (M_PI * 2) * vrijednost; }
  void set_step(double v) { vrijednost = (M_PI * 2) / 360 * v;}
  void stampa() const {
    cout << get_step() << "step";  
  }

  Ugao plus (double v) {
    return Ugao(vrijednost) ;
  }
};

int main() {
  Ugao u1(500);
  cout << "u1 = " << u1.get_rad() << "ili u stepenima: " << u1.get_step();
  cout << "u1 = "; u1.stampa(); 
  Ugao u2(M_PI);
  Ugao u3 = u1.plus(u2);
  

}
