import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {

    @Test
    public void newEncrypt_createInstanceOfEncrypt_true() throws Exception{
        Encrypt encrypt=new Encrypt();
        String output=encrypt.Encrypt("dad",2);
        assertEquals(true,output instanceof String);
    }
    @Test
    public void encrypt_encryptMessage_String() throws Exception{
        Encrypt encrypt = new Encrypt();
        String expectedOutput="FCF";
        String output=encrypt.Encrypt("dad",2);
        assertEquals(expectedOutput,output);
    }

}