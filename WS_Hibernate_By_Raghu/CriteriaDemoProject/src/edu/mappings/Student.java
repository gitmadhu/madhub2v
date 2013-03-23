package edu.mappings;

public class Student implements java.io.Serializable {

	private String studentNo;
	private String studentName;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** full constructor */
	public Student(String studentNo, String studentName) {
		this.studentNo = studentNo;
		this.studentName = studentName;
	}

	// Property accessors

	public String getStudentNo() {
		return this.studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}