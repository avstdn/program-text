package ru.atc.doc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class ProgramText {

	private static final String OUTPUT_FILE_EXTENSION = ".txt";

	public void generate(String sourceFolderPath, String extensions, String ignoreFolders, String outputFileName) {
		try {
			PrintWriter printWriter = new PrintWriter(outputFileName + OUTPUT_FILE_EXTENSION);
			writeOutputFile(sourceFolderPath, printWriter, extensions, ignoreFolders);
			printWriter.flush();
			System.out.println("SUCCESS: " + outputFileName);
		} catch (IOException e) {
			System.out.println("ERROR: " + outputFileName);
			e.printStackTrace();
		}
	}

	private void writeOutputFile(String sourceFolderPath, PrintWriter printWriter, String extensions, String ignoreFolders) throws IOException {
		File rootFolder = new File(sourceFolderPath);
		String[] fileNames = rootFolder.list();
		String[] ignoreFoldersArray = ignoreFolders.split(",");

		if (fileNames != null && fileNames.length > 0) {
			String[] files = getFiles(rootFolder, extensions);

			if (files != null && files.length > 0) {
				// Возможно понадобится дописывать название пакета
//				writePackageName(printWriter, rootFolder, files[0], startPackage);
				writeFiles(printWriter, rootFolder, files);
			}

			for (String fileName : fileNames) {
				File f = new File(rootFolder, fileName);

				if (f.isDirectory()) {
					// Логи не стал убирать. Можно раскомментировать, если появятся ошибки
					if (Arrays.stream(ignoreFoldersArray).noneMatch(f.getAbsolutePath()::equalsIgnoreCase)) {
//						System.out.println("+ Reading directory: " + f.getName());
						writeOutputFile(f.getAbsolutePath(), printWriter, extensions, ignoreFolders);
					} else {
//						System.out.println("- Ignore directory: " + f.getName());
					}
				}
			}
		}
	}

	private void writeFiles(PrintWriter printWriter, File rootFolder, String[] javaFiles) throws IOException {
		for (String fileName : javaFiles) {
			// Логи не стал убирать. Можно раскомментировать, если появятся ошибки
//			System.out.println("Reading file: " + fileName);
			File f = new File(rootFolder, fileName);
			BufferedReader br = new BufferedReader(new FileReader(f));
			printWriter.println("Файл " + fileName);
			printWriter.println();
			String line = br.readLine();

			while (line != null) {
				printWriter.println(line);
				line = br.readLine();
			}

			printWriter.println();
		}
	}

	private String[] getFiles(File rootFolder, String extensionString) {
		String[] extensions = extensionString.split(",");
		FilenameFilter filteredExtensions = (f, name) -> Arrays.stream(extensions).anyMatch(name::endsWith);
		return rootFolder.list(filteredExtensions);
	}

//	private void writePackageName(PrintWriter pw, File rootFolder, String javaFile, String startPackage) {
//		String pathString = new File(rootFolder, javaFile).getPath();
//		String fileSeparator = Pattern.quote(System.getProperty("file.separator"));
//		String[] splitPath = pathString.split(fileSeparator);
//		int startPackageWordIndex = Arrays.asList(splitPath).indexOf(startPackage);
//		List<String> list = new ArrayList<>();
//
//		for (int i = startPackageWordIndex; i < splitPath.length - 1; i++) {
//			list.add(splitPath[i]);
//		}
//
//		String packageString = String.join(".", list);
//		pw.println("Пакет " + packageString);
//		pw.println();
//	}
}
