import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SchoolRegisterTest {

    SchoolRegister schoolRegister;

    @BeforeEach
    void setUp(){
        schoolRegister = new SchoolRegister();
    }

    @Test
    void canCountPersons(){
        assertThat(schoolRegister.countPersons()).isEqualTo(0);
    }

    @Test
    void canAddPerson(){
        Person student = new Student("Zuhair", );

    }

    @Test
    void canAddMultiplePersons(){

    }

}
}
