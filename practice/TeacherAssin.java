package practice;

class Student{
    String name;
    int roll;
    double marks;
    // marks check
    void checkPass(){
        if(marks<40){
  System.out.println("Fail");
        }
        else{
            System.out.println("Pass");
        }
    }
}
class TeacherAssignmarks{
    String teacherName="";

    TeacherAssignmarks(String name){
        teacherName=name;
    }

    void setMarks(String name,int roll,double marks){
        Student obj=new Student();
        obj.marks=marks;
        obj.roll=roll;
        obj.name=name;
        obj.checkPass();
    }
   

}
public class TeacherAssin {
    public static void main(String[] args) {
        // Student satyam=new Student();
        TeacherAssignmarks sir=new TeacherAssignmarks("Rajjev");
        sir.setMarks("satyam",1,45);
        sir.setMarks("satyam2",2,16);
        sir.setMarks("satyam3",3,91);
        sir.setMarks("satyam4",4,85);
        sir.setMarks("satyam5",5,37);



        // sir.setMarks(25);
        // System.out.println(satyam.marks);
        
    }
       
}
