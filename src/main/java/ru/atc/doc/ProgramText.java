package ru.atc.doc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProgramText {

	public void generate(String sourceFolderPath) {
		try {
			PrintWriter printWriter = new PrintWriter(getOutputFileName());
			writeOutputFile(sourceFolderPath, printWriter);
			printWriter.flush();
			log.info("SUCCESS");
		} catch (IOException e) {
			log.error("ERROR");
			e.printStackTrace();
		}
	}

	private String getOutputFileName() {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		return String.format("output-%s.txt", LocalDateTime.now().format(dateTimeFormatter));
	}

	private void writeOutputFile(String sourceFolderPath, PrintWriter printWriter) throws IOException {
		File rootFolder = new File(sourceFolderPath);
		String[] fileNames = rootFolder.list();

		if (fileNames != null && fileNames.length > 0) {
			String[] javaFiles = getJavaFiles(rootFolder);

			if (javaFiles != null && javaFiles.length > 0) {
				writePackageName(printWriter, rootFolder, javaFiles[0]);
				writeJavaFiles(printWriter, rootFolder, javaFiles);
			}

			for (String fileName : fileNames) {
				log.info("Reading directory " + fileName);
				File f = new File(rootFolder, fileName);

				if (f.isDirectory()) {
					writeOutputFile(f.getAbsolutePath(), printWriter);
				}
			}
		}
	}

	private void writeJavaFiles(PrintWriter printWriter, File rootFolder, String[] javaFiles) throws IOException {
		for (String fileName : javaFiles) {
			log.info("Reading file: " + fileName);
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

	private String[] getJavaFiles(File rootFolder) {
		FilenameFilter javaExtension = (f, name) -> name.endsWith(".java");
		return rootFolder.list(javaExtension);
	}

	private void writePackageName(PrintWriter pw, File rootFolder, String javaFile) {
		String pathString = new File(rootFolder, javaFile).getPath();
		String[] splitPath = pathString.split("/");
		int startIndex = Arrays.asList(splitPath).indexOf("ru");
		List<String> list = new ArrayList<>();

		for (int i = startIndex; i < splitPath.length - 1; i++) {
			list.add(splitPath[i]);
		}

		String packageString = String.join(".", list);
		pw.println("Пакет " + packageString);
		pw.println();
	}
}
