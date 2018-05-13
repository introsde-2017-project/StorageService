package introsde.project.storage.model;

import java.util.ArrayList;
import java.util.List;

import introsde.project.adopter.recombee.soap.*;
import introsde.project.data.local.soap.FoodType;
import introsde.project.data.local.soap.MovieGen;
import introsde.project.data.local.soap.Person;




public class RecombeeDB {
	private static RecombeeImplService serviceImp = new RecombeeImplService();
	private static RecombeeInterface serviceInt= serviceImp.getRecombeeImplPort();
	
	
	public RecombeeDB(){}
	
	
	public static boolean addNewRating(RecombeeDBType db, Evaluation rating) {
		return serviceInt.addRating(db, rating);
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


	public static boolean modifyRating(RecombeeDBType db, Evaluation rating) {
		return serviceInt.modifyRating(db, rating);
	}


	public static String addNewItem(RecombeeDBType db, String itemName, String itemType, String location) {
		return serviceInt.additem(db, itemName, itemType, location);
		
	}


	public static List<Evaluation> getUserRatings(RecombeeDBType db, Person person) {
		return serviceInt.getUserRatings(db, Integer.toString(person.getIdPerson()));
	}

	public static ItemObject getItem(RecombeeDBType db, String itemName) {
		return serviceInt.getItem(db, itemName);
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
