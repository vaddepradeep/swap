package com.example.demo.dao;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="flights")
public class FlightsDao {
	@Override
	public String toString() {
		return "FlightsDao [flightid=" + flightid + ", flightname=" + flightname + ", sorce=" + sorce + ", destination="
				+ destination + ", Doj=" + Doj + ", getFlightid()=" + getFlightid() + ", getFlightname()="
				+ getFlightname() + ", getSorce()=" + getSorce() + ", getDestination()=" + getDestination()
				+ ", getDoj()=" + getDoj() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	@Id
	private long flightid;
	private String flightname;
	private String sorce;
	private String destination;
	private  Date Doj;
	public long getFlightid() {
		return flightid;
	}
	public void setFlightid(long flightid) {
		this.flightid = flightid;
	}
	public String getFlightname() {
		return flightname;
	}
	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}
	public String getSorce() {
		return sorce;
	}
	public void setSorce(String sorce) {
		this.sorce = sorce;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getDoj() {
		return Doj;
	}
	public void setDoj(Date doj) {
		Doj = doj;
	}

}
