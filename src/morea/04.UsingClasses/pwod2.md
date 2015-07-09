---
title: "PWOD2: Triangle"
published: true
morea_id: pwod2
morea_type: experience
morea_sort_order: 2
morea_summary: "Practice WOD: Triangle Class"
morea_labels:
 - by 2/13
---

# PWOD2: Triangle Class

In lecture we created a Circle class together. Going from that example, try to create a Triangle class.

## Instructions

1. *Start your timer* 
1. If you haven't been following along in class, download the [Shapes Project](Shapes_ehill1_02-09.zip) and import it into your workspace.
2. Right-click on your Shapes project and go to New > Class to create a `Triangle` class. Go ahead and check the box for Eclipse to create a main method.
1. Add 6 fields to this class: `x`, `y`, `width`, `height`, `fillColor`, and `outlineColor`. Integers recommended.
2. Add 3 constructors:
    * Default constructor (no parameters)
    * Constructor with 5 parameters (no `outlineColor`)
    * Constructor with 6 parameters (one for each field)
3. Add get & set methods for all the fields
4. Add a getArea() method & test it in main by creating a Triangle variable & initializing it by calling one of the constructors.
4. Add a draw method that draws the triangle.
    * Hint 1: check out java.awt.Polygon
    * Hint 2: starting from `(x, y)`, where should the other 2 vertices be drawn using only the fields?
4. Add a Triangle field to your Picture class to test it. Make your picture resemble something, like an ice cream cone or someone in a birthday hat.
2. Run the program to verify your changes.
1. *Stop your timer*

<!--3. Export your program by right-clicking on your project folder, and selecting “Export > General > Archive File”. Name the file “HelloWorldGUI_uLogin.zip”.-->


{% include wod-times.html Rx="<20 min" Av="20-40 min" Sd="40-60 min" DNF="60+ min" %}

## Demonstration

 Once you've finished doing the WOD a single time, watch me do it:

{% include youtube.html id="dnU6XB0O8Nk" %}

### My Final Project

[Shapes_pwod2.zip](Shapes_pwod2.zip)

{% include wod-warning.html %}

