#include <stdio.h>
#define INT_SIZE sizeof(int) * 8

void leastSegnificantBit(int n) {
  int lsb = n & 1;
  printf("The least significant bit of %d is: %d\n", n, lsb);
}

void checkBit(int n, int k) {
  int bit = (n >> k) & 1;
  printf("The %d-th bit of %d is: %d\n", k, n, bit);
}

void setBit(int n, int k) {
  n |= (1 << k);
  printf("%u\n", n);
}

void swichBit(int n, int k) {
  n ^= (1 << k);
  printf("%u\n", n);
}

void maxOneBit(int n) {
  for (int i = INT_SIZE - 1; i >= 0; i--) {
    if ((n >> i) & 1) {
      printf("%d\n", i);
      return;
    }
  }
  printf("-1\n");
}

void minOneBit(int n) {
  for (int i = 0; i < INT_SIZE; i++) {
    if ((n >> i) & 1) {
      printf("%d\n", i);
      return;
    }
  }
  printf("-1\n");
}

void countZeroBits(int n) {
  int zeroes = 0;
  for (int i = 0; i < INT_SIZE; i++) {
    if (!((n >> i) & 1)) {
      zeroes++;
    }
  }
  printf("%d", zeroes);
}

void countOneBits(int n) {
  int ones = 0;
  for (int i = 0; i < INT_SIZE; i++) {
    if ((n >> i) & 1) {
      ones++;
    }
  }
  printf("%d", ones);
}

void invertBits(int n) { printf("%d", ~n); }

unsigned int shiftBits(unsigned int n) {
  unsigned int bit = n & 1;
  n = (n >> 1) | (bit << (sizeof(int) * 8 - 1));
  return n;
}

unsigned int rightShiftBits(unsigned int n, int k) {
  for (int i = 0; i < k; i++) {
    n = shiftBits(n);
  }
  return n;
}

void evenBits(unsigned int n) {
  if (n & 1)
    printf("%s", "num is odd");
  else
    printf("%s", "num is even");
}

void numInBits(unsigned int n) {
  for (int i = sizeof(int) * 8 - 1; i >= 0; i--) {
    putchar(((n >> i) & 1) + '0');
  }
  putchar('\n');
}

void findOneBit(unsigned int n) {
  for (int i = sizeof(int) * 8 - 1; i >= 0; i--) {
    if ((n >> i) & 1) {
      printf("%d", i + 1);
      return;
    }
  }
  printf("-1");
}

unsigned int msb(unsigned int n) {
  unsigned int bit = 1;

  while (bit <= n) {
    bit <<= 1;
  }

  return bit >> 1;
}

int main() {
  leastSegnificantBit(7);  // 7 → 1
  leastSegnificantBit(12); // 12 → 0

  checkBit(7, 0); // 1
  checkBit(7, 1); // 1
  checkBit(7, 2); // 1
  checkBit(7, 3); // 0

  setBit(7, 4);  // 23
  setBit(12, 0); // 13

  swichBit(7, 1); // 5
  swichBit(7, 4); // 23

  return 0;
}
