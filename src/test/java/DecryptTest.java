import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptTest {

    @Test
    public void newDecrypt_createdInstanceOfDecrypt_true() throws Exception{
        Decrypt decrypt=new Decrypt();
        String output=decrypt.Decrypt("fcd",2);
        assertEquals(true,output instanceof String);
    }

    @Test
    public void decrypt_decryptMessage_String() throws Exception{
        Decrypt decrypt=new Decrypt();
        String expectedOutput="DAD";
        String output=decrypt.Decrypt("fcf",2);
        assertEquals(expectedOutput,output);
    }


}