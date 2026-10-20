#include <iostream>

using namespace std;

int okreni(int n) {
    static int obrnuti = 0;

    if (n == 0)
        return obrnuti;

    obrnuti = obrnuti * 10 + n % 10;
    return okreni(n / 10);
}

int main() {
  cout << okreni(269) << "\n";
}
