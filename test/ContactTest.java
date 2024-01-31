package phoneBook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactTest {
    Contact myContact;
    @BeforeEach
    public void testThisFirst() {
        myContact = new Contact("jack","jacob","0813399999");
    }
    @Test
    public void TestForFirstName(){
        assertEquals("jack",myContact.getFirstName());
    }

    @Test
    public void TestForLastName(){
        assertEquals("jacob",myContact.getLastName());
    }
    @Test
    public void TestForPhoneNumber(){
        assertEquals("0813399999",myContact.getPhoneNumber());
    }

}
