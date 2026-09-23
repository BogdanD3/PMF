#include <stdio.h>

void helper(int n, char *s, int *i) {
    if (n < 10) {
        s[(*i)++] = n + '0';
        return;
    }

    helper(n / 10, s, i);

    int curr = n % 10;
    int prev = (n / 10) % 10;

    if (curr == prev)
        s[(*i)++] = '0';

    s[(*i)++] = curr + '0';
}

char* insert0(int n) {
    static char s[100];
    int i = 0;

    helper(n, s, &i);
    s[i] = '\0';

    return s;
}

int main() {
    printf("%s", insert0(2024));
}
