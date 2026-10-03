#include "BankAccount.h"
#include <iostream>

void BankAccount::deposit(double amount) { balance += amount; }

void BankAccount::withdraw(double amount) {
  if (balance - amount > 0)
    balance -= amount;
  else
    cout << "Insufficient funds";
}

void BankAccount::display() {
  cout << owner;
  cout << balance;
};
