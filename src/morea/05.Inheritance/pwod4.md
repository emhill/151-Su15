---
title: "PWOD4"
published: true
morea_id: pwod4
morea_type: experience
morea_sort_order: 4
morea_summary: "Rectangle"
morea_labels:
 - by 2/23
---

# PWOD4: Rectangle

In class we saw how to use inheritance to reuse code between our Ellipse and Circle classes. Now it's your turn.

{% include wod-times.html Rx="<10 min" Av="10-20 min" Sd="20-30 min" DNF="30+ min" %}

## Instructions

1. *Start your timer* 
1. If you haven't been following along in class, download the [Shapes Project](Shapes_2_20.zip) and import it into your workspace.
2. Use inheritance to add a Rectangle class to your Shapes project. First, think about how Square and Rectangle are related. Should Rectangle extend Square, or vice versa? We went over both ways in class.
3. Determine what fields are needed in the Square & Rectangle classes. Overlapping fields should only be in *one* class.
3. Your Rectangle & Square classes should have at least 3 constructors each:
    * Default constructor (no parameters)
    * Constructor with parameters for each field except `outlineColor`
    * Constructor with parameters for each field
3. Add get & set methods for all the fields. There should not be any duplicated get/set methods.
4. Make sure the `getArea()` and `getPerimeter()` methods work for both classes, and test in main by creating at least one Rectangle and one Square object.
4. Make sure the `draw()` method works for both classes and test it by adding a Rectangle and Square to your Picture class.
2. Run the program to verify your changes.
1. *Stop your timer*

## Demonstration

<!--*Coming soon...*-->

Once you've finished doing the WOD a single time, watch me do it.

Square as a super class to Rectangle:

{% include youtube.html id="19fPKI0k530" %}

Rectangle as a super class to Square:

{% include youtube.html id="rKLl8vpDxy0" %}

### My Final Project

[Shapes_pwod4.zip](Shapes_pwod4.zip)

{% include wod-warning.html %}
