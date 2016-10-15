package _13.jaxb.xml.model;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "customer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {
	@XmlAttribute
	private int id;
	@XmlElement(name = "first-name")
	private String firstName;
	@XmlElement(name = "last-name")
	private String lastName;

	@XmlElement
	private Address address;

	@XmlElement
	private Set<String> mobilePhones;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Set<String> getMobilePhones() {
		return mobilePhones;
	}

	public void setMobilePhones(Set<String> mobilePhones) {
		this.mobilePhones = mobilePhones;
	}

}
