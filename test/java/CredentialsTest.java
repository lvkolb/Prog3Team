import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CredentialsTest {

    @Test
    void valid() {
        Credentials credentials = new Credentials("username","password");
        assertNotNull(credentials);

        Credentials credentials2 = new Credentials("hofmannol", "GERONIMO");
        assertTrue(credentials2.valid());
    }
}
