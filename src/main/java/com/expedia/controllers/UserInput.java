package com.expedia.controllers;

import java.util.ArrayList;

public class UserInput {
	private ArrayList<String> location;
	private ArrayList<String> type;
	private double radius;
	private String database;
	public ArrayList<String> getLocation() {
		return location;
	}
	public void setLocation(ArrayList<String> location) {
		this.location = location;
	}
	public ArrayList<String> getType() {
		return type;
	}
	public void setType( ArrayList<String> type) {
		this.type = type;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getDatabase() {
		return database;
	}
	public void setDatabase(String database) {
		this.database = database;
	}
	
	protected UserInput() {
		
	}
	public UserInput(ArrayList<String> location, ArrayList<String> type, double radius, String database) {
		super();
		this.location = location;
		this.type = type;
		this.radius = radius;
		this.database = database;
	}
	@Override
	public String toString() {
		return String.format("UserSearchResult [location=%s, type=%s, radius=%s, database=%s]", location, type, radius,
				database);
	}
	
	

}
