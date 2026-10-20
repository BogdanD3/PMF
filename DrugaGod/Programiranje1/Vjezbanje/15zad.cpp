#include <iostream>
#include <cmath>
using namespace std;

int main() {
    double x, s = 0;
    int n;
    cin >> x >> n;

    double faktorijel = 1;

    for (int i = 1; i <= n; i++) {
        faktorijel *= i;

        if (i % 2 == 1) {
            s += pow(sin(x - 2), 2) / faktorijel;
        } else {
            s -= pow(sin(x - 2), 2) / faktorijel;
        }
    }

    cout << s << endl;

    return 0;
}
