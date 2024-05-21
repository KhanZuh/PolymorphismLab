public class Teacher extends Person implements Employee {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String getDetails() {
        return "Teacher: " + name + ", Age: " + age + ", Subject: " + subject;
    }

    @Override
    public String work() {
        return "I teach " + subject;
    }

    @Override
    public String introduce() {
        return "Hello, I am a teacher.";
    }
}

