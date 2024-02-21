package model;

public class Rides {
	private int rid,did,price,noOfSeat,distKm;
	private int noofseatfill;
	private String rideDate;
	private String departure,exactDeparture,dtime;
	private String arrival,exactArrival,atime;
	
	public int getNoofseatfill() {
		return noofseatfill;
	}
	public void setNoofseatfill(int noofseatfill) {
		this.noofseatfill = noofseatfill;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNoOfSeat() {
		return noOfSeat;
	}
	public void setNoOfSeat(int noOfSeat) {
		this.noOfSeat = noOfSeat;
	}
	public int getDistKm() {
		return distKm;
	}
	public void setDistKm(int distKm) {
		this.distKm = distKm;
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
	public String getExactDeparture() {
		return exactDeparture;
	}
	public void setExactDeparture(String exactDeparture) {
		this.exactDeparture = exactDeparture;
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
	public String getExactArrival() {
		return exactArrival;
	}
	public void setExactArrival(String exactArrival) {
		this.exactArrival = exactArrival;
	}
	public String getAtime() {
		return atime;
	}
	public void setAtime(String atime) {
		this.atime = atime;
	}
	@Override
	public String toString() {
		return "Rides [rid=" + rid + ", did=" + did + ", price=" + price + ", noOfSeat=" + noOfSeat + ", distKm="
				+ distKm + ", noofseatfill=" + noofseatfill + ", rideDate=" + rideDate + ", departure=" + departure
				+ ", exactDeparture=" + exactDeparture + ", dtime=" + dtime + ", arrival=" + arrival + ", exactArrival="
				+ exactArrival + ", atime=" + atime + "]";
	}

	

}
