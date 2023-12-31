package arifunikom.lombok;

import lombok.extern.java.Log;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {

    @Test
    void testCreate(){

        var login1 = Login.create("iif","rahasia");
        var login2 = Login.createEmpty();

        Assertions.assertEquals("iif", login1.getUsername());
        Assertions.assertEquals("rahasia", login1.getPassword());

        Assertions.assertNull(login2.getUsername());
        Assertions.assertNull(login2.getPassword());

    }

    @Test
    void testToString(){

        var login = Login.create("iif", "rahasia");
        System.out.println(login);

    }

}
