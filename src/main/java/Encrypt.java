public class Encrypt {
    private String mOriginalMessage;
    private int mKey;
    private char[] mOriginalCharArray;
    private String mAlphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private int currentIndex;
    private int newIndex;
    private char encryptedLetter;

    public Encrypt(String mOriginalMessage,int mKey) {
        this.mOriginalMessage = mOriginalMessage.toUpperCase();
        this.mKey=mKey;
        mOriginalCharArray=mOriginalMessage.toCharArray();
        mEncryptMessage(mOriginalCharArray,this.mKey);


    }

    private String mEncryptMessage(char[] mOriginalCharArray,int mKey){

        for(char i:mOriginalCharArray){
            currentIndex=mAlphabet.indexOf(i);
            newIndex=(currentIndex+mKey)%26;
            if(newIndex>26)

        }

    }


}
