/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptext;

import java.util.Scanner;

/**
 *
 * @author abbythomas
 */
public class Encryptext {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the Secret Key: ");
        final String secretKey = kb.next();
        System.out.println("Enter the text to be Encrypted: ");
        String originalString = "Hello Len!";
        String encryptedString = AES.encrypt(originalString, secretKey) ;
        String decryptedString = AES.decrypt(encryptedString, secretKey) ;
     
        System.out.println(originalString);
        System.out.println(encryptedString);
        System.out.println(decryptedString);
    }
    
}