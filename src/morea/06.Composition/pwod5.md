---
title: "PWOD5"
published: true
morea_id: pwod5
morea_type: experience
morea_sort_order: 5
morea_summary: "Tree"
morea_labels:
 - by 2/25
---

# PWOD5: Tree

In class we saw how to compose objects to create a BoxCar class. Now we're going to create another composite shape: Tree.

{% include wod-times.html Rx="<25 min" Av="25-50 min" Sd="50-75 min" DNF="75+ min" %}

## Instructions

1. *Start your timer* 
1. If you haven't been following along in class, download the [Picture Project](Picture_starter.zip) and import it into your workspace.
1. Create a new `Tree` class with:
    * 2 fields: a Triangle for the `top` & a Rectangle for the `trunk`
    * 3 constructors:
        * Default constructor (no parameters)
        * Constructor with 4 parameters: `x`, `y`, `width`, & `height`
        * Constructor with 6 parameters: `x`, `y`, `width`, `height`, `topColor`, `trunkColor`
    * getters & setters for `topColor` & `trunkColor`
    * a `setBounds` method that:
        * Has 4 parameters: `x`, `y`, `width`, & `height`
        * The tree starts at `x, y` and extends to `width` & `height`
        * The top is 3/4 height of the tree & the full width
        * The trunk is 1/4 height of the tree & 1/5 the width
     * a `draw` method that takes a `Graphics` parameter and calls the draw methods of the 2 fields
1. Test your new Tree class by adding 3 to the Picture class. Make sure to use different constructors, and change the size of the Tree using `setBounds` to verify that it works correctly for any size tree.
1. *Stop your timer*

## Demonstration

<!--*Coming soon...*-->

Once you've finished doing the WOD a single time, watch me do it:

{% include youtube.html id="JsiGJZUha7E" %}

### My Final Project

[Picture_tree.zip](Picture_tree.zip)

{% include wod-warning.html %}

