public class Classes1 {
    
}

class Person {
   private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Person(String name){
        this.name = name;
        this.age = 0;
    }
    public String getDetails(){
        return "nme: "+this.name+" age: "+this.age;
    }
public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
    }

}
public interface Payable  {
     public int getSalary();
}

    class Employee extends Person  implements Payable {
        int salary;
        int employeeId;
        public Employee(String name, int age, int employeeId ){
              super(name, age);
                this.employeeId = employeeId;
        }
        public String getDetails(){
        return "nme: "+ super.getName()+" age: "+super.getAge() + "employeeId"+this.employeeId;
        }
        public int getSalary(){
            return this.salary;
        }
    }
    
    class Freelancer implements Payable {
        int hoers;
        public int getSalary(){
            return hoers * 35;
        }
        
    }
