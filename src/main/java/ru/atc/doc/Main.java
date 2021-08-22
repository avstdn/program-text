package ru.atc.doc;

public class Main {

	public static void main(String[] args) {
		if (arePresent(args)) {
			ProgramText programText = new ProgramText();
			programText.generate(args[0]);
		}
	}

	private static boolean arePresent(String[] args) {
		if (args.length < 1) {
			System.out.println("Path to project source code folder not specified in command line args");
			return false;
		}
		return true;
	}
}
