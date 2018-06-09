package introsde.project.storage.soap;

import java.util.List;

import javax.jws.WebService;

import introsde.project.adopter.recombee.soap.Evaluation;
import introsde.project.adopter.recombee.soap.ItemObject;
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
	
//	@Override
//	public List<Person> getAllPerson() {
//		return LocalDB.getAllPerson();
//	}

	@Override
	public Person getPersonByToken(String token) {
		return LocalDB.getPersonByToken(token);
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
	public boolean addNewRating(RecombeeDBType db, Evaluation rating) {	
		return RecombeeDB.addNewRating(db, rating);
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
	public List<ItemObject> getRecommendations(RecombeeDBType db, Person person, int quantity) {
		return RecombeeDB.getRec(db,person, quantity);
		
	}

	@Override
	public List<ItemObject> getAllItem(RecombeeDBType db) {
		return RecombeeDB.getAllItem(db);
	}

	@Override
	public List<ItemObject> getItemByType(RecombeeDBType db, String itemType) {
		return RecombeeDB.getItemByType(db,itemType);
	}

	@Override
	public boolean initDB(RecombeeDBType db) {
		return RecombeeDB.initDB(db);
	}

	
	
}
