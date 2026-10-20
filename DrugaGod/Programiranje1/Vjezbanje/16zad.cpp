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

        double brojilac = pow(x + 1, 2 * i + 1);

        if (i % 2 == 0) {
            s += brojilac / faktorijel;
        } else {
            s -= brojilac / faktorijel;
        }
    }

    cout << s << endl;

    return 0;
}
