package com.marc.exam.service.drone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.marc.exam.entities.Drone;
import com.marc.exam.entities.Route;
import com.marc.exam.util.CsvReaderUtil;

public class DroneService {

	public void initializeDrone(String droneId) {
		Drone drone = new Drone(droneId);
		drone.setRoutes(getDroneRoutes(drone.getId()));
	}

	private List<Route> getDroneRoutes(String droneId) {
		List<Route> routes = new ArrayList<>();

		// Array format: id , latitude , longitude , time
		List<String[]> csvProperties = CsvReaderUtil.convertCsvToList(droneId);
		for (String[] routeProperty : csvProperties) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(CsvReaderUtil.DATETIME_PATTERN);
			Route route = new Route(Float.parseFloat(routeProperty[1]), Float.parseFloat(routeProperty[2]),
					LocalDateTime.parse(routeProperty[3], formatter));
			routes.add(route);
		}
		return routes;
	}
}
