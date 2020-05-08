package net.codejava.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "records")
public class Record {

	@Id
	@Column(name = "s_id", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "firstName")
	private String firstname;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "streetAddress")
	private String streetAddress;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "zip")
	private String zip;
	@Column(name = "phone")
	private String phone;
	@Column(name = "email")
	private String email;
	@Column(name = "dateOfSurvey")
	private String dateOfSurvey;
	@Column(name = "likedAboutCampus")
	private String likedAboutCampus;
	@Column(name = "originOfInterest")
	private String originOfInterest;
	@Column(name = "likelyhoodOfRecommendation")
	private String likelyhoodOfRecommendation;
	@Column(name = "raffle")
	private String raffle;
	@Column(name = "comments")
	private String comments;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
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

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateOfSurvey() {
		return dateOfSurvey;
	}

	public void setDateOfSurvey(String dateOfSurvey) {
		this.dateOfSurvey = dateOfSurvey;
	}

	public String getLikedAboutCampus() {
		return likedAboutCampus;
	}

	public void setLikedAboutCampus(String likedAboutCampus) {
		this.likedAboutCampus = likedAboutCampus;
	}

	public String getOriginOfInterest() {
		return originOfInterest;
	}

	public void setOriginOfInterest(String originOfInterest) {
		this.originOfInterest = originOfInterest;
	}

	public String getLikelyhoodOfRecommendation() {
		return likelyhoodOfRecommendation;
	}

	public void setLikelyhoodOfRecommendation(String likelyhoodOfRecommendation) {
		this.likelyhoodOfRecommendation = likelyhoodOfRecommendation;
	}

	public String getRaffle() {
		return raffle;
	}

	public void setRaffle(String raffle) {
		this.raffle = raffle;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	public String toString() {
		return firstname+lastname+streetAddress+city+state+zip+phone+email+dateOfSurvey+likedAboutCampus+originOfInterest+likelyhoodOfRecommendation+raffle+comments;
	}

}
