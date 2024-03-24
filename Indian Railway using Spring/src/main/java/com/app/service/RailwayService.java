package com.app.service;

import java.util.List;
import com.app.entities.Railway;

public interface RailwayService {
	Railway addNewRailway(Railway newRailway);

	List<Railway> getAllRailways();

	String deleteRailwayDetails(Long railwayId);

	Railway getRailwayDetails(Long railwayId);

	Railway updateRailwayDetails(Railway railway);
}
