package model;

public class BookedRides {
	private int brid,rid,did,pid;
	
	private int fhprice,shprice;
	private String pickup;
	private String rideDate;
	private String departure,dtime;
	private String arrival,atime;
	
	public String getPickup() {
		return pickup;
	}
	public void setPickup(String pickup) {
		this.pickup = pickup;
	}
	public int getBrid() {
		return brid;
	}
	public void setBrid(int brid) {
		this.brid = brid;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public int getFhprice() {
		return fhprice;
	}
	public void setFhprice(int fhprice) {
		this.fhprice = fhprice;
	}
	public int getShprice() {
		return shprice;
	}
	public void setShprice(int shprice) {
		this.shprice = shprice;
	}
	public String getRideDate() {
		return rideDate;
	}
	public void setRideDate(String rideDate) {
		this.rideDate = rideDate;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getDtime() {
		return dtime;
	}
	public void setDtime(String dtime) {
		this.dtime = dtime;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getAtime() {
		return atime;
	}
	public void setAtime(String atime) {
		this.atime = atime;
	}
	@Override
	public String toString() {
		return "BookedRides [brid=" + brid + ", rid=" + rid + ", did=" + did + ", pid=" + pid + ", fhprice=" + fhprice
				+ ", shprice=" + shprice + ", pickup=" + pickup + ", rideDate=" + rideDate + ", departure=" + departure
				+ ", dtime=" + dtime + ", arrival=" + arrival + ", atime=" + atime + "]";
	}
	
	
	
	

}

