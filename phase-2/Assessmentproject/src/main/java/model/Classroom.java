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
import javax.persistence.OneToOne;

@Entity
public class Classroom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name= "Class_name")
	private String name;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="subject_id")
	private Subject subject;
	
	@OneToMany(mappedBy = "classname", cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	private Set<Student> students = new HashSet<>();

	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="guid_id")
	private Teacher guid;
	
	

	public Classroom(String name, Subject subject, Teacher guid) {
		super();
		this.name = name;
		this.subject = subject;
		this.guid = guid;
	}
	
	public Classroom() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Teacher getGuid() {
		return guid;
	}

	public void setGuid(Teacher guid) {
		this.guid = guid;
	}

	@Override
	public String toString() {
		return "Classroom [id=" + id + ", name=" + name + ", subject=" + subject + ", students=" + students + ", guid="
				+ guid + "]";
	}
	
	
	
}
