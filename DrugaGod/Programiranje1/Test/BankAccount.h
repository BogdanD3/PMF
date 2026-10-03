#include <iostream>
#include <string>

using namespace std;

class BankAccount {
  public:
    string owner;
    double balance;

    void deposit(double amount);
    void withdraw(double amount);
    void display();
    
};
