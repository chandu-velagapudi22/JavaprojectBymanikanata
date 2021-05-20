package com.infotech.in;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Customer {
	private Integer cid;
	private String cname;
	private String cemail;
	private String cAddress;

	private Product product;

	public Customer() {
		super();
		System.out.println("*****************************");
		System.out.println("This is Customer class constructor");
		System.out.println("Why i used super constructor::Why i am calling super()");
		System.out.println("WHY I AM CALLING OBJECT CALLS,,IS OBJECT CLASS METHODS SHOULD ALL BE OVERRIDE");
		System.out.println("*****************************");
	}

	public Customer(Integer cid, String cname, String cemail, String cAddress, Product product2) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cemail = cemail;
		this.cAddress = cAddress;
		this.product = product2;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cemail=" + cemail + ", cAddress=" + cAddress
				+ ", product=" + product + "]";
	}

}
