// #include <iostream>
//
// void red(int br) {
//     for(int i = 0; i < br; i++) {
//         std::cout << "* ";
//     }
//     std::cout << std::endl;
// }
//
// int main() {
//     int n;
//     std::cin >> n;
//
//     for(int i = 1; i <= n / 2 + 1; i++) {
//         red(i);
//     }
//     for(int i = n / 2; i >= 1; i--) {
//         red(i);
//     }
//
//
//     return 0;
// }
// Ovo je odradjeno na casu, dolje je pravilna piramida za neparan broj zvjezdica
  

#include <iostream>

using namespace std;

void space(int num) {
  for (int i = 0; i < num; i++) {
    cout << " ";
  }
}

int main() {
  int n;
  cout << "enter pyramid hight: ";
  cin >> n;

  if (n == 0)
    return 1;
  else if (n == 1) {
    cout << "*";
    return 0;
  }

  int k = n / 2;

  for (int i = 1; i <= n; i += 2) {
    space(k);
      for (int j = 0; j < i; j++) {
        cout << "*";
      }
    space(k);
    cout << "\n";
    k--;
  }

  return 0;
}
