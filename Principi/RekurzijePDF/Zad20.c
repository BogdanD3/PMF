#include <stdio.h>

char* f(char *s, char c) {
    if (*s == '\0')
        return NULL;

    if (*s == c)
        return s;

    return f(s + 1, c);
}

int main() {
    char s[] = "programiranje";
    char c = 'r';

    char *p = f(s, c);

    if (p != NULL) {
        printf("Pronadjen na poziciji: %ld\n", p - s);
    } else {
        printf("Nije pronadjen\n");
    }

    return 0;
}
