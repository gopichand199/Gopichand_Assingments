package com.casestudy.TrainSearch.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "trains")
public class Trains {

	@Id
	private String id;
	private String trainNumber;
	private String trainName;
	private String destination;
	private String source;
	private String departuretime;
	private String arrivaltime;
	private List<String> runs;
	private String sleeperseatsavailable;
	private String sleeper;
	private String ac3tierseatsavailable;
	private String ac3tier;
	private String ac2tierseatsavailable;
	private String ac2tier;
	private String acfirstclassseatsavailable;
	private String acfirstclass;
	
	
	@Override
	public String toString() {
		return "Trains [id=" + id + ", trainNumber=" + trainNumber + ", trainName=" + trainName + ", destination="
				+ destination + ", source=" + source + ", departuretime=" + departuretime + ", arrivaltime="
				+ arrivaltime + ", runs=" + runs + ", sleeperseatsavailable=" + sleeperseatsavailable + ", sleeper="
				+ sleeper + ", ac3tierseatsavailable=" + ac3tierseatsavailable + ", ac3tier=" + ac3tier
				+ ", ac2tierseatsavailable=" + ac2tierseatsavailable + ", ac2tier=" + ac2tier
				+ ", acfirstclassseatsavailable=" + acfirstclassseatsavailable + ", acfirstclass=" + acfirstclass + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDeparturetime() {
		return departuretime;
	}

	public void setDeparturetime(String departuretime) {
		this.departuretime = departuretime;
	}

	public String getArrivaltime() {
		return arrivaltime;
	}

	public void setArrivaltime(String arrivaltime) {
		this.arrivaltime = arrivaltime;
	}

	public List<String> getRuns() {
		return runs;
	}

	public void setRuns(List<String> runs) {
		this.runs = runs;
	}

	public String getSleeperseatsavailable() {
		return sleeperseatsavailable;
	}

	public void setSleeperseatsavailable(String sleeperseatsavailable) {
		this.sleeperseatsavailable = sleeperseatsavailable;
	}

	public String getSleeper() {
		return sleeper;
	}

	public void setSleeper(String sleeper) {
		this.sleeper = sleeper;
	}

	public String getAc3tierseatsavailable() {
		return ac3tierseatsavailable;
	}

	public void setAc3tierseatsavailable(String ac3tierseatsavailable) {
		this.ac3tierseatsavailable = ac3tierseatsavailable;
	}

	public String getAc3tier() {
		return ac3tier;
	}

	public void setAc3tier(String ac3tier) {
		this.ac3tier = ac3tier;
	}

	public String getAc2tierseatsavailable() {
		return ac2tierseatsavailable;
	}

	public void setAc2tierseatsavailable(String ac2tierseatsavailable) {
		this.ac2tierseatsavailable = ac2tierseatsavailable;
	}

	public String getAc2tier() {
		return ac2tier;
	}

	public void setAc2tier(String ac2tier) {
		this.ac2tier = ac2tier;
	}

	public String getAcfirstclassseatsavailable() {
		return acfirstclassseatsavailable;
	}

	public void setAcfirstclassseatsavailable(String acfirstclassseatsavailable) {
		this.acfirstclassseatsavailable = acfirstclassseatsavailable;
	}

	public String getAcfirstclass() {
		return acfirstclass;
	}

	public void setAcfirstclass(String acfirstclass) {
		this.acfirstclass = acfirstclass;
	}

	public void addRun(String run) {
		this.runs.add(run);
	}

	public void removeRun(String run) {
		this.runs.remove(run);
	}
}