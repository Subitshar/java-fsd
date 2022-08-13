package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "staff_id", nullable = false)
	private String staffId;
	
	@Column
	private String name;
	
	@Column
	private Integer salary;
	
	@OneToMany(mappedBy = "guide", cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	private Set<Student> students= new HashSet<>();
	
	@OneToMany(mappedBy = "guide", cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	private Set<Classroom> classrooms = new HashSet<>();
	
	@OneToMany(mappedBy = "guide", cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	private Set<Subject> subjects = new HashSet<>();
	
	public Teacher() {
		
	}
	
	
	
	public Teacher(String staffId, String name, Integer salary) {
		super();
		this.staffId = staffId;
		this.name = name;
		this.salary = salary;
		
	}


	public Set<Classroom> getClassrooms() {
		return classrooms;
	}


	public void setClassrooms(Set<Classroom> classrooms) {
		this.classrooms = classrooms;
	}


	public Set<Subject> getSubjects() {
		return subjects;
	}


	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", staffId=" + staffId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	

}
