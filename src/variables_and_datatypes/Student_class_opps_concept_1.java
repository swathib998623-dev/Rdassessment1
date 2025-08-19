package variables_and_datatypes;

public class Student {

        String name="swathi";
        int rollno;
        int marks;
        public Student(String name,int rollno,int marks){
            this.name=name;
            this.marks=marks;
            this.rollno=rollno;

    }
    public void display_Studentdetails(){
        System.out.println("Enter The Student Name:"+name);
        System.out.println("Enter The Student RollNo:"+rollno);
        System.out.println("Enter The Student Marks:"+marks);
    }

    public static void main(String[] args) {
        Student s1= new Student("swathi",101,100);
        Student s2=new Student("jaya",102,100);
        s1.display_Studentdetails();
        s2.display_Studentdetails();
    }
}
