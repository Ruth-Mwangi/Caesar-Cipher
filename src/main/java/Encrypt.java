public class Encrypt {
    private String mOriginalMessage;
    private int mKey;
    private char[] mOrignalCharArray;
    private String malphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Encrypt(String mOriginalMessage,int mKey) {
        this.mOriginalMessage = mOriginalMessage.toUpperCase();
        this.mKey=mKey;
        mOrignalCharArray=mOriginalMessage.toCharArray();
        mEncryptMessage(mOrignalCharArray);


    }

    private String mEncryptMessage(char[] mOrignalCharArray){

        for(char i:mOrignalCharArray){

        }

    }


}
