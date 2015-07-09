---
title: "PWOD3"
published: true
morea_id: pwod3
morea_type: experience
morea_sort_order: 2
morea_summary: "PiggyBank"
morea_labels:
 - by 2/18
---

# PWOD3: PiggyBank Class

So far we've been working with shapes and GUI Java classes. Can you write & test a single Java class that only outputs to the console?

{% include wod-times.html Rx="<20 min" Av="20-40 min" Sd="40-60 min" DNF="60+ min" %}

## Instructions

1. *Start your timer* 
1. Create a new Java Project called `PiggyBank_uLogin`
2. Right-click on your PiggyBank project and go to New > Class to create a `PiggyBank` class. Go ahead and check the box for Eclipse to create a main method.
1. Add 4 fields to this class: `pennies`, `nickels`, `dimes`, and `quarters`. These fields will hold the *number* of each type of coin in your piggy bank.
2. Create a default constructor with no parameters that initializes the fields to an empty piggy bank. 
3. Write 4 methods to insert a single coin of each type: `insertPenny`, `insertNickel`, `insertDime`, and `insertQuarter`. The method signatures are similar in that there is **no return value** and **no parameters**.
3. Write 4 methods to insert multiple coins of each type: `insertPennies`, `insertNickels`, `insertDimes`, and `insertQuarters`. The method signatures are similar in that there is **no return value** and **one parameter**.
4. Write a `print` method that prints out how many quarters, dimes, nickels, and pennies are in the piggy bank. This method should have no return value and no parameters.
4. In your main method, create a new, empty PiggyBank and store it in a local variable. Call `print` on this empty PiggyBank. 
2. Run the program to verify your changes. Do you see the appropriate output for an empty piggy bank?
3. Now add 67 cents to your piggy bank in main and print its contents again. Do you see the correct output?
3. Write a method `getAmount` that returns the total amount of money in the piggy bank. The amount should be expressed as an integer that represents the total number of cents (¢) in the piggy bank.
4. Modify the print method to print the total by calling `getAmount()`.
5. Run the program to verify your changes.
6. Write a method `insertAmount` that takes a number of cents as a parameter and adds the appropriate number of quarters, dimes, nickels, and pennies into the piggy bank. You should use the largest coins possible to add the amount. (Hint: you may need to use %)
3. In main, insert 67¢ more into your PiggyBank object using the `insertAmount` method you just created. Print out the contents to verify your code is correct.
2. Run the program to verify your changes.
3. Assuming our PiggyBank class is modelling a real life piggy bank, can you guess why we don't want to create any constructors with parameters? We also don't want to add any get or set methods -- do you know why?
1. *Stop your timer*

## Demonstration

 Once you've finished doing the WOD a single time, watch me do it:

{% include youtube.html id="UsuueYD_JjY" %}

### My Final Project

[PiggyBank.zip](PiggyBank.zip)

{% include wod-warning.html %}

