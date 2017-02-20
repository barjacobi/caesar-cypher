package queue;

import java.util.Scanner;

public class Caesar_Cypher {
	public static String encrypter(String message) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How long is your key?");
		int length = scan.nextInt();
		Queue<Integer> q = new Queue<Integer>();
		System.out.println("Please enter your key. Press Enter after each number.");
		for (int j = 0; j <= length; j++)
			q.enqueue(scan.nextInt());
		scan.close();
		String encoded = "";
		for (int i = 0; i < message.length(); i++) {
			int keyValue = q.dequeue();
			encoded += (char) (message.charAt(i) + keyValue);
			q.enqueue(keyValue);
		}
		return ("Your encoded message is: " + encoded);
	}

	public static String decrypter(String message) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How long is your key?");
		int length = scan.nextInt();
		Queue<Integer> q = new Queue<Integer>();
		System.out.println("Please enter your key. Press Enter after each number.");
		for (int j = 0; j <= length; j++)
			q.enqueue(scan.nextInt());
		scan.close();
		String decrypted = "";
		for (int i = 0; i < message.length(); i++) {
			int keyValue = q.dequeue();
			decrypted += (char) (message.charAt(i) - keyValue);
			q.enqueue(keyValue);
		}
		return ("Your decrypted message is: " + decrypted);
	}

}
