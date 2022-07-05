package com.sample.sampledata;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class University {
	@Id
	private Integer id;
	private String name;
	private Integer TotalNoOfColleges;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTotalNoOfColleges() {
		return TotalNoOfColleges;
	}
	public void setTotalNoOfColleges(Integer totalNoOfColleges) {
		TotalNoOfColleges = totalNoOfColleges;
	}
	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", TotalNoOfColleges=" + TotalNoOfColleges + "]";
	}
	public University(Integer id, String name, Integer totalNoOfColleges) {
		super();
		this.id = id;
		this.name = name;
		TotalNoOfColleges = totalNoOfColleges;
	}
	University(){
		
	}
}
