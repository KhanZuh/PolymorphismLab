import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TeacherTest {
    private Teacher teacher;

    @BeforeEach
    public void setUp() {
        teacher = new Teacher("John Doe", 30, "Math");
    }

    @Test
    public void testGetDetails() {
        assertThat(teacher.getDetails()).isEqualTo("Teacher: John Doe, Age: 30, Subject: Math");
    }

    @Test
    public void testGetSubject() {
        assertThat(teacher.getSubject()).isEqualTo("Math");
    }

    @Test
    public void testIntroduce() {
        assertThat(teacher.introduce()).isEqualTo("Hello, I am a teacher.");
    }

    @Test
    public void testWork() {
        assertThat(teacher.work()).isEqualTo("I teach Math");
    }
}
