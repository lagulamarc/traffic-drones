package com.marc.exam.entities;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum TrafficCondition {

	LIGHT, MODERATE, HEAVY;

	private static final List<TrafficCondition> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	public static TrafficCondition getTrafficCondition() {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}
}
