import java.util.ArrayList;

public class SchoolRegister {

    private ArrayList<Person> persons;
    public SchoolRegister(){
        this.persons = new ArrayList<>();
    }

    public int countPersons(){
        return this.persons.size();
    }

    public void addPerson(Person person){ //Adds a person to the collection of persons - (@param person) The person to add. The @param tag in Java documentation comments is used to describe a method's parameters. -
        this.persons.add(person);

    }

    public int getAllPersons(){
        return this.persons.size();
    }
}


//Code explainer - persona reference - parsed with chatGPT
//It seems like you've started working on a SchoolRegister class in Java. Let's break down what you've got so far and see how we can continue building upon it.
//
//Import Statement:
//
//You're importing the ArrayList class from the java.util package. This will allow you to use ArrayLists in your code.
//Class Declaration:
//
//You've declared a class named SchoolRegister.
//Instance Variable:
//
//You have an ArrayList named persons declared as private. This will hold instances of the Person class. Making it private means it can only be accessed within the SchoolRegister class.
//Constructor:
//
//You've defined a constructor for the SchoolRegister class. This constructor initializes the persons ArrayList.
//countPersons Method:
//
//You have a method named countPersons that returns the size of the persons ArrayList. This method will be used to determine how many people are registered in the school.





//        Overall, you've created a foundation for your SchoolRegister class. To make it more functional, you'll likely want to add methods for adding persons, removing persons, searching for persons by criteria (such as name or ID), and perhaps methods for generating reports or statistics based on the registered persons.