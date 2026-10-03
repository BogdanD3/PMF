#include "BankAccount.h"

int main (int argc, char *argv[]) {
  BankAccount account;
  account.owner = "dela";
  account.balance = 100.4;

  account.display();
  return 0;
}
