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
//		List<String> l= new ArrayList<String>();
//		for(FoodType t:serviceInt.getFoodTypes()) {
//			l.add(t.value());
//		}
//		return l;
		
		return serviceInt.getFoodTypes();
		
	}
	
	public static List<MovieGen> getMovieGens() {
		//List<String> l= new ArrayList<String>();
		//for(MovieGen t:serviceInt.getMovieGens()) {
		//	l.add(t.value());
		//}
		//return l;
		
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

//	public static void addFoodRating(int personId, int foodId, double rating, Date timestemp) throws DatatypeConfigurationException {
//		GregorianCalendar c = new GregorianCalendar();
//		c.setTime(timestemp);
//		XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
//		serviceInt.addFoodRating(personId, foodId, rating, date);
//	}
//	
//	public static void addMovieRating(int personId, int movieId, double rating, Date timestemp) throws DatatypeConfigurationException {
//		GregorianCalendar c = new GregorianCalendar();
//		c.setTime(timestemp);
//		XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
//		serviceInt.addMovieRating(personId, movieId, rating, date);
//	}
//
//	public static Food addFood(Food f) {
//		return serviceInt.setFood(f);
//	}
//
//	public static Movie addMovie(Movie m) {
//		return serviceInt.setMovie(m);
//	}

	
}
