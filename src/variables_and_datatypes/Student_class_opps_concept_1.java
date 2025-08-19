package variables_and_datatypes;

public class Student_class_opps_concept_1 {

        String name="swathi";
        int rollno;
        int marks;
        public Student_class_opps_concept_1(String name, int rollno, int marks){
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
        Student_class_opps_concept_1 s1= new Student_class_opps_concept_1("swathi",101,100);
        Student_class_opps_concept_1 s2=new Student_class_opps_concept_1("jaya",102,100);
        s1.display_Studentdetails();
        s2.display_Studentdetails();
    }
}
