---
title: "WOD4"
published: true
morea_id: wod4
morea_type: experience
morea_sort_order: 2
morea_summary: "Debugging & Design"
morea_labels:
 - 4/13
---

# WOD4: Debugging & Design

{% include wod-times.html Rx="<15 min" Av="15-30 min" Sd="30-45 min" DNF="45+ min" %}

## Instructions

1. Download the [ShoppingCart Project](ShoppingCart.zip) and import it into your workspace.
2. Rename it `ShoppingCart_uLogin`, replacing uLogin with your Drew e-mail before the '@' sign.
3. Run the code. Is the output what you expect? There are two bugs in the program. Find and fix them. After fixing the bugs, my output looks like this:

		------ SUMMARY ------
		Apples, $3.95
		NY Yankees Tickets, $95.00
		Leather boots, $145.50
		Bananas, $0.79
		Oranges, $1.49
		
		------ INVOICE ------
		Apples (2 lbs) $3.95
		NY Yankees Tickets (behind home plate) $95.00
		Leather boots (black) $145.50
		Bananas (organic) $0.79
		Oranges (navel) $1.49
		----------------------
		Total: $246.73
		Highest-priced item: Leather boots, $145.50
		----------------------

4. Look at the code's design. There is at least one instance of code duplication, and it exhibits poor encapsulation as well as tight coupling. Fix these design flaws without changing the behavior of the program.
5. Imagine you would like to organize the printed summary in `ShoppingCart.printSummary()` by item category: produce, entertainment, clothing, or other. If not specified, the category for an item should be "other". Using an enumerated type, add a new `category` field to the `Item` class. Update `ShoppingCart.printSummary()` to print the categorized summary. Make sure to set the category of each item in main. ***Hint:*** Checkout the [day of the week example from class]({{site.baseurl}}/morea/09.zuul/DayOfWeek.zip)
6. Export your project as an archive file & upload to moodle.

When finished, your program should output something like:

	
	------ SUMMARY ------
	PRODUCE:
		Apples, $3.95
		Bananas, $0.79
		Oranges, $1.49
	
	ENTERTAINMENT:
		NY Yankees Tickets, $95.00
	
	CLOTHING:
		Leather boots, $145.50
	
	
	------ INVOICE ------
	Apples (2 lbs) $3.95
	NY Yankees Tickets (behind home plate) $95.00
	Leather boots (black) $145.50
	Bananas (organic) $0.79
	Oranges (navel) $1.49
	----------------------
	Total: $246.73
	Highest-priced item: Leather boots, $145.50
	----------------------
