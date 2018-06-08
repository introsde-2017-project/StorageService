# introsde-2017-project-StorageService
 
NAME: Cheema Danish Asghar  
EMAIL: danishasghar.cheema@studenti.unitn.it  

Group Partner by:  
NAME: Jan Main muhammad Faheem  
EMAIL: main.jan@unitn.it  

heroku WSDL ULR: http://storage-introsde-2018.herokuapp.com/ws/storage?wsdl  
Github  ripo: https://github.com/introsde-2017-project/StorageService  
Project WIKI: https://github.com/introsde-2017-project/Wiki  

## introduction:
This is a storage layer for the `knowYourCity` app which i uses for combine all the lower database layes, in my case recombee layer and local data layer,  
It recives all the requests from higher layes and redirect the request accordingly, higher layer in our case business laye dont know any thing about all the Datastorages available.  
Its a Soap Service which can be used via WSDL in order to save, modify, and get data like persisting new user to DB or rating for specific food/movie by a user.  

## Implementation:  
### `Model`:  

#### 1.DateToXML.java    
   * used to convert a java.util.Date to XMLGregorianCalendar.
#### 2.LocalDB.java    
   * Method #1 `addPerson(Person p)`  it adds person to the database.    
   * Method #2 `getPersonByU(String username)` it gets person giving its username.  
   * Method #3 `getFoodTypes()` it returns all the food types in the list.  
   * Method #4 `getMovieGens()` it returns all the movies genere in the list.  
   * Method #5 `updatePerson(Person person)` it makes changes in the person object.  
   * Mthod  #6 `getAllPerson()` . it returns all the person in list.  
   * Method #7 `getPersonByToken(String token)` it returns person giving its token.  
#### 3.RecombeeDB.java   
   * Method #1 `addNewRating(RecombeeDBType db, Evaluation rating)` it adds new rating to the database.      
   * Method #2 `getItemRatings(RecombeeDBType db, String itemName)` it returns item's rating from the specified database.  
   * Method #3 `addUser(Person person)` it adds users to the database.   
   * Method #4 `getRec(RecombeeDBType db, Person person, int quantity)`    
   * Method #5 `getUserRatings(RecombeeDBType db, Person person)` it returns ratings of the specified person.    
   * Mthod  #6 `getAllItem(RecombeeDBType db)` it returns all the items of the specified database(food,movie).  
   * Method #7 `getItemByType(RecombeeDBType db, String itemType)`   
    
### `Soap`:  
consist of a Class and an interface which defines which operations are allowed to user.  
#### 1.StorageInterface.java  
Interface define some methods which are to be override in the implementation class.  
#### 2.StorageImpl.java
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

## Execuation:
1: clone or download the code from server git repo.  
2: run following commands on command line   
```
git init
git add .
git commit -am "initial commit"
heroku create NAME-OF-HEROKU-APP
git push heroku master 

```
in my project NAME-OF-HEROKU-APP="storage-introsde-2018"
