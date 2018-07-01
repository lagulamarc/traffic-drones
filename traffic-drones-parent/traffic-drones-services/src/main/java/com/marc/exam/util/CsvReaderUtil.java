package com.marc.exam.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CsvReaderUtil {

	public static final String DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
	private static final String CSV_EXTENSION = ".csv";
	private static final String FILE_NOT_FOUND_MESSAGE = "File is not found on resources folder. Please make sure file is in \"\\resources\" folder";

	public static List<String[]> convertCsvToList(String droneId) {
		List<String[]> properties = new ArrayList<>();

		String fileName = getFileName(droneId);

		URI fileURL = null;
		try {
			fileURL = CsvReaderUtil.class.getClassLoader().getResource(fileName).toURI();
		} catch (URISyntaxException e) {
			System.out.println(FILE_NOT_FOUND_MESSAGE);
			e.printStackTrace();
		}
		Path pathToFile = Paths.get(fileURL);

		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
			String line = br.readLine();
			while (line != null) {
				String[] attributes = line.split(",");
				properties.add(attributes);
				line = br.readLine();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return properties;
	}

	private static String getFileName(String droneId) {
		return droneId.concat(CSV_EXTENSION);
	}
}
