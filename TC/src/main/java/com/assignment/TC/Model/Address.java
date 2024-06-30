package com.assignment.TC.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
public class Address {

	@Id
	@NotEmpty(message = "detailedaddress can't be null")
	private String detailedaddress;

	@NotEmpty(message = "city can't be null")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "Please enter valid city")
	private String city;

	@NotEmpty(message = "State can't be null")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "Please enter valid state")
	private String state;

	@NotEmpty(message = "Pincode can't be null")
	@Pattern(regexp = "^[0-9]{6}$", message = "Please enter the valid input of 6 digits")
	private String pincode;

	public String getDetailedaddress() {
		return detailedaddress;
	}

	public void setDetailedaddress(String detailedaddress) {
		this.detailedaddress = detailedaddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Address(@NotEmpty(message = "detailedaddress can't be null") String detailedaddress,
			@NotEmpty(message = "city can't be null") @Pattern(regexp = "^[a-zA-Z]+$", message = "Please enter valid city") String city,
			@NotEmpty(message = "State can't be null") @Pattern(regexp = "^[a-zA-Z]+$", message = "Please enter valid state") String state,
			@NotEmpty(message = "Pincode can't be null") @Pattern(regexp = "^[0-9]{6}$", message = "Please enter the valid input of 6 digits") String pincode) {
		super();
		this.detailedaddress = detailedaddress;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [detailedaddress=" + detailedaddress + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + "]";
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

}
