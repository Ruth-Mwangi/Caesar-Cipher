public class Encrypt {
    private String mOriginalMessage;
    private String mEncryptedMessage;
    private int mKey;
    private char[] result;
    private String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Encrypt(String mOriginalMessage,int mKey) {
        this.mOriginalMessage = mOriginalMessage.toUpperCase();
        this.mKey=mKey;
    }
}
