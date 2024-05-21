import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

public class SchoolRegisterTest {
    private SchoolRegister register;
    private Teacher teacher;
    private Student student;

    @BeforeEach
    public void setUp() {
        register = new SchoolRegister();
        teacher = new Teacher("John Doe", 30, "Math");
        student = new Student("Jane Doe", 20, "A");
    }


    @Test
    public void testEmptyArray() {
        List<Person> people = register.getPeople();
        assertTrue(people.isEmpty());
    }

//    Lesson from Anna --> good idea to test Array list --> check if empty at start.

    @Test
    public void testAddPerson() {
        register.addPerson(teacher);
        register.addPerson(student);

        List<Person> people = register.getPeople();
        assertThat(people.size()).isEqualTo(2);
    }
}
