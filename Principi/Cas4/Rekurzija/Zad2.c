#include <stdio.h>
#include <stdlib.h>

int zbir(int* brojevi, int i, int n) {
    if (i == n) {
        return 0;
    }
    return brojevi[i] + zbir(brojevi, i + 1, n);
}

int main() {
    int n;
    printf("Unesite velicinu niza: ");
    scanf("%d", &n);

    int* brojevi = malloc(sizeof(int) * n);

    printf("Unesite brojeve: ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &brojevi[i]);
    }

    printf("Zbir brojeva je: %d\n", zbir(brojevi, 0, n));

    free(brojevi);
    return 0;
}
