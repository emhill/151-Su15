---
title: "Working with Eclipse projects"
published: true
morea_id: reading-eclipse-work
morea_summary: "Importing, exporting, and avoiding common mistakes."
morea_type: reading
morea_sort_order: 0
---

# Working with Eclipse projects

Working with Eclipse can be a little bit tricky at first, but. There are usually many correct ways to do things, but they don't all work all the time.

## Importing an Eclipse project

You can import a project into eclipse by either going to the file menu or right-clicking in the package explorer:

<a href="file-import.png"><img src="file-import.png" height="250"/></a> |  **OR** | <a href="file-import-click.png"><img src="file-import-click.png" height="250"/></a>

Then go to General > Existing Projects into Workspace | | select archive file, and browse to the zip file on your computer.
<a href="import-general.png"><img src="import-general.png" width="300"/></a> | | <a href="import-project.png"><img src="import-project.png" width="300"/></a> 

If you (or your computer) has unzipped the project, select "root directory" instead and browse to the folder.

## Exporting an Eclipse project

Whenever you submit an assignment, you will need to export it from Eclipse as a zip file. The simplest way to export a project in Eclipse is to right-click on the project in the package explorer:

| Select "Export" | | Navigate to General > Archive file... |
| <a href="export-menu.png"><img src="export-menu.png" height="400"/></a> | | <a href="import-project.png"><img src="export-archive.png" height="400"/></a> |

...and choose the path to the archive file. 

<a href="export-path.png"><img src="export-path.png" width="400"/></a>

## Deleting an Eclipse project

In an Eclipse workspace, you can only have one project with the same name. That means if you want to try a WOD again that relies on *importing* a project, rather than creating a new one from scratch, you will need to either:

1. Create a new workspace,
2. Rename your last attempt, **OR**
3. Delete your last attempt

When deleting a project from eclipse, make sure you delete the contents from disk so you don't have naming conflicts in future:

<a href="delete-project.png"><img src="delete-project.png" width="400"/></a>

*This **cannot** be undone*, so make sure you don't want the code anymore!

## Creating a new Eclipse project

As with importing, you can create a new Java project in eclipse by either going to the file menu or right-clicking in the package explorer:

<a href="new-menu.png"><img src="new-menu.png" width="200"/></a> |  **OR** | <a href="new-click.png"><img src="new-click.png" width="200"/></a>

If you don't see the Java Project option, go to "Other"...

<a href="new-other.png"><img src="new-other.png" width="300"/></a>

... and navigate to Java > Java Project.

<a href="new-java.png"><img src="new-java.png" width="400"/></a>

Next, name your project and hit "Finish".

<a href="new-name.png"><img src="new-name.png" width="400"/></a>
