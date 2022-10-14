package kodlamaioDemo.entities;

public class Course {
	private int id;
	private String courseName;
	private String description;
	private String instructor;
	private double price;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(int id, String courseName, String description, String instructor, double price) {
		this.id = id;
		this.courseName = courseName;
		this.description = description;
		this.instructor = instructor;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
