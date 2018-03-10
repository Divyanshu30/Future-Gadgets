package com.niit.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.engine.profile.Fetch;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class BillingAddress implements Serializable {
@Id
private int billingId;
@NotEmpty
private String addressLine1;
private String addressLine2;
private String addressLine3;
private int pinCode;
@NotEmpty
private String city;
@NotEmpty
private String state;
@NotEmpty
private String country;


public BillingAddress()
{
	
}
/**
 * @return the addressLine1
 */
public String getAddressLine1() {
	return addressLine1;
}
/**
 * @param addressLine1 the addressLine1 to set
 */
public void setAddressLine1(String addressLine1) {
	this.addressLine1 = addressLine1;
}
/**
 * @return the addressLine2
 */
public String getAddressLine2() {
	return addressLine2;
}
/**
 * @param addressLine2 the addressLine2 to set
 */
public void setAddressLine2(String addressLine2) {
	this.addressLine2 = addressLine2;
}
/**
 * @return the addressLine3
 */
public String getAddressLine3() {
	return addressLine3;
}
/**
 * @param addressLine3 the addressLine3 to set
 */
public void setAddressLine3(String addressLine3) {
	this.addressLine3 = addressLine3;
}
/**
 * @return the pinCode
 */
public int getPinCode() {
	return pinCode;
}
/**
 * @param pinCode the pinCode to set
 */
public void setPinCode(int pinCode) {
	this.pinCode = pinCode;
}
/**
 * @return the city
 */
public String getCity() {
	return city;
}
/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}
/**
 * @return the state
 */
public String getState() {
	return state;
}
/**
 * @param state the state to set
 */
public void setState(String state) {
	this.state = state;
}
/**
 * @return the country
 */
public String getCountry() {
	return country;
}
/**
 * @param country the country to set
 */
public void setCountry(String country) {
	this.country = country;
}


}
