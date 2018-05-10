package introsde.project.storage.soap;

import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import introsde.project.adopter.recombee.soap.Evaluation;
import introsde.project.adopter.recombee.soap.RecombeeDBType;
import introsde.project.data.local.soap.FoodType;
import introsde.project.data.local.soap.MovieGen;
import introsde.project.data.local.soap.Person;
import introsde.project.storage.model.LocalDB;
import introsde.project.storage.model.RecombeeDB;

@WebService(endpointInterface = "introsde.project.storage.soap.StorageInterface")
public class StorageImpl implements StorageInterface {

	public StorageImpl(){
		
	}

	@Override
	public Person addNewPerson(Person person) {
		Person p= LocalDB.addPerson(person);
		RecombeeDB.addUser(p);
		return p;
	}

	@Override
	public Person getPerson(String username) {
		return LocalDB.getPersonByU(username);
	}

	@Override
	public Person updatePerson(Person person) {
		return LocalDB.updatePerson(person);
	}

	@Override
	public List<FoodType> getFoodTypes() {
		return LocalDB.getFoodTypes();
	}

	@Override
	public List<MovieGen> getMovieGens() {
		return LocalDB.getMovieGens();
	}

	@Override
	public String addNewItem(RecombeeDBType db, String itemName, String itemType, String location) {
		if(db.equals(RecombeeDBType.FOOD_DB)) {
			return RecombeeDB.addFood(itemName, itemType, location);
		}
		else {
			return RecombeeDB.addMovie(itemName, itemType, location);
		}
		
	}

	@Override
	public boolean addNewRating(RecombeeDBType db, Person person, String itemName, double rating, Date time) {
		if(db.equals(RecombeeDBType.FOOD_DB)) {
			return RecombeeDB.addFoodRating(itemName, person, rating, time);
		}
		else {
			return RecombeeDB.addMovieRating(itemName, person, rating, time);
		}
	}

	@Override
	public boolean modifyRating(RecombeeDBType db, Person person, String itemName, double rating, Date time) {
		if(db.equals(RecombeeDBType.FOOD_DB)) {
			return RecombeeDB.modifyFoodRating(itemName, person, rating, time);
		}
		else {
			return RecombeeDB.modifyMovieRating(itemName, person, rating, time);
		}
	}

	@Override
	public List<Evaluation> getItemRatings(RecombeeDBType db, String itemName) {
		if(db.equals(RecombeeDBType.FOOD_DB)) {
			return RecombeeDB.getFoodRatings(itemName);
		}
		else {
			return RecombeeDB.getMovieRatings(itemName);
		}
	}

	@Override
	public List<Evaluation> getUserRatings(RecombeeDBType db, Person person) {
		if(db.equals(RecombeeDBType.FOOD_DB)) {
			return RecombeeDB.getUserFoodRatings(person);
		}
		else {
			return RecombeeDB.getUserMovieRatings(person);
		}
	}

	@Override
	public List<String> getRecommendations(RecombeeDBType db, Person person, int quantity) {
		if(db.equals(RecombeeDBType.FOOD_DB)) {
			return RecombeeDB.getFoodRec(person, quantity);
		}
		else {
			return RecombeeDB.getMovieRec(person, quantity);
		}
	}
	
}
