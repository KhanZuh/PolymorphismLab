public class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String getDetails() {
        return "Student: " + name + ", Age: " + age + ", Grade: " + grade;
    }

    @Override
    public String introduce() {
        return "Hi, I am a student.";
    }
}
