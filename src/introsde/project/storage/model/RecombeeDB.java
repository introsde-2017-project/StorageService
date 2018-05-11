package introsde.project.storage.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import introsde.project.adopter.recombee.soap.*;
import introsde.project.data.local.soap.FoodType;
import introsde.project.data.local.soap.MovieGen;
import introsde.project.data.local.soap.Person;




public class RecombeeDB {
	private static RecombeeImplService serviceImp = new RecombeeImplService();
	private static RecombeeInterface serviceInt= serviceImp.getRecombeeImplPort();
	
	
	public RecombeeDB(){}
	
	
	public static boolean addNewRating(RecombeeDBType db, String itemName, Person person, double rating, Date timestemp) {			
		return serviceInt.addRating(db, Integer.toString(person.getIdPerson()), itemName, rating, DateToXML.GregorianCalendar(timestemp));
	}

	public static  List<Evaluation> getItemRatings(RecombeeDBType db, String itemName) {
		return serviceInt.getItemRatings(db, itemName);
	}


	//adding a user in recombee database
	public static void addUser(Person person) {
		if(LocalDB.getPersonByU(person.getUserName())==null) 
			return;
		
		List<String> itemType= new ArrayList<String>();
		
		//if add a user in food recombee data base
		for(MovieGen m: person.getMovieGens()) {
			itemType.add(m.name());
		}
		serviceInt.addUser(RecombeeDBType.MOVIE_DB, Integer.toString(person.getIdPerson()), itemType);

		//else add user in movie DB
		itemType= new ArrayList<String>();
		for(FoodType m: person.getFoodTypes()) {
			itemType.add(m.name());
		}
		serviceInt.addUser(RecombeeDBType.FOOD_DB, Integer.toString(person.getIdPerson()), itemType);
		
	}


	public static  List<String> getRec(RecombeeDBType db, Person person, int quantity) {
		return serviceInt.getRec4User(db, Integer.toString(person.getIdPerson()), quantity);
	}


	public static boolean modifyRating(RecombeeDBType db, String itemName, Person person, double rating,
			Date timestemp) {
		return serviceInt.modifyRating(db, itemName, Integer.toString(person.getIdPerson()), rating, DateToXML.GregorianCalendar(timestemp));
	}


	public static String addNewItem(RecombeeDBType db, String itemName, String itemType, String location) {
		return serviceInt.additem(db, itemName, itemType, location);
		
	}


	public static List<Evaluation> getUserRatings(RecombeeDBType db, Person person) {
		return serviceInt.getUserRatings(db, Integer.toString(person.getIdPerson()));
	}


	@SuppressWarnings("unchecked")
	public static Map<String, Object> getItem(RecombeeDBType db, String itemName) {
		return (Map<String, Object>) serviceInt.getItem(db, itemName);
	}


	public static List<String> getAllItem(RecombeeDBType db) {
		return serviceInt.getAllItem(db);
	}


	public static List<String> getItemByType(RecombeeDBType db, String itemType) {
		return serviceInt.getItemsByType(db, itemType);
	}


	public static boolean initDB(RecombeeDBType db) {
		return serviceInt.initBD(db);
	}


	public static boolean resetDB(RecombeeDBType db) {
		return serviceInt.resetBD(db);
	}


	
	

}
