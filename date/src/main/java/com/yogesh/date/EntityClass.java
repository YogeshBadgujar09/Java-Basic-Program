package com.yogesh.date;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name ="EntityClass")
public class EntityClass {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	public void setId(Long id) {
		this.id = id;
	}
	public void setDate(Date date) {
		this.date = date;
	}
		
	public Long getId() {
		return id;
	}
	public Date getDate() {
		return date;
	}
	
}
