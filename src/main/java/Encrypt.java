public class Encrypt {
    private String mOriginalMessage;
    private String mEncryptMessage;
    private int mKey;
    private char[] mOriginalCharArray;
    private String mAlphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private int currentIndex;
    private int newIndex;
    private char encryptedLetter;

    public Encrypt(String mOriginalMessage,int mKey) {
        this.mOriginalMessage = mOriginalMessage.toUpperCase();
        this.mKey=mKey;

        mEncrypt(mOriginalMessage,this.mKey);


    }

    private String mEncrypt(String mOriginalMessage,int mKey){

        mEncryptMessage=mOriginalMessage;

        mOriginalCharArray=mOriginalMessage.toCharArray();

        for(char i:mOriginalCharArray){
            currentIndex=mAlphabet.indexOf(i);
            newIndex=(currentIndex+mKey)%26;
            if(newIndex>26){
                newIndex-=26;
                encryptedLetter=mAlphabet.charAt(newIndex);
                mEncryptMessage.replaceAll(String.valueOf(i),String.valueOf(encryptedLetter));

            }
            else {
                encryptedLetter=mAlphabet.charAt(newIndex);
                mEncryptMessage.replaceAll(String.valueOf(i),String.valueOf(encryptedLetter));

            }


        }

    }


}
