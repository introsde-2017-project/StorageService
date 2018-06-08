introsde-2017-project-StorageService


Identification:  
NAME: Cheema Danish Asghar  
EMAIL: danishasghar.cheema@studenti.unitn.it  

Client Code Done by:  
NAME: Main muhammad Faheem - Jan  
EMAIL:main.jan@unitn.it  

Server heroku ULR:
Server Git ripo:

Client Git riop:

In this repository there are some packages which are the following.  
A) "Model" which has the following Classes:  

 ## 1.DateToXML.java    
 ## 2.LocalDB.java    
    * Method #1 `addPerson(Person p)`  it adds person to the database.    
    * Method #2 `getPersonByU(String username)` it gets person giving its username.  
    * Method #3 `getFoodTypes()` it returns all the food types in the list.  
    * Method #4 `getMovieGens()` it returns all the movies genere in the list.  
    * Method #5 `updatePerson(Person person)` it makes changes in the person object.  
    * Mthod  #6 `getAllPerson()` . it returns all the person in list.  
    * Method #7 `getPersonByToken(String token)` it returns person giving its token.  
 ## 3.RecombeeDB.java   
    * Method #1 `addNewRating(RecombeeDBType db, Evaluation rating)` it adds new rating to the database.      
    * Method #2 `getItemRatings(RecombeeDBType db, String itemName)` it returns item's rating from the specified database.  
    * Method #3 `addUser(Person person)` it adds users to the database.   
    * Method #4 `getRec(RecombeeDBType db, Person person, int quantity)`    
    * Method #5 `getUserRatings(RecombeeDBType db, Person person)` it returns ratings of the specified person.    
    * Mthod  #6 `getAllItem(RecombeeDBType db)` it returns all the items of the specified database(food,movie).  
    * Method #7 `getItemByType(RecombeeDBType db, String itemType)`   
    
B) "Model" which has the following Class and an interface:  
 ## 1.StorageInterface.java  
     It has some methods declared which are to be defined in the implementation class.  
 ## 2.StorageImpl.java
    * Method #1  `addNewPerson(Person person)`        
    * Method #2  `getPerson(String username)`   
    * Method #3  `getAllPerson()`     
    * Method #4  `getPersonByToken(String token)`      
    * Method #5  `updatePerson(Person person)`      
    * Mthod  #6  `getFoodTypes()`  
    * Method #7  `getMovieGens()`   
    * Method #8  `addNewRating(RecombeeDBType db, Evaluation rating)`  
    * Method #9  `getItemRatings(RecombeeDBType db, String itemName)`   
    * Method #10 `getUserRatings(RecombeeDBType db, Person person)`  
    * Method #11 `getRecommendations(RecombeeDBType db, Person person, int quantity) `  
    * Method #12 `getAllItem(RecombeeDBType db)`  
    * Method #13 `getItemByType(RecombeeDBType db, String itemType)`  
    * Method #14 `initDB(RecombeeDBType db)`  
