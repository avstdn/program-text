package ru.atc.doc;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

	public static void main(String[] args) {
		if (arePresent(args)) {
			ProgramText programText = new ProgramText();
			programText.generate(args[0]);
		}
	}

	private static boolean arePresent(String[] args) {
		if (args.length < 1) {
			log.error("Path to project source code folder not specified in command line args");
			return false;
		}
		return true;
	}
}
