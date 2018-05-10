package introsde.project.storage.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import introsde.project.adopter.recombee.soap.Evaluation;
import introsde.project.adopter.recombee.soap.RecombeeDBType;
import introsde.project.adopter.recombee.soap.RecombeeImplService;
import introsde.project.adopter.recombee.soap.RecombeeInterface;
import introsde.project.data.local.soap.FoodType;
import introsde.project.data.local.soap.MovieGen;
import introsde.project.data.local.soap.Person;




public class RecombeeDB {
	private static RecombeeImplService serviceImp = new RecombeeImplService();
	private static RecombeeInterface serviceInt= serviceImp.getRecombeeImplPort();
	private static RecombeeDBType foodRecombeeDB= RecombeeDBType.FOOD_DB;
	private static RecombeeDBType movieRecombeeDB= RecombeeDBType.MOVIE_DB;
	
	
	public RecombeeDB(){}
	
	
	public static boolean addFoodRating(String itemName, Person person, double rating, Date timestemp) {			
		return serviceInt.addRating(foodRecombeeDB, Integer.toString(person.getIdPerson()), itemName, rating, DateToXML.GregorianCalendar(timestemp));
	}
	public static boolean addMovieRating(String itemName, Person person, double rating, Date timestemp) {			
		return serviceInt.addRating(movieRecombeeDB, Integer.toString(person.getIdPerson()), itemName, rating, DateToXML.GregorianCalendar(timestemp));
	}


	public static  List<Evaluation> getFoodRatings(String itemName) {
		return serviceInt.getItemRatings(foodRecombeeDB, itemName);
	}
	public static  List<Evaluation> getMovieRatings(String itemName) {
		return serviceInt.getItemRatings(movieRecombeeDB, itemName);
	}


	//adding a user in recombee movie database
	public static void addUser(Person person) {
		if(LocalDB.getPersonByU(person.getUserName())==null) 
			return;
		
		List<String> itemType= new ArrayList<String>();
		
		//if add a user in food recombee data base
		for(MovieGen m: person.getMovieGens()) {
			itemType.add(m.name());
		}
		serviceInt.addUser(movieRecombeeDB, Integer.toString(person.getIdPerson()), itemType);

		//else add user in movie DB
		itemType= new ArrayList<String>();
		for(FoodType m: person.getFoodTypes()) {
			itemType.add(m.name());
		}
		serviceInt.addUser(foodRecombeeDB, Integer.toString(person.getIdPerson()), itemType);
		
	}


	public static  List<String> getMovieRec(Person person, int quantity) {
		 
		return serviceInt.getRec4User(movieRecombeeDB, Integer.toString(person.getIdPerson()), quantity);
	}


	public static  List<String> getFoodRec(Person person, int quantity) {
		return serviceInt.getRec4User(foodRecombeeDB, Integer.toString(person.getIdPerson()), quantity);
	}


	public static boolean modifyMovieRating(String itemName, Person person, double rating,
			Date timestemp) {
		return serviceInt.modifyRating(movieRecombeeDB, itemName, Integer.toString(person.getIdPerson()), rating, DateToXML.GregorianCalendar(timestemp));
	}
	public static boolean modifyFoodRating(String itemName, Person person, double rating,
			Date timestemp) {
		return serviceInt.modifyRating(movieRecombeeDB, itemName, Integer.toString(person.getIdPerson()), rating, DateToXML.GregorianCalendar(timestemp));
	}


	public static boolean addMovie(String itemName, String itemType, String location) {
		return serviceInt.additem(movieRecombeeDB, itemName, itemType, location);
		
	}


	public static boolean addFood(String itemName, String itemType, String location) {
		return serviceInt.additem(foodRecombeeDB, itemName, itemType,location);
		
	}


	public static List<Evaluation> getUserFoodRatings(Person person) {
		return serviceInt.getUserRatings(foodRecombeeDB, Integer.toString(person.getIdPerson()));
	}


	public static List<Evaluation> getUserMovieRatings(Person person) {
		return serviceInt.getUserRatings(movieRecombeeDB, Integer.toString(person.getIdPerson()));
	}


	
	

}
