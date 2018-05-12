package introsde.project.storage.soap;

import java.util.Date;
import java.util.List;
import java.util.Map;

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
		return RecombeeDB.addNewItem(db, itemName, itemType, location);
	}

	@Override
	public boolean addNewRating(RecombeeDBType db, Person person, String itemName, double rating, Date time) {	
		return RecombeeDB.addNewRating(db, itemName, person, rating, time);
	}

	@Override
	public boolean modifyRating(RecombeeDBType db, Person person, String itemName, double rating, Date time) {
		return RecombeeDB.modifyRating(db, itemName, person, rating, time);
	}

	@Override
	public List<Evaluation> getItemRatings(RecombeeDBType db, String itemName) {	
		return RecombeeDB.getItemRatings(db,itemName);	
	}

	@Override
	public List<Evaluation> getUserRatings(RecombeeDBType db, Person person) {
		return RecombeeDB.getUserRatings(db,person);
	}

	@Override
	public List<String> getRecommendations(RecombeeDBType db, Person person, int quantity) {
		return RecombeeDB.getRec(db,person, quantity);
		
	}

	@Override
	public Map<String, Object> getItem(RecombeeDBType db, String itemName) {
		return RecombeeDB.getItem(db,itemName);
	}

	@Override
	public List<String> getAllItem(RecombeeDBType db) {
		return RecombeeDB.getAllItem(db);
	}

	@Override
	public List<String> getItemByType(RecombeeDBType db, String itemType) {
		return RecombeeDB.getItemByType(db,itemType);
	}

	@Override
	public boolean initDB(RecombeeDBType db) {
		return RecombeeDB.initDB(db);
	}

	@Override
	public boolean resetDB(RecombeeDBType db) {
		return RecombeeDB.resetDB(db);
	}

	@Override
	public List<Person> getAllPerson() {
		return LocalDB.getAllPerson();
	}
	
}
