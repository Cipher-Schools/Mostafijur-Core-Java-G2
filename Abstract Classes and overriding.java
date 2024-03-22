import java.io.*;

abstract class Employee{
    
    String name;
    int id;
    int base; //base Salary
    
    Employee(int id, String name, int base){
        this.id = id;
        this.name = name;
        this.base = base;
    }
    
    abstract public int calculateSalary();
    //abstract public void displayInfo();
}

class Manager extends Employee{
    
    int juniorEMployees;
    
    Manager(int id, String name, int base, int juniorEMployees){
        super(id, name, base);
        this.juniorEMployees = juniorEMployees;
    }
    
    public int calculateSalary(){
        return this.base + juniorEMployees*10;
    }
}

class programmer extends Employee{
    
    int overtime;
    
    programmer(int id, String name, int base, int overtime){
        super(id, name, base);
        this.overtime = overtime;
    }
    
    public int calculateSalary(){
        return this.base + overtime*15;
    }
    
}
class GFG {
	public static void main (String[] args) {
		
		programmer p1 = new programmer(1,"Deep Singh", 1000, 15);
		System.out.println(p1.calculateSalary());
		
		Manager m1 = new Manager(2,"Pratik Rout", 2000, 5);
		System.out.println(m1.calculateSalary());
		
		
	}
}