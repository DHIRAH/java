package sonataAssignment;

public class Student {
	private int Id;
	private String name;
	private int marks;
public Student(int Id,String name,int marks) {
	this.Id=Id;
	this.name=name;
	this.marks=marks;
	}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [Id=" + Id + ", name=" + name + ", marks=" + marks + "]";
}
}
