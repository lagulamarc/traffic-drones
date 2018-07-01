package com.marc.exam.entities;

public class Report {

	private Drone drone;
	private TrafficCondition trafficCondition;

	public Report() {
	}

	public Report(Drone drone) {
		this.drone = drone;
		this.trafficCondition = TrafficCondition.getTrafficCondition();
	}

	public Drone getDrone() {
		return drone;
	}

	public void setDrone(Drone drone) {
		this.drone = drone;
	}

	public TrafficCondition getTrafficCondition() {
		return trafficCondition;
	}

	public void setTrafficCondition(TrafficCondition trafficCondition) {
		this.trafficCondition = trafficCondition;
	}
}
