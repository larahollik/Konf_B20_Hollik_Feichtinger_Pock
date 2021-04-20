# Konf_B20_Hollik_Feichtinger_Pock
### Authors: 
- Lara Mae Hollik
- Viktoria Feichtinger
- Daniela Pock

### Motivation:
The main motivation is to get used to Git and Github.

This repository contains a given simple example project from the course 'Configuration Management' in 2021. 
The given project is the basis to get started with Git and its commands but also to get used to the Javadoc, etc.


## Classes:
- `Main`
- `Liquid`
- `Drink`
- `SimpleDrink`
- `Cocktail`
- `Juice`
- `Longdrink`

***Classes for JUnit Tests:***
- `CocktailTest`
- `LongDrinkTest`
___

# First Assignment - Version 1.0
## Lara Mae Hollik subclass of Drink named Cocktail
I have derived the abstract class `Drink` and created a new subclass called `Cocktail`. This class contains **new attributes** 
in addition to the inherited name of Drink. These are the *flavour, the glass, a list of decorations, the alcohol 
percentage and the volume*.
Furthermore, I have created an **enumeration** for the *cocktail type*. This type can be assigned to the cocktail after the 
object has been created.

I created **getter and setter methods** for all private attributes. I implemented the methods specified by the abstract 
class. Additionally, a **method** was created to *print all details of the cocktail*. **Two other methods** worth mentioning 
are on the one hand a method to *define the flavour and print the result* and on the other hand a method to *check the 
glass type and print the result*.




## Daniela Pock subclass of SimpleDrink named Juice

I created the non-alcoholic subclass `Juice` of the class `SimpleDrinks`. The class Juice has **4 attributes**, an *object 
simple drink* as basis, a *String mainIngredient* for the main ingredient of the juice, a *double sugarPercent* which shows 
the sugar content in Percent of the juice, and a *boolean isDilutedWithWater* which shows if the juice was diluted with water.

Then I created **getter and setter methods** for the private attributes. I implemented an **additional method** which turns the 
information into a *String* called *informationToString*.



## Viktoria Feichtinger subclass of Cocktail named LongDrink
I created a subclass named `LongDrink` of the class `Cocktail`. The class has **three methods** and **one additional attribute** of 
*type "CocktailType"* from the `Cocktail` class to set the cocktail type of that class to "Longdrink". 

I didn't create getter and setter methods but **two methods** for the *ingredients* of the long drink, 
one method gives information about non-alcoholic ingredients, the other one about alcoholic ingredients, 
the information is turned into a String. 
To print out the information a **method** called *toString* has been implemented, it gives details about the name, 
flavour, cocktail type, glass type and ingredients.

___

# Second Assignment - Version 2.0
## Lara Mae Hollik
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



## Viktoria Feichtinger
- I mended a typing error in `Cocktail` so that the output would appear without common typing mistakes


- Due to additional information about *volume* and *alcohol percentage* from `Cocktail` I have changed the *toString* method.


- To test my written methods in `LongDrink` I have added the class `LongDrinkTest` which contains three unit tests. 
They contain the three phases: setup, exercise and verify. 
    ````java
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
    assertEquals("The expected value of the method", the value of the object from setup); 
  }
  // run all tests and reached 100%
  }  
  
- I changed some syntax and formatting in README.md with the help of the [Markdown Guide (Basic Syntax)](https://www.markdownguide.org/basic-syntax/#horizontal-rules)
and the [Markdown Guide (Markdown Cheat Sheet)](https://www.markdownguide.org/cheat-sheet).


- I added the missing documentation to `LongDrink` and `LongDrinkTest` classes and improved the previous documentation.
How did I do it? View [JavaDoc basics](#crashcourse---javadoc-basics) for additional information.
  

- I wrote a draft of some explanations about the most important [JavaDoc basics](#crashcourse---javadoc-basics).

___

# CrashCourse - *JavaDoc basics*

## Overview

A good documentation is one of many factors contributing to the success of a software project.
It helps to keep track of the implementations for themselves and for others



## JavaDoc comments

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

### JavaDoc at *Fields*
```java
/**
 * Description  
 */
```

### Javadoc at *Classes*:
```java
/**
 * Description 
 * 
 * @blocked tags 
 */
```

### JavaDoc at *Methods*:
```java
/**
 * Description [Begins with a verb phrase]
 * 
 * @param nameOfParameter Description of parameter
 * @return description of return [for every non-void method]
 */
```

# Tags
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

