package com.example.Itemcatalogservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Item {

	
   public Item() {
	   
   }
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String fName;
	@Column
	private String gender;
	@Column
	private String email;
	@Column
	private long dateOfBith;
	@Column
	private String flag;
	@Column
	private String password;
	
	
	public Item(Long id, String fName, String gender, String email, long dateOfBith, String flag,String password) {
		super();
		this.id = id;
		this.fName = fName;
		this.gender = gender;
		this.email = email;
		this.dateOfBith = dateOfBith;
		this.flag = flag;
		this.password=password;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Object getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public Object getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getDateOfBith() {
		return dateOfBith;
	}
	public void setDateOfBith(long dateOfBith) {
		this.dateOfBith = dateOfBith;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
