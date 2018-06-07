package introsde.project.storage.model;

import java.util.List;

import introsde.project.data.local.soap.FoodType;
import introsde.project.data.local.soap.MovieGen;
import introsde.project.data.local.soap.Person;
import introsde.project.data.local.soap.UserImplService;
import introsde.project.data.local.soap.UserInterface;


public class LocalDB {
	private static UserImplService serviceImp =  new UserImplService();
	private static UserInterface serviceInt = serviceImp.getUserImplPort();
	
	public static Person addPerson(Person p) {
		return serviceInt.addPerson(p);
	}
	

	public static Person getPersonByU(String username) {
		return serviceInt.getPerson(username);
	}
	
	public static List<FoodType> getFoodTypes() {
		return serviceInt.getFoodTypes();
		
	}
	
	public static List<MovieGen> getMovieGens() {
		return serviceInt.getMovieGens();
	}


	public static Person updatePerson(Person person) {
		return serviceInt.updatePerson(person);
	}


	public static List<Person> getAllPerson() {
		return serviceInt.getAllPerson();
	}


	public static Person getPersonByToken(String token) {
		return serviceInt.getPersonByToken(token);
	}

	
}
