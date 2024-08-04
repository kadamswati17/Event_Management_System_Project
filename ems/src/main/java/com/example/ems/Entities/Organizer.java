package com.example.ems.Entities;

//import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Organizer {

	@Id
	private int id;
	private String name;
	private String contactInfo;
	
	@OneToMany(mappedBy = "organizer")
//    private Set<Event> events;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	@Override
	public String toString() {
		return "Organizer [id=" + id + ", name=" + name + ", contactInfo=" + contactInfo + "]";
	}

}
