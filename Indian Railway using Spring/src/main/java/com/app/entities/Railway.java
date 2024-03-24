package com.app.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "RailwayInSpring")
public class Railway extends BaseEntity{
	@Column(name = "Railway_Name")
	private String railwayName;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private RailwayCategory category;
	
	private LocalDate date;
	
	private String source;
	private String destination;
	
	public Railway() {
		super();
	}

	public Railway(String railwayName, RailwayCategory category, LocalDate date, String source,
			String destination) {
		super();
		this.railwayName = railwayName;
		this.category = category;
		this.date = date;
		this.source = source;
		this.destination = destination;
	}

	public String getRailwayName() {
		return railwayName;
	}

	public void setRailwayName(String railwayName) {
		this.railwayName = railwayName;
	}

	public RailwayCategory getCategory() {
		return category;
	}

	public void setCategory(RailwayCategory category) {
		this.category = category;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Railway [railwayName=" + railwayName + ", category=" + category + ", Date=" + date
				+ ", source=" + source + ", destination=" + destination + "]";
	}
}
