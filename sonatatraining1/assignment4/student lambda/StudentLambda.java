package sonataAssignment;

import java.util.Collections;
import java.util.List;

public class StudentLambda {
public List<Student>getStudentinSort(){
	List<Student> marks = new MarksList().getStudent();
	Collections.sort(marks,(o1,o2)->o2.getName().compareTo(o1.getName()));
    System.out.println("Descending order => " + marks);

	return marks;
	}
public static void main(String args[]) {
	StudentLambda s1 =new StudentLambda();
	System.out.println(new StudentLambda().getStudentinSort());
}
}
