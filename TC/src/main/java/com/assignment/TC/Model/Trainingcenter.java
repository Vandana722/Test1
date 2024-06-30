package com.assignment.TC.Model;

import java.time.Instant;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@Entity
public class Trainingcenter {

	@Id
	@NotEmpty(message = "centercode can't be null ")
	@Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "exactly 12 character alphanumeric")
	@Length(min = 1, max = 12, message = "exactly 12 character alphanumeric")
	private String centercode;

	@NotEmpty(message = "centername can't be null ")
	@Length(max = 40, message = "please enter less than 40 characters")
	private String centername;

	@NotEmpty(message = "student capacity can't be null ")
	@Pattern(regexp = "\\d+", message = "Input must contain only numbers")
	private String student_capacity;

	@NotEmpty(message = "email can't be null ")
	@Pattern(regexp = "^([a-zA-Z0-9._-]+@[a-zA-Z.-]+[.][a-zA-Z]{2,3})$", message = "Please enter a valid Email")
	private String email;

	@NotEmpty(message = "mobileno can't be null ")
	@Pattern(regexp = "^[6789][0-9]{9}$", message = "Please enter a valid mobile number")
	private String mobileno;

	@NotEmpty(message = "courses can't be null")
	@ElementCollection
	private List<String> courses;

	private Instant createdon;

	@Valid
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address")
	private Address address;

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses1) {
		this.courses = courses1;
	}

	public Instant getCreatedon() {
		return createdon;
	}

	public void setCreatedon(Instant instant) {
		this.createdon = instant;
	}

	public String getcentercode() {
		return centercode;
	}

	public void setcentercode(String centerCode) {
		centercode = centerCode;
	}

	public String getcentername() {
		return centername;
	}

	public void setcentername(String centerName) {
		centername = centerName;
	}

	public String getstudent_capacity() {
		return student_capacity;
	}

	public void setstudent_capacity(String student_Capacity) {
		student_capacity = student_Capacity;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email1) {
		email = email1;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String Mobileno) {
		mobileno = Mobileno;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Trainingcenter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trainingcenter(
			@NotEmpty(message = "centercode can't be null ") @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "exactly 12 character alphanumeric") @Length(min = 1, max = 12, message = "exactly 12 character alphanumeric") String centercode,
			@NotEmpty(message = "centername can't be null ") @Length(max = 40, message = "please enter less than 40 characters") String centername,
			@NotEmpty(message = "student capacity can't be null ") @Pattern(regexp = "\\d+", message = "Input must contain only numbers") String student_capacity,
			@NotEmpty(message = "email can't be null ") @Pattern(regexp = "^([a-zA-Z0-9._-]+@[a-zA-Z.-]+[.][a-zA-Z]{2,3})$", message = "Please enter a valid Email") String email,
			@NotEmpty(message = "mobileno can't be null ") @Pattern(regexp = "^[6789][0-9]{9}$", message = "Please enter a valid mobile number") String mobileno,
			@NotEmpty(message = "courses can't be null") List<String> courses, Instant createdon,
			@Valid Address address) {
		super();
		this.centercode = centercode;
		this.centername = centername;
		this.student_capacity = student_capacity;
		this.email = email;
		this.mobileno = mobileno;
		this.courses = courses;
		this.createdon = createdon;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Trainingcenter [centercode=" + centercode + ", centername=" + centername + ", student_capacity="
				+ student_capacity + ", email=" + email + ", mobileno=" + mobileno + ", courses=" + courses
				+ ", instant=" + createdon + ", address=" + address + "]";
	}
}
