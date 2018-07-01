package com.marc.exam.service.tube;

import java.util.ArrayList;
import java.util.List;

import com.marc.exam.entities.Tube;
import com.marc.exam.util.CsvReaderUtil;

public class TubeService {

	private static final String TUBE_FILENAME = "tube";

	public List<Tube> getTubeStations() {
		List<Tube> tubes = new ArrayList<>();

		// Array format: name , latitude , longitude
		List<String[]> csvProperties = CsvReaderUtil.convertCsvToList(TUBE_FILENAME);
		for (String[] tubeProperty : csvProperties) {
			Tube tube = new Tube(tubeProperty[0], Float.parseFloat(tubeProperty[1]), Float.parseFloat(tubeProperty[2]));
			tubes.add(tube);
		}
		return tubes;
	}
}
