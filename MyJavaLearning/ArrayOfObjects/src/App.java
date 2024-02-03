class Student
{
	String name;
	int rollno;
	int marks;
}
public class App {

	public static void main(String[] args) {
		Student r1 =new Student();
		r1.name = "Ramesh";
		r1.rollno =1;
		r1.marks =98;
		
		Student r2 =new Student();
		r2.name = "Sumesh";
		r2.rollno =2;
		r2.marks =88; 
		
		Student r3 =new Student();
		r3.name = "Harsh";
		r3.rollno =3;
		r3.marks =90;
		
		
		Student students[]= new Student[3];
		students[0]=r1;
		students[1]=r3;
		students[2]=r3;
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].name + ":" + students[i].marks);
			
			
		}

	}

}
