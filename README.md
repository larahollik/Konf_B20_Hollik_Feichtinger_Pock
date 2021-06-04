# Configuration Management '21 - Group D

## Authors:
- Lara Mae Hollik
- Viktoria Feichtinger
- Daniela Pock

## Motivation:
The main motivation is to get used to Git and Github.

This repository contains a given simple example project from the course 'Configuration Management' in 2021.
The given project is the basis to get started with Git and its commands but also to get used to JUnit test, JavaDoc, etc.


## Classes:
- `Main`
- `Liquid`
- `Drink`
    - `Cocktail`
        -  `LongDrink`
    - `SimpleDrink`
        -  `Juice`
  
***Classes for JUnit Tests:***

- `CocktailTest`
- `LongDrinkTest`
- `JuiceTest`
- `CashRegisterTest`

***Document structure of maven site***

- `markdown`
    - `index.md`
    - `JUnit-Tests.md`
    - `README.md`
    - `tutorial.md`
- `site.xml`

___


# Details about each assignment

## First Assignment - Version 1.0

To view the specification of the assignment, click here: 
[Uebung02: Abgabe01 Versionsverwaltung](https://moodle.campus02.at/pluginfile.php/131161/mod_resource/content/1/Konfig%20Uebung02%20-%20der%20Weg%20zur%20ersten%20Abgabe%2020210311.pdf)


### Lara Mae Hollik subclass of Drink named Cocktail
I have derived the abstract class `Drink` and created a new subclass called `Cocktail`. This class contains **new attributes**
in addition to the inherited name of Drink. These are the *flavour, the glass, a list of decorations, the alcohol
percentage and the volume*.
Furthermore, I have created an **enumeration** for the *cocktail type*. This type can be assigned to the cocktail after the
object has been created.

I created **getter and setter methods** for all private attributes. I implemented the methods specified by the abstract
class. Additionally, a **method** was created to *print all details of the cocktail*. **Two other methods** worth mentioning
are on the one hand a method to *define the flavour and print the result* and on the other hand a method to *check the
glass type and print the result*.




### Daniela Pock subclass of SimpleDrink named Juice

I created the non-alcoholic subclass `Juice` of the class `SimpleDrinks`. The class Juice has **4 attributes**, an *object
simple drink* as basis, a *String mainIngredient* for the main ingredient of the juice, a *double sugarPercent* which shows
the sugar content in Percent of the juice, and a *boolean isDilutedWithWater* which shows if the juice was diluted with water.

Then I created **getter and setter methods** for the private attributes. I implemented an **additional method** which turns the
information into a *String* called *informationToString*.



### Viktoria Feichtinger subclass of Cocktail named LongDrink
I created a subclass named `LongDrink` of the class `Cocktail`. The class has **three methods** and **one additional attribute** of
*type "CocktailType"* from the `Cocktail` class to set the cocktail type of that class to "Longdrink".

I didn't create getter and setter methods but **two methods** for the *ingredients* of the long drink,
one method gives information about non-alcoholic ingredients, the other one about alcoholic ingredients,
the information is turned into a String.
To print out the information a **method** called *toString* has been implemented, it gives details about the name,
flavour, cocktail type, glass type and ingredients.

___
## Second Assignment - Version 2.0

To view the specification of the assignment, click here: 
[Moodle - Uebung04: Abgabe02 Testen und JavaDocs](https://moodle.campus02.at/pluginfile.php/133583/mod_resource/content/0/Konfig%20Uebung04%20-Zweite%20Abgabe%2020210415.pdf)

### Lara Mae Hollik
- I have rebuilt my `Cocktail` class so that the *volume* and *alcohol* percentage are now passed in the constructor. I have
  now also adapted this in the `main` class. Because the class `LongDrink` inherits from me, I also had to modify it and
  insert the changes in the constructor and in the `main` class. For better clarity and formatting reasons, I have inserted
  a separator line in the main.


- In my `Cocktail` class, I fixed the *addAllDecorations* method and added additional checks to the elements. This way I can
  check whether it is the only element in my *ArrayList* or the last element and whether I need a comma (only for multiple
  elements) or not.


- I have added the `CocktailTest` class and written suitable unit tests in it to be able to test my methods comprehensively.
  I have also created a pom.xml file.


- I rewrote the methods *printTastingFlavourMessage* and *printGlassTypeMessage*, which are in the `Cocktail` class, to make
  my methods more testable. Finally, I formatted the code in the `Cocktail` class.



### Viktoria Feichtinger
- I mended a typing error in `Cocktail` so that the output would appear without common typing mistakes


- Due to additional information about *volume* and *alcohol percentage* from `Cocktail` I have changed the *toString* method.


- To test my written methods in `LongDrink` I have added the class `LongDrinkTest` which contains three unit tests.
  Details on how to implement JUnit Test are below: [JUnit tests - Structure](#junit-tests---structure)

- I changed some syntax and formatting in README.md with the help of the [Markdown Guide (Basic Syntax)](https://www.markdownguide.org/basic-syntax/#horizontal-rules)
  and the [Markdown Guide (Markdown Cheat Sheet)](https://www.markdownguide.org/cheat-sheet).


- I added the missing documentation to `LongDrink` and `LongDrinkTest` classes and improved the previous documentation.
  How did I do it? View [JavaDoc basics](#crashcourse---javadoc-basics) for additional information.


- I wrote a draft of some explanations about the most important [JavaDoc basics](#crashcourse---javadoc-basics)
  and as a reminder on how to use git properly I summarized the most important in the [Git Cheat Sheat](#git-cheat-sheat) .


### Daniela Pock

- I added the unit test for the Class `Juice`, the test structure follows the same structure as there [JUnit tests - Structure](#junit-tests---structure)
    + added tests for getters and setters
      The method getsD() and setsD() are tested with one test.
    + added a test for the informationToString method of the class Juice
    
    + Do the testcases cover 100% of the testcases?
      Yes!

- adapted the `README.md`: added information to the git diff command in the [Git Cheat Sheat](#git-cheat-sheat)

- added the JavaDoc Markups to the class `Juice`


## Third Assignment - Version 3.0

The third assignment is primarily about creating a Maven project. To view the specification of the task click here: 
[Moodle - Uebung06: Abgabe03 Maven Projekt](https://moodle.campus02.at/pluginfile.php/135684/mod_resource/content/0/Konfig%20Uebung06%20-%20Dritte%20Abgabe%2020210517.pdf)

###Lara Hollik

- JUnit Tests for the class  `CashRegister`
  - Do the test cases cover 100% of the testcases? Yes!
  - The JUnit structure is the same as in [JUnit tests - Structure](#junit-tests---structure) explained

###Viktoria Feichtinger

- edited `README.md`

- Merged `cashRegister` branch into main

- added the third version tag

###Daniela Pock

- Implemented the interface `Article` in every subclass of Drink, it contains two methods [calcPrice() and addArticle(String day, String seller)] 

- Implemented the class `CashRegister`: it is a new feature to use the program as a new cash register 
  - The feature is detailed explained in the Maven Site Documentation

- Implemented JUnit test cases for calcPrice() and addArticle(String day, String seller) for every subclass of Drink
  - Do the test cases cover 100% of the testcases? Yes!
  
- Implemented the Maven Site Documentation, for more information view below [Maven Site Documentation](#maven-site-documentation)


___


# Information Sheat


## Git Cheat Sheat
For more/ detailed information view on [Moodle](https://moodle.campus02.at/pluginfile.php/131659/mod_resource/content/1/Konfig%20Source%20Code%20Versionsverwaltung%20Hilfestellung%20Teil%203%20Fortsetzung%2020210318.pdf)
or on [Github Cheat Sheat](https://training.github.com/downloads/github-git-cheat-sheet/)

### First implementation:
|Git command|Description|
|---|---|
|**git config --global user.name "FirsName Surname"** |Sets the name of the "commit messenger"|
|**git config --global user.email "xxxx@xxx.com"**|Sets the email address of the "commit messenger"|
|**git config --global init.defaultBranch main**|Previous standard branch ("master") is set to "main", projects will be now initialised with "main"-branch|
|**git init**|*Use where you want the git repository located*, git repository is initialised local| 
|**git status**|Shows status of current git repository (local!), all new and edited files are listed|
|**git add *fileName***|Add file for the first time or after change to git staging area|
|**git commit -m "Your message"**|Short messages about change (added files from staging area are now transferred to git repository)|
|**git log --graph**|Gives information about previous commits|
|**git diff**|Shows the difference between the file which is added and the file which is in the actual branch|
|**git *unknown command* --help**|Gets additional help (example: git commit --help)|

### Git remote server commands

|Git command|Description|
|---|---|
|**git clone url**|Loads an existing repository from GitHub on the local files|
|**git pull**|Changes from the remote repository are pulled on the local files|
|**git push**|Local changes are pushed to the remote repository in GitHub|

**Important workflow during working on a project:**


![Git workflow](https://github.com/viktoriaBSD/Programmieren2-github/blob/main/images/git-workflow.png)

### Git branching and merging commands
|Git command|Description|
|---|---|
|**git branch *new-branchName***|Creates a new "timeline" that separates from the main project (main branch) so no development gets lost  |
|**git checkout *new-branchName***|Switches to the new branch|
|**git branch**|Checks witch branch is active|
|**git checkout main**|Switches back to main after development and versioning of the new features in the new-branchName|
|**git merge new-branchName**|Transfers changes from new-branchName to main Branch|
|**git branch -d new-feature**|Deletes branch|
|**git log --pretty=format:"%h%s" --graph**|Git log with different presentation|


### Git Tags

To access easier to previous versions, the versions can be tagged (with a short comment)


`git tag -a version-1.0.0 -m "A first working version of this project."`

Similar to the branches, we can switch to a tag

`git checkout tags/version-1.0.0`

### Git branch and to push to the remote branch

First checkout the local branch:

`git checkout <branch>`


Then push the branch to the remote repository to show colleges:

`git push -u origin <branch>`

or to transfer all local branches use: `git push --all u`



___
## CrashCourse - *JavaDoc basics*

### Overview

A good documentation is one of many factors contributing to the success of a software project.
It helps to keep track of the implementations for themselves and for others



### JavaDoc comments

view details [here](https://www.baeldung.com/javadoc)

```java
// Single line comment

/*
 * Regular multiple line comment       
 */

/**
 * JavaDoc comment
 */
```

JavaDoc comments may be placed above any class, method, or field which we want to document.

These comments are made up of two sections:

1. The description of what we're commenting on
2. The block tags (marked with the "@" symbol) which describe specific meta-data

#### JavaDoc at *Fields*
```java
/**
 * Description  
 */
```

#### Javadoc at *Classes*:
```java
/**
 * Description 
 * 
 * @blocked tags 
 */
```

#### JavaDoc at *Methods*:
```java
/**
 * Description [Begins with a verb phrase]
 * 
 * @param nameOfParameter Description of parameter
 * @return description of return [for every non-void method]
 */
```

### Tags
Two different types of Tags: (view details [here](https://www.javaguides.net/2018/12/the-javadoc-tags-explained.html))

- **stand-alone tags**: (also called block tags) they must be alone in their line
- **in-line tags**: can be used in larger description


Common block tags in order according to [oracle-documentation](https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html):

| Tag | Usage in | Description |
| --- | --- | ---|
|**@author**| classes and interfaces only, required| provides the author
|**@version**| classes and interfaces only, required | provides current version, for example "@version 1.0, 02/28/97" (mm/dd/yy)
|**@param**| methods and constructors only | is followed by the name of the parameter, followed by a description of the parameter, for example "@param name gives name of ..."
|**@return**| methods only | gives details about the return value
|**@throws** (@exception)| methods (and classes) | gives information about what exception is thrown
|**@see**| class, interface, instance variable and methods | generates a link to an other element of the documentation
|**@since**| class, interface, instance variables and methods | specifies the product version when the implementation was created
|**@serial**| class | describes the serializable state of an implementation
|**@deprecated**| method | first sentence should give user information when the API was deprecated and what to use as a replacement


Common in-line tags:

| Tags | Description | 
| --- | --- | 
| **{@link *reference*}**| link to an implementation|
|**{@linkplain *reference*}**| link is displayed as a standard text instead of source text characters
|**{@code}**| suppresses the interpretation of included HTML or JavaDoc tags 


## JUnit Tests - Structure

The JUnit tests contains three phases: setup, exercise and verify. 

Example from the `LongDrinkTest` class:

```java
    class LongDrinkTest{
    // Phase: setup with @BeforeEach (initialisation for working with same constructed object
    @BeforeEach
    void setup(){}

      // all test methods - structure:
      // Phase: Excersise 
      @Test
      @DisplayName("Testing xxx method")
      void xxx() {
        // Phase: Verify
        assertEquals("The expected value of the method", the_value_of_the_object_from_setup); 
      }
      // run all tests and reached 100%
    }
```

## Maven Site Documentation

First implementation was in the fifth practice session with 
[that](https://moodle.campus02.at/pluginfile.php/134766/mod_resource/content/4/Konfig%20Uebung05%20-%20Maven%20Projekt%20und%20Maven%20Repository%2020210429.pdf) 
task.

To get started, we had to use [Maven in 5 Minutes Guide](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
for installation and first implementation with the Maven Project.


**Useful Links for Documentation we used:**
(copied from the Calculator Project from the course)

- Maven Site
  - [Creating Content](https://maven.apache.org/plugins/maven-site-plugin/examples/creating-content.html)
  - [Configuring Site Descriptor](https://maven.apache.org/plugins/maven-site-plugin/examples/sitedescriptor.html)
  - [Markup Formats](https://maven.apache.org/doxia/references/index.html)
- The [README Checklist](https://github.com/noffle/art-of-readme#bonus-the-readme-checklist)
- [Make a README](https://www.makeareadme.com/) (why, who, when, where, ...)
- [Documentation System](https://documentation.divio.com/)

Our Maven Site Documentation contains a directory named `site` which has a file named `site.xml` and an other diretory 
named `markdown` (it contains 4 files)
- `site.xml`: it describes the structure of the site 
  

- `markdown`
  - `index.md`: explains the decisions about the design of CashRegister
  - `JUnit-Tests.md`: explains our test coverage
  - `tutorial.md`: gives information about how to use the `CashRegister` class to other developers
  - `README.md`: contains all information on how we worked and how we implemented the new learned content

