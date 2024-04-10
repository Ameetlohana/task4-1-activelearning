package decisiontable;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.deakin.SimpleLoginForm;

public class simpleloginformtest {
	
	@Test
    public void testValidCredentials() {
        String result = SimpleLoginForm.Login("testuser", "testpass");
        assertEquals("success", result);
    }

    @Test
    public void testInvalidUsername() {
        String result = SimpleLoginForm.Login("invaliduser", "testpass");
        assertEquals("username mismatch", result);
    }

    @Test
    public void testInvalidPassword() {
        String result = SimpleLoginForm.Login("testuser", "invalidpass");
        assertEquals("password mismatch", result);
    }

    @Test
    public void testBothInvalid() {
        String result = SimpleLoginForm.Login("invaliduser", "invalidpass");
        assertEquals("username mismatch", result);
    }
}


