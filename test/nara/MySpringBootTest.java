package nara;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class MySpringBootTest {

    @Test
    void testPasswordEncoder(){
        System.out.println(new BCryptPasswordEncoder().encode("password"));
    }
}