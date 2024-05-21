public abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    Other methods
//    Explanation
//    getDetails() method fulfills the requirement for polymorphism by providing different implementations in each subclass, the introduce() method adds another layer of abstraction by ensuring that each subclass has its own implementation to introduce itself.

    public abstract String getDetails();

//    Extension abstract method
    public abstract String introduce();

}




// See mac - Notes - Lab reviews  - Polymorphism for a deep dive about inheritance/polymorphism with examples (including this) --> Rubber duck method explanation
