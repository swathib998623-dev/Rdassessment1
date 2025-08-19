package variables_and_datatypes;

public class Student_public_class_opps_concepts_2 {
    public String name;
    public Student_public_class_opps_concepts_2(String name){
        this.name=name;
    }
    public void dispaly(){
        System.out.println("name:"+name);
    }

    public static void main(String[] args) {
        Student_public_class_opps_concepts_2 s=new Student_public_class_opps_concepts_2("swathi");

s.dispaly();
    }
}
