#include "Stack.h"

Stack::Stack() {
  data = new int[10];
}

Stack:~Stack() {
  delete data;
}
