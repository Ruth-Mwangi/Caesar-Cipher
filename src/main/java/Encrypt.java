public class Encrypt {
    private String mOriginalMessage;
    private String mEncryptedMessage;
    private int mKey;

    public Encrypt(String mOriginalMessage,int mKey) {
        this.mOriginalMessage = mOriginalMessage;
        this.mKey=mKey;
    }
}
