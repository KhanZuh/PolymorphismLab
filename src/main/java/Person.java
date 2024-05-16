public class Person {

        private String name;
        private int age;
        private String type;

        public Person(String name, int age, String type){
            this.name = name;
            this.age = age;
            this.type = type;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName(){
            return this.name;
        }


        public int getAge(){
            return this.age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getType() {
            return this.type;

        }

         public void setType(String type) {
             this.type = type;
        }

        public String introduceSelf() {
            return "Hello, my name is " + this.name
        }


}


//Let's break down the `Person` class in English:
//
//1. **Attributes**: This class represents a person, and it has two attributes: `name` and `age`. These attributes are private, meaning they can only be accessed within the `Person` class itself.
//
//2. **Constructor**: When you create a new `Person` object, you need to provide a name and an age. The constructor method is a special method that gets called automatically when you create a new object. It initializes the `name` and `age` attributes with the values you provide.
//
//3. **Accessor Methods**: There are two methods named `getName` and `getAge`. These are used to retrieve the values of the `name` and `age` attributes respectively. They are called "accessor" methods because they allow other parts of the program to access the private attributes indirectly.
//
//4. **Mutator Methods**: There are also two methods named `setName` and `setAge`. These are used to change the values of the `name` and `age` attributes respectively. They are called "mutator" methods because they allow other parts of the program to modify the private attributes indirectly.
//
//By encapsulating the `name` and `age` attributes and providing getter and setter methods, the `Person` class ensures that the data is accessed and modified in a controlled way, promoting data integrity and encapsulation.