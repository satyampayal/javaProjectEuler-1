package practice;

class Emp {
    int age;
    double salery;
    String name, dept;

    public void getName() {
        System.out.println("Name:" + name);

    }

    public void setName(String name) {
        this.name = name;

    }

    public void getAge() {
        System.out.println("Age:" + age);

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getDept() {
        System.out.println("Dept:" + dept);

    }

    public void setDept(String dept) {
        this.dept = dept;

    }

    public void getSallery() {
        System.out.println("Saleery:" + salery);
    }

    public void setSallery(double salery) {
       this.salery=salery;
        
         int age=this.age;
       if(age>35 ){
        if(this.dept=="hr"){
         this.salery=this.salery+ this.salery*0.07;

        }
        else{
            
        this.salery=this.salery+this.salery*0.02;
        }

       }
       else{
        if(age<40 && this.dept=="admin"){
            
        this.salery=this.salery+ this.salery*0.15;
        }
        else{
            if(age>60){
                
        this.salery=50000;
            }
        }

       }

    }

}

public class Employee {

    public static void main(String[] args) {
        Emp e1 = new Emp();
        // set Age
        e1.setAge(12);
        e1.getAge();
        //set name
        e1.setName("Satyam");
        e1.getName();
        // setDept
        e1.setDept("admin");
        e1.getDept();
        // setSaleery
        e1.setSallery(10);
        e1.getSallery();
      
        // salery incresae condition __

    }

}