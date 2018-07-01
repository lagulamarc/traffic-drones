package com.marc.exam.entities;

import java.util.List;

public class Drone {

	private String id;
	private float latitude;
	private float longitude;
	private List<Route> routes;
	private final int speed = 20; // constant speed

	public Drone() {
	}

	public Drone(String id) {
		this.id = id;
	}

	public Drone(String id, List<Route> routes) {
		this.id = id;
		this.routes = routes;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public List<Route> getRoutes() {
		return routes;
	}

	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}

	public int getSpeed() {
		return speed;
	}
}
