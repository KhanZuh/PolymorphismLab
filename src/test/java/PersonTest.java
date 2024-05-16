import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Zuhair", 27, "Student");
    }

    @Test
    void testGetName() {
        assertThat(person.getName()).isEqualTo("Zuhair");
    }

    @Test
    void testSetName() {
        person.setName("Aaron");
        assertThat(person.getName()).isEqualTo("Aaron");
    }

    @Test
    void testGetAge() {
        assertThat(person.getAge()).isEqualTo(27);
    }

    @Test
    void testSetAge() {
        person.setAge(30);
        assertThat(person.getAge()).isEqualTo(30);
    }

    @Test
    void testGetType() {
        assertThat(person.getType()).isEqualTo("Student");
    }

    @Test
    void testSetType() {
        person.setType("Teacher");
        assertThat(person.getType()).isEqualTo("Teacher");
    }
}
