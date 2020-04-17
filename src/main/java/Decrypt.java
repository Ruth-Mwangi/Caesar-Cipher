public class Decrypt {
    private String mOriginalMessage;
    private String mDecryptedMessage;
    private int mKey;
    private char[] mOriginalCharArray;
    private String mAlphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private int currentIndex;
    private int newIndex;
    private char decryptedLetter;

    public String Decrypt(String message,int key){
        this.mOriginalMessage = message.toUpperCase();
        mKey=key;
        mDecryptedMessage=mOriginalMessage;
        mOriginalCharArray=mOriginalMessage.toCharArray();

        for(Character i:mOriginalCharArray){
            currentIndex=mAlphabet.indexOf(i);

            newIndex=(currentIndex-mKey)%26;
            if(newIndex<0){
                newIndex+=26;
                decryptedLetter=mAlphabet.charAt(newIndex);
                mDecryptedMessage=mDecryptedMessage.replace(String.valueOf(i),String.valueOf(decryptedLetter));
            }
            else {
                decryptedLetter=mAlphabet.charAt(newIndex);
                mDecryptedMessage=mDecryptedMessage.replace(String.valueOf(i),String.valueOf(decryptedLetter));
            }
        }
        return mDecryptedMessage;
    }

    public String getmDecryptedMessage() {
        return mDecryptedMessage;
    }

}
