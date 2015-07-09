---
title: "PWOD7"
published: true
morea_id: pwod7
morea_type: experience
morea_sort_order: 7
morea_summary: "Bank Account"
morea_labels:
 - by 2/27
---

# PWOD7: Bank Account

So far we've been working with composing shape objects with GUI Java classes. Now we're going to practice composing objects that only output to the console.

{% include wod-times.html Rx="<20 min" Av="20-40 min" Sd="40-60 min" DNF="60+ min" %}

## Instructions

1. *Start your timer* 
1. Create a new Java Project called `BankAccount_uLogin`
1. Create a new `BankAccount` class with:
    * **Fields** to store: current balance, account number, customer name, customer address. *Think about what types these should be. For example, should the account number actually be stored as a number? What about leading 0’s?*
    * A **constructor** that takes the customer’s name, address, and account number, and initializes the balance to 0.
    * Getter and setter methods for the name and address fields. ***No*** setter for the balance or account number (can you guess why?), just getters.
    * A `deposit` and a `debit` method. The method signatures are similar in that they have **no return value** and **one parameter**.
    * A `print` method that prints out the account information, including the current balance. Make sure to use proper formatting so both dollars and cents are displayed correctly. This method should take no parameters and return nothing. (*Hint:* check out Java's [NumberFormat](http://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html).[getCurrencyInstance()](http://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html#getCurrencyInstance--) and this [usage example](http://stackoverflow.com/a/2379425).) 
1. Test your BankAccount class by writing a `main` method that creates a new, empty `BankAccount` stored in a local variable, `myBankAccount`.
    * Deposit $5.00 into your `BankAccount` & print the balance.
    * Debit $1.50 into your `BankAccount` & print the balance.
1. What happens if you try to deposit negative amounts or debit more than the balance? Test each of these cases in main. What do you *think* should happen?
1. Modify the `debit` & `deposit` methods so that negative amounts have no effect. For example, myBankAccount.deposit(5) will add $5, but myBankAccount.deposit(-5) will do nothing. 
1. Modify the `debit` method to make sure there are sufficient funds before deducting from the balance. Print an error message if there are insufficient funds.
2. Now let's create a `Bank` class that can store multiple `BankAccount` objects:
    * **Fields** to store: the Bank's name and a list of accounts.
    * A **constructor** that takes the Bank’s name and initializes the list of accounts.
    * Get and set methods for the name, and a getter for the account list.
    * An `add` method that takes an account as a parameter and adds it to the list of accounts.
    * A `print` method that prints out the Bank's name followed by an overview of all the accounts (i.e., by calling `print` on each account). 
1. Test your Bank class by writing a `main` method that creates a new `Bank`. Add 2-3 accounts to this bank and make sure they have balances > 0. Display the Bank information by calling `print`.
1. *Stop your timer*

## Demonstration

<!--*Coming soon...*-->

Once you've finished doing the WOD a single time, watch me do it:

{% include youtube.html id="cNWowv9ZkMs" %}

### My Final Project

[Shapes_pwod4.zip](Shapes_pwod4.zip)

{% include wod-warning.html %}
