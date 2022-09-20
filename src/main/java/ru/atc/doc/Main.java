package ru.atc.doc;

public class Main {

	public static void main(String[] args) {
		if (arePresent(args)) {
			ProgramText programText = new ProgramText();
			programText.generate(args[0], args[1], args[2]);
		}
	}

	private static boolean arePresent(String[] args) {
		if (args.length < 3) {
			System.out.println("Path to project or extensions or ignore folders are not specified in command line args");
			return false;
		}
		return true;
	}
}
