public class Encrypt {
    private String mOriginalMessage;
    private String mEncryptedMessage;
    private int mKey;
    private char[] mOriginalCharArray;
    private String mAlphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private int currentIndex;
    private int newIndex;
    private char encryptedLetter;



    public String Encrypt(String message,int key){
        this.mOriginalMessage = message.toUpperCase();
        mKey=key;
        mEncryptedMessage=mOriginalMessage;
        mOriginalCharArray=mOriginalMessage.toCharArray();

        for(Character i:mOriginalCharArray){
            if(!i.equals(' ')){
                currentIndex=mAlphabet.indexOf(i);

                newIndex=(currentIndex+mKey)%26;
                if(newIndex>26){
                    newIndex-=26;
                    encryptedLetter=mAlphabet.charAt(newIndex);
                    mEncryptedMessage=mEncryptedMessage.replace(String.valueOf(i),String.valueOf(encryptedLetter));
                }
                else {
                    encryptedLetter=mAlphabet.charAt(newIndex);
                    mEncryptedMessage=mEncryptedMessage.replace(String.valueOf(i),String.valueOf(encryptedLetter));
                }
            }
        }
        return mEncryptedMessage;
    }

    public String getmEncryptedMessage() {
        return mEncryptedMessage;
    }
}
