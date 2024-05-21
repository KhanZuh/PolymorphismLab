import java.util.ArrayList;
import java.util.List;

public class SchoolRegister {
    private List<Person> people;
    private Employee employee;

//    declares a private instance variable people, which is a list of Person objects. List is an interface that represents an ordered collection of elements. In this case, it's a list of Person objects.

    public SchoolRegister() {
        this.people = new ArrayList<>();
        this.employee = new Teacher("John Doe", 30, "Math");

    }
//     constructor of the SchoolRegister class. It initializes the people list by creating a new instance of ArrayList. This constructor will be called when a new SchoolRegister object is created.

    public void addPerson(Person person) {
        people.add(person);
    }
//    allows adding a Person object to the people list. It simply delegates the addition to the add method of the ArrayList class.

    public List<Person> getPeople() {
        return new ArrayList<>(people);
    }
//    returns a copy of the people list --> creates a new ArrayList object initialized with the elements of the people list and returns it - why? -  This ensures that the original list is not modified when accessing it from outside the class.
}


//Usage of getters and setters
//SchoolRegister class, there are no additional attributes beyond the List<Person> people, so we only need a getter method for people, as it is not appropriate to expose a setter for a list like this, to maintain encapsulation!!!!

// Reflecting on code
//Overall, this code defines a simple school register system with the ability to add people and retrieve a list of all people registered in the school.
// It follows good practice by encapsulating the people list and providing methods to interact with it.