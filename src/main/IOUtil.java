package main;

import java.util.Scanner;
/*
 * responsibilities
 * - IO operations
 * */
public class IOUtil {
	private static Scanner scanner = new Scanner(System.in);

	static void print(String s) {
		System.out.print(s);
	}

	static void println(String s) {
		System.out.println(s);
	}

	static int readInt() {
		return scanner.nextInt();
	}

	public static String read() {
		return scanner.next();
	}
}
