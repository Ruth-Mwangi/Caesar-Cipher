public class Encrypt {
    private String mOriginalMessage;
    private String mEncryptMessage;
    private int mKey;
    private char[] mOriginalCharArray;
    private String mAlphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private int currentIndex;
    private int newIndex;
    private char encryptedLetter;



    public String mEncrypt(String message,int mKey){
        mOriginalMessage = message.toUpperCase();


        mEncryptMessage=mOriginalMessage;
        mOriginalCharArray=mOriginalMessage.toCharArray();
        System.out.println("char array"+mOriginalMessage);

        for(Character i:mOriginalCharArray){
            currentIndex=mAlphabet.indexOf(i);

            newIndex=(currentIndex+mKey)%26;
            if(newIndex>26){
                newIndex-=26;
                encryptedLetter=mAlphabet.charAt(newIndex);

                mEncryptMessage=mEncryptMessage.replace(String.valueOf(i),String.valueOf(encryptedLetter));

            }
            else {
                encryptedLetter=mAlphabet.charAt(newIndex);

                mEncryptMessage=mEncryptMessage.replace(String.valueOf(i),String.valueOf(encryptedLetter));

            }

        }

        return mEncryptMessage;

    }


}
