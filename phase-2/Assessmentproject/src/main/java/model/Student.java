package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="registration_id", nullable = false)
	private String registrationId;
	
	private String name;
	
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="class_id")
	private Classroom classname;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="guid_id")
	private Teacher guid;
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Classroom getClassname() {
		return classname;
	}

	public void setClassname(Classroom classname) {
		this.classname = classname;
	}

	public Student() {}

	public Student(String registrationId, String name,Classroom classname, Teacher guid ) {
		this.registrationId = registrationId;
		this.name = name;
		this.classname=classname;
		this.guid=guid;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", registrationId=" + registrationId + ", name=" + name + ", classname="
				+ classname + ", guid=" + guid + "]";
	}
	
	
}
