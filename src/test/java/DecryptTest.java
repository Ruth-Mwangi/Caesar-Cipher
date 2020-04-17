import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptTest {

    @Test
    public void newDecrypt_createdInstanceOfDerypt_true() throws Exception{
        Decrypt decrypt=new Decrypt();
        String output=decrypt.Decrypt("fcf",2);
        assertEquals(true,output instanceof String);
    }

}