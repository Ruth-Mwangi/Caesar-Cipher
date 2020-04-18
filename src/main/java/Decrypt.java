public class Decrypt {
    private String mOriginalMessage;
    private StringBuilder mDecryptedMessage=new StringBuilder("");
    private int mKey;
    private char[] mOriginalCharArray;
    private String mAlphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private int currentIndex;
    private int newIndex;
    private char decryptedLetter;

    public String Decrypt(String message,int key){
        this.mOriginalMessage = message.toUpperCase();
        mKey=key;
        mOriginalCharArray=mOriginalMessage.toCharArray();

        for(int i=0;i<mOriginalCharArray.length;i++){

            currentIndex=mAlphabet.indexOf(mOriginalCharArray[i]);

            if (currentIndex!=-1){
                newIndex=(currentIndex-mKey)%26;
                if(newIndex<0){
                    newIndex+=26;
                    decryptedLetter=mAlphabet.charAt(newIndex);
                    mDecryptedMessage.append(decryptedLetter);                    }
                else {
                    decryptedLetter=mAlphabet.charAt(newIndex);
                    mDecryptedMessage.append(decryptedLetter);
                }

            }
        }
        return mDecryptedMessage.toString();
    }

    public String getmDecryptedMessage() {
        return mDecryptedMessage.toString();
    }

}
