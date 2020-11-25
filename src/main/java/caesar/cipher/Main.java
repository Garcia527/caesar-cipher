package caesar.cipher;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter the phrase to be ciphered: ");  
		String message= sc.nextLine();              //reads string   
		  
		System.out.print("Enter offset number: ");  
		int offset= sc.nextInt();              //reads string   
		
		CaesarCipher caesarCipher = new CaesarCipher();
		String cipheredMessage = caesarCipher.cipher(message, offset);
		
		System.out.println("\nOriginal message: " + message);
		System.out.println("Offset: " + offset);
		System.out.println("Ciphered message: " + cipheredMessage);
	}

}
