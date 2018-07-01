package com.marc.exam.entities;

import java.time.LocalDateTime;
import java.util.List;

public class Route {

	private float latitude;
	private float longitude;
	private LocalDateTime time;
	private List<Tube> tubeStations;

	public Route() {
	}

	public Route(float latitude, float longitude, LocalDateTime time) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.time = time;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public List<Tube> getTubeStations() {
		return tubeStations;
	}

	public void setTubeStations(List<Tube> tubeStations) {
		this.tubeStations = tubeStations;
	}

	@Override
	public String toString() {
		return "Route: [latitude = " + this.latitude + ", " 
					+ "longitude = " + this.longitude + ", " 
					+ "time = " + this.time + "]";
	}
}
