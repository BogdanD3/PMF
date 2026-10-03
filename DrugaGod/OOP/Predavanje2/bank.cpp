#include <iostream>
#include <string>

using namespace std;

class Racun {
private:
  double uplata;
  double isplata;
  string vlasnik;

public:
  Racun(double uplata, string vlasnik) {
    this->uplata = uplata;
    this->isplata = 0;
    this->vlasnik = vlasnik;
  }

  void Uplata(double iznos) { uplata += iznos; }
  void Isplata(double iznos) { isplata += iznos; }

  void Stanje() const { cout << uplata - isplata << "\n"; }
};
