package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.RailwayDao;
import com.app.entities.Railway;

@Service
@Transactional
public class RailwayServiceImpl implements RailwayService {
	@Autowired
	private RailwayDao railwayDao;

	@Override
	public Railway addNewRailway(Railway newRailway) {
		System.out.println("2");
		return railwayDao.save(newRailway);
	}

	@Override
	public List<Railway> getAllRailways() {
		System.out.println("4");
		return railwayDao.findAll();
	}

	@Override
	public String deleteRailwayDetails(Long railwayId) {
		if (railwayDao.existsById(railwayId)) {
			railwayDao.deleteById(railwayId);
			return "Railway Details Deleted";
		}
		return "Invalid RailwayId";
	}

	@Override
	public Railway getRailwayDetails(Long railwayId) {

		return railwayDao.findById(railwayId).orElseThrow();
	}

	@Override
	public Railway updateRailwayDetails(Railway railway) {
		return railwayDao.save(railway);
	}
}
