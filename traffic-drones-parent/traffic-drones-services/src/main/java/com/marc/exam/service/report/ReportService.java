package com.marc.exam.service.report;

import com.marc.exam.entities.Drone;
import com.marc.exam.entities.Report;

public class ReportService {

	public Report generateReport(Drone drone) {
		Report report = new Report(drone);
		return report;
	}
}
