package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity

public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="sub_code", nullable=false)
	private String code;
	private String name;
	
	@OneToMany(mappedBy = "subject", cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	private Set<Classroom> classrooms = new HashSet<>();
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="guid_id")
	private Teacher guid;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="student_id")
	private Student student;
	
	public Subject() {
		
	}
	
	public Subject(String code,String name) {
		super();
		this.code = code;
		this.name = name;
	}
	
	public Subject(String code, String name ,Teacher guid,Student student) {
		super();
		this.code = code;
		this.name = name;
		this.guid = guid;
		this.student=student;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Set<Classroom> getClassrooms() {
		return classrooms;
	}
	public void setClassrooms(Set<Classroom> classrooms) {
		this.classrooms = classrooms;
	}
	public Teacher getGuid() {
		return guid;
	}
	public void setGuid(Teacher guid) {
		this.guid = guid;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Subject [id=" + id + ", code=" + code + ", name=" + name + "]";
	}
	
	

}
