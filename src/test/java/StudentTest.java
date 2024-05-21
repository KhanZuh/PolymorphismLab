import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StudentTest {
    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student("Jane Doe", 20, "A");
    }

    @Test
    public void testGetDetails() {
        assertThat(student.getDetails()).isEqualTo("Student: Jane Doe, Age: 20, Grade: A");
    }

    @Test
    public void testGetGrade() {
        assertThat(student.getGrade()).isEqualTo("A");
    }

    @Test
    public void testIntroduce() {
        Student student = new Student("Jane Doe", 20, "A");
        assertThat(student.introduce()).isEqualTo("Hi, I am a student.");
    }
}
