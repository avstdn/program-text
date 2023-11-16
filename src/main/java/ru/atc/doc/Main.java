package ru.atc.doc;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		if (arePresent(args)) {
			ProgramText programText = new ProgramText();
			programText.generate(args[0], args[1], args[2], args[3]);
		}
	}

	private static boolean arePresent(String[] args) {
		if (args.length < 4) {
			System.out.println("Path to project or extensions or ignore folders or output file name are not specified in command line args");
			System.out.println("ERROR: args=" + Arrays.toString(args));
			return false;
		}
		return true;
	}
}
