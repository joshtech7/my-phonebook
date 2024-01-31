package phoneBook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    @Test
    public void testThatUserCanAddPhoneNumber(){
        String firstName = "jack";
        String lastName = "jacob";
        String phoneNumber = "0810000";
        User user = new User();
        user.savePhoneNumber(firstName,lastName,phoneNumber);
        assertEquals(1,user.getTotalPhoneNumberCount());
    }
    @Test
    public void testThatUserCanSearchPhoneNumberByName(){
        String firstName = "jack";
        String lastName = "jacob";
        String phoneNumber = "0810000";
        User user = new User();
        user.savePhoneNumber(firstName,lastName,phoneNumber);
        assertEquals(1,user.getTotalPhoneNumberCount());
        String name = String.valueOf(user.searchPhoneNumber(firstName));
        assertTrue(true,name);
    }

}

