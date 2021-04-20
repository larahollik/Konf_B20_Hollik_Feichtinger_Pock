# Konf_B20_Hollik_Feichtinger_Pock
### Authors: 
- Lara Mae Hollik
- Viktoria Feichtinger
- Daniela Pock

### Motivation:
The main motivation is to get used to Git and Github. This is the repository of the first and second submission 
for the subject Configuration Management in 2021.

We created a repository and added additional subclasses. 

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

I didn't create getter and setter methods but **two methods** *for the ingredients of the long drink*, 
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
