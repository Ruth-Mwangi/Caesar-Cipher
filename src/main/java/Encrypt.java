public class Encrypt {
    private String mOriginalMessage;
    private StringBuilder mEncryptedMessage=new StringBuilder("");
    private int mKey;
    private char[] mOriginalCharArray;
    private String mAlphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private int currentIndex;
    private int newIndex;
    private char encryptedLetter;



    public String Encrypt(String message,int key){
        this.mOriginalMessage = message.toUpperCase();
        mKey=key;
        mOriginalCharArray=mOriginalMessage.toCharArray();

        for(int i=0;i<mOriginalCharArray.length;i++){

            currentIndex=mAlphabet.indexOf(mOriginalCharArray[i]);

            if(currentIndex!=-1){
                newIndex=(currentIndex+mKey)%26;
                if(newIndex>26){
                    newIndex-=26;
                    encryptedLetter=mAlphabet.charAt(newIndex);
                    mEncryptedMessage.append(encryptedLetter);
                }
                else {
                    encryptedLetter=mAlphabet.charAt(newIndex);
                    mEncryptedMessage.append(encryptedLetter);
                }

            }
        }
        return mEncryptedMessage.toString();
    }

    public String getmEncryptedMessage() {
        return mEncryptedMessage.toString();
    }
}
