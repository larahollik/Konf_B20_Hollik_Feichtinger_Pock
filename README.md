# Konf_B20_Hollik_Feichtinger_Pock
### Authors: 
- Lara Mae Hollik
- Viktoria Feichtinger
- Daniela Pock

### Motivation:
The main motivation is to get used to Git and Github. This is the first submission for the subject Configuration Management in 2021.

We created a repository and added additional subclasses. 

## Classes:
- Main
- Liquid
- Drink
- SimpleDrink
- Cocktail
- Juice
- Longdrink


## Lara Mae Hollik subclass of Drink named Cocktail
I have derived the abstract class Drink and created a new subclass called Cocktail. This class contains new attributes in addition to the inherited name of Drink. These are the flavour, the glass, a list of decorations, the alcohol percentage and the volume.
Furthermore, I have created an enumeration for the cocktail type. This type can be assigned to the cocktail after the object has been created.

I created getter and setter methods for all private attributes. I implemented the methods specified by the abstract class. Additionally, a method was created to print all details of the cocktail. Two other methods worth mentioning are on the one hand a method to define the flavour and print the result and on the other hand a method to check the glass type and print the result.




## Daniela Pock subclass of SimpleDrink named Juice

I created the non-alcoholic subclass Juice of the class SimpleDrinks. The class Juice has 4 attributes, an object simple drink as basis, a String mainIngredient for the main ingredient of the juice, a double sugarPercent which shows the sugar content in Percent of the juice, and a boolean isDilutedWithWater which shows if the juice was diluted with water.

Then I created getter and setter methods for the private attributes. I implemented an additional method which turns the information into a String called informationToString.



## Viktoria Feichtinger subclass of Cocktail named LongDrink
