public class CeaserCipher {
    private String mMessage;
    private int mKey;
    public CeaserCipher(String mMessage, int mKey) {
        this.mMessage = mMessage.toUpperCase();
        this.mKey = mKey;
    }

    public String getmMessage() {
        return mMessage;
    }

    public int getmKey() {
        return mKey;
    }
}
