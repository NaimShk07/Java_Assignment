package model;

public class Driver {
	private int did,age;
	private long number;
	private String name,address,email,password,vname;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	@Override
	public String toString() {
		return "Driver [did=" + did + ", age=" + age + ", number=" + number + ", name=" + name + ", address=" + address
				+ ", email=" + email + ", password=" + password + ", vname=" + vname + "]";
	}
	
	
	
	
}
