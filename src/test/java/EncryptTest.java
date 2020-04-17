import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {

    @Test
    public void encrypt_createInstanceOfEncrypt_true() throws Exception{
        Encrypt encrypt=new Encrypt("Hello my name is ruth");
        assertEquals(true,encrypt instanceof Encrypt);
    }

}