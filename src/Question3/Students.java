package Question3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Students {
	
	private int RollNo;
	private String Name;
	private int marks;
	
	public static void main(String[] args) {
		
		List<Students> studentsList = new ArrayList<>();
		
		studentsList.add(new Students(1, "Jai", 450));
		studentsList.add(new Students(2, "Shreya", 150));
		studentsList.add(new Students(3, "Shaswati", 350));
		studentsList.add(new Students(4, "Fiona", 200));
		
		// Using java stream and lambda function sort them according to their RollNo. 
		System.out.println("Printing RollNo in Sorted Order: ");
		System.out.println();
		
		Collections.sort(studentsList, (student1, student2) -> student1.getRollNo() > student2.getRollNo() 
				? +1 : -1);
		
		System.out.println(studentsList);
		
		// And filter out the students getting marks below 250 out of 500. And display them.
		System.out.println("Filtering out the students getting marks below 250 out of 500: ");
		studentsList.stream() 
			.filter(s -> s.getMarks() < 250)
			.forEach(s -> System.out.println(s.toString()));
		}
	
	
	
	@Override
	public String toString() {
		return "Students [RollNo=" + RollNo + ", Name=" + Name + ", marks=" + marks + "]" + "\n";
	}

	public Students(int rollNo, String name, int marks) {
		super();
		RollNo = rollNo;
		Name = name;
		this.marks = marks;
	}

	public int getRollNo() {
		return RollNo;
	}




	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}




	public String getName() {
		return Name;
	}




	public void setName(String name) {
		Name = name;
	}




	public int getMarks() {
		return marks;
	}




	public void setMarks(int marks) {
		this.marks = marks;
	}



}



/* 
 Create a Bean class of students with attributes RollNo, Name, marks (maximum marks 500 )

In the main runner class make the list of students add student to it

Using java stream and lambda function sort them according to their RollNo. And filter out the students
getting marks below 250 out of 500. And display them.

/*
	Sample list of students:
		Student [RollNo=12, marks=495, name=Name1]
		Student [RollNo=13, marks=230, name=Name2]
		Student [RollNo=10, marks=210, name=Name5]
		Student [RollNo=6, marks=400, name=Name3]
		Student [RollNo=2, marks=352, name=Name4]
		Sample OutPut:
		Student [RollNo=10, marks=210, name=Name5]
		Student [RollNo=13, marks=230, name=Name2] 
	*/


 
 