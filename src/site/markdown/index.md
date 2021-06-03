#Decisions about the design of CashRegister.java:

- used an *Interface* called *Article.java* to implement the methods *calcPrice()* and *addArticle(String day, String seller)*
- added this interface to all subclasses of **Drink.java**
- added the class **CashRegister.java** for implementing a CashRegister
- Seller is a String to keep it simple
- Day of the sell is a String to keep it simple
- The list of sells is a static ArrayList made of CashRegister Objects called *sells*
