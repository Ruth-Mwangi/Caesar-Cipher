import org.junit.Test;

import static org.junit.Assert.*;

public class CeaserCipherTest {

    @Test
    public void getMessage_checksForMessage_true() throws Exception{
        CeaserCipher cipher=new CeaserCipher("My name is ruth",3);
        assertEquals(true,cipher instanceof CeaserCipher);
    }

}