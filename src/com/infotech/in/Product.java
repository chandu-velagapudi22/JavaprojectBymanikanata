package com.infotech.in;

public class Product {
	private Integer pid;
	private String pname;
	private Double pPrice;
	private Double prating;

//	public Product() {
//		super();
//		System.out.println("*****************************");
//		System.out.println("This is Product class constructor");
//		System.out.println("Why i used super constructor::Why i am calling super()");
//		System.out.println("WHY I AM CALLING OBJECT CALLS,,IS OBJECT CLASS METHODS SHOULD ALL BE OVERRIDE");
//		System.out.println("*****************************");
//	}

	public Product(Integer pid, String pname, Double pPrice, Double prating) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pPrice = pPrice;
		this.prating = prating;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getpPrice() {
		return pPrice;
	}

	public void setpPrice(Double pPrice) {
		this.pPrice = pPrice;
	}

	public Double getPrating() {
		return prating;
	}

	public void setPrating(Double prating) {
		this.prating = prating;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pPrice=" + pPrice + ", prating=" + prating
				+ ", getPid()=" + getPid() + ", getPname()=" + getPname() + ", getpPrice()=" + getpPrice()
				+ ", getPrating()=" + getPrating() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
