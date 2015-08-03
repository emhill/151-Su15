---
title: "PHW12"
published: true
morea_id: pwod12
morea_type: experience
morea_sort_order: 6
morea_summary: "Arrays"
morea_labels:

---

# PHW12: MultiplicationTable

In this PHW, you will practice working with two-dimensional arrays.

<!--{% include wod-times.html Rx="<15 min" Av="15-30 min" Sd="30-45 min" DNF="45+ min" %}-->

## Instructions

  * Create a class `MultiplicationTable` with 2 fields: a two-dimensional integer array & a scaling factor
  * Create a constructor that takes 3 parameters: width, height, & scaling factor
    * Initialize `array[0][0] = scaling factor`
    * Initialize `array[w-1][h-1] = scaling factor * width * height`
    * Initialize all the remaining values in between as appropriate
  * Create a `print` method to print out the table
  * Create a `lookup` method that takes two indexes (of the ranges 1 to width and 1 to height) and returns the appropriate value (0 otherwise)
  * Test your methods in main.
  * *Optional:* Want all your numbers to line up in nice columns?

        String format = "%10d";
        int value = 10;
        System.out.format(format, value);

  * *Optional:* Want all your numbers to line up relative to the length of the largest value? Figure out the length of your longest number:

        String.valueOf(biggest).length();

## Demonstration

*Coming soon...*

<!--Once you've finished doing the WOD a single time, watch me do it:

{% include youtube.html id="Gnc0hJ2mPs4" %}-->

