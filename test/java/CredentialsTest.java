import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CredentialsTest {

    @Test
    void valid() {
        Credentials credentials = new Credentials("username","password");
        assertNotNull(credentials);

        Credentials credentials2 = new Credentials("hofmannol", "GERONIMO");
        assertTrue(credentials2.valid());

        Credentials credentials3 = new Credentials("Hans", "1234");
        assertFalse(credentials3.valid());

        Credentials credentials4 = new Credentials("hofmannol", "1234");
        assertFalse(credentials4.valid());
    }
}
