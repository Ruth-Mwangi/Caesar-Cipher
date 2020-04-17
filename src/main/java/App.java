import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        boolean programRunning=true;
        while (programRunning){

            System.out.println("Welcome to the Caesar Cipher");
            System.out.println("Do you want to Encrypt or Decrypt or Exit");
            String navigate =scan.next();
            scan.nextLine();

            if(navigate.equals("Encrypt")){
                System.out.println("___________________________________");
                System.out.println("Welcome to Caesar cipher Encrypt");
                System.out.println("Enter message to encrypt");
                String msgEncrypt=scan.nextLine();
                System.out.println("Enter encryption key between 1 and 25");
                int encryptKey=scan.nextInt();
                if(encryptKey>=1 && encryptKey<=25){
                    CeaserCipher caesar=new CeaserCipher(msgEncrypt,encryptKey);
                    Encrypt encrypt=new Encrypt();
                    encrypt.Encrypt(caesar.getmMessage(),caesar.getmKey());
                    Decrypt decrypt=new Decrypt();
                    decrypt.Decrypt(encrypt.getmEncryptedMessage(),caesar.getmKey());

                    System.out.println("----------------------");
                    System.out.println("Input Message : "+caesar.getmMessage());
                    System.out.println("Encrypted Message : "+encrypt.getmEncryptedMessage());
                    System.out.println("Decrypted Message : "+decrypt.getmDecryptedMessage());
                    System.out.println("---------------------------");

                }
                else {
                    System.out.println("key must be between 1 and 25");
                }

            }
            else if(navigate.equals("Decrypt")){
                System.out.println("___________________________________");
                System.out.println("Welcome to Caesar cipher Decrypt");
                System.out.println("Enter message to Decrypt");
                String msgDecrypt=scan.nextLine();
                System.out.println("Enter Decryption key between 1 and 25");
                int decryptKey=scan.nextInt();
                if(decryptKey>=1 && decryptKey<=25){
                    CeaserCipher caesar=new CeaserCipher(msgDecrypt,decryptKey);
                    Decrypt decrypt=new Decrypt();
                    decrypt.Decrypt(caesar.getmMessage(),caesar.getmKey());
                    Encrypt encrypt=new Encrypt();
                    encrypt.Encrypt(decrypt.getmDecryptedMessage(),caesar.getmKey());
                    System.out.println("----------------------");
                    System.out.println("Input Message : "+caesar.getmMessage());
                    System.out.println("Decrypted Message : "+decrypt.getmDecryptedMessage());
                    System.out.println("Encrypted Message : "+encrypt.getmEncryptedMessage());
                    System.out.println("--------------------------");
                }
                else {
                    System.out.println("key must be between 1 and 25");
                }

            }
            else if(navigate.equals("Exit")){
                programRunning=false;
            }
            else {
                System.out.println("No option like that");
            }
        }

    }
}
