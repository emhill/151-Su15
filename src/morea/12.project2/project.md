---
title: "Project 2"
published: true
morea_id: project2
morea_type: experience
morea_sort_order: 7
morea_summary: "Software Maintenance"
morea_labels:
 - due 5/11
---

# Project 2: Improve an Open Source Java Project

<!--*DRAFT*-->

In this project, you will be updating an existing open source Java project by either fixing a bug or adding a new feature. ***By Monday 4/27*** you should have confirmed with me:

1. What project you are working on, and 
2. What bug or new feature you plan on fixing

You may change your mind after 4/27 with approval from me. You may work with a partner.

## Instructions

1. Create a [github](https://github.com/) account (you will need to upload your source code here for full credit)
2. Pick a project & an improvement
3. Plan your change (involves understanding the parts of code related to your bug or feature). I recommend using File search and the debugger to help understand the code.
4. Make your change
5. Test your change
6. Upload your modified code to github
7. Export your change as a zip file & upload to moodle, along with the url to your github project.
8. *Extra credit:* perform a pull request to add your change into the official project source code.

<!-- In future: make sure to submit proposed design first! -->

For more information on git, see:

  * [JavaWorld article](http://www.javaworld.com/article/2078630/open-source-tools/open-source-java-projects-github.html)

### Directions for importing DrewSuperMario from Github

1. Create a [github](https://github.com/) account
1. Install [SourceTree](http://www.sourcetreeapp.com/)
1. Create a repo for your team by forking DrewSuperMario: [https://github.com/emhill/DrewSuperMario.git](https://github.com/emhill/DrewSuperMario.git). *(If you're not working with a partner, you can skip this step and just clone the repo to your local machine.)*
1. And then clone the repo to your local machine using SourceTree: `New Repo -> Clone from URL`
1. Import your new clone into Eclipse by navigating to the path with
`File > Import > Existing Projects Into Workspace > Select root directory >` & navigate local git path (**not** URL)

**Team workflow using git:**

  * Pull latest changes in source tree
  * Make changes in eclipse -- run to test
  * Stage the changed files in source tree
  * Commit changes with an informative commit message & push to repo

Once you're ready to share your changes with the class, then issue a pull request (directions to come).

## Example projects

You may select any open source Java project. Below are some recommended programs that I have already imported into Eclipse.

### Java Mario Platformer

  * **Link**: [https://javamarioplatformer.codeplex.com/](https://javamarioplatformer.codeplex.com/)
  * **Eclipse Project**: [SuperMario.zip](SuperMario.zip)
  * **Main to run**: `src/devforrest.mario.code/GameFrame.java`
  * **Requirements**: Java 7
  * **Size:** 2,930 LOC (lines of code)

**Ideas to improve:**

  * Improve code design
  * Implement Mario dying
  * Support fast running? (may already do this)
  * Add help menu or instructions within the game

### Jajuk Advanced Jukebox

  * **Link**: [http://www.jajuk.info/](http://www.jajuk.info/)
  * **Eclipse Project**: [jajuk.zip](jajuk.zip)
  * **Main to run**: `src/main/java/org.jajuk/Main.java`
  * **Requirements**: Java 6
  * **Size:** 68,692 LOC (lines of code)
  * **Setup guide for developers:** [http://www.jajuk.info/git.html](http://www.jajuk.info/git.html)

<!--**Ideas to improve:**

  * *Coming soon*-->
  
<!--### GanttProject

  * **Link**: [http://www.ganttproject.biz/](http://www.ganttproject.biz/)
  * **Eclipse Project**: [JFreeChart.zip](JFreeChart.zip)
  * **Main to run**: Any demo class in `src/org.jfree.chart.demo`
  * **Requirements**: Java 6
  * **Size:** 96,478 LOC (lines of code)
  * **Setup guide for developers:** [http://www.ganttproject.biz/participate](http://www.ganttproject.biz/participate)

**Ideas to improve:**

  * Fix a verified defect or enhancement: [https://code.google.com/p/ganttproject/issues/list?can=1](https://code.google.com/p/ganttproject/issues/list?can=1)-->

<!--### FreeMind

  * **Link**: [http://freemind.sourceforge.net](http://freemind.sourceforge.net)
  * **Eclipse Project**: [JFreeChart.zip](JFreeChart.zip)
  * **Main to run**: Any demo class in `src/org.jfree.chart.demo`
  * **Requirements**: Java 6
  * **Size:** 96,478 LOC (lines of code)
  * **Setup guide for developers:** [http://freemind.sourceforge.net/wiki/index.php/Development](http://freemind.sourceforge.net/wiki/index.php/Development)

**Ideas to improve:**

  * Fix an open bug (not pending): [http://sourceforge.net/p/freemind/bugs/](http://sourceforge.net/p/freemind/bugs/)
  * Implement a new enhancement: [http://freemind.sourceforge.net/wiki/index.php/Requests_for_enhancements](http://freemind.sourceforge.net/wiki/index.php/Requests_for_enhancements)-->


### JFreeChart Library

  * **Link**: [http://www.jfree.org/jfreechart/](http://www.jfree.org/jfreechart/)
  * **Eclipse Project**: [JFreeChart.zip](JFreeChart.zip)
  * **Main to run**: Any demo class in `src/org.jfree.chart.demo`
  * **Requirements**: Java 6
  * **Size:** 96,478 LOC (lines of code)
  * **Setup guide for developers:** [http://www.jfree.org/jfreechart/developers.html](http://www.jfree.org/jfreechart/developers.html)

**Ideas to improve:**

  * Fix a bug: [http://sourceforge.net/p/jfreechart/bugs/](http://sourceforge.net/p/jfreechart/bugs/)
  * Implement a new feature: [http://sourceforge.net/p/jfreechart/feature-requests/](http://sourceforge.net/p/jfreechart/feature-requests/)