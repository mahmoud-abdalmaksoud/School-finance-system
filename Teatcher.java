
package school.manegement.system;


public class Teatcher {
    private int id ;
    private String name ;
    private int salary ;
    private int salaryEarned ;
    
    public Teatcher(int pid , String pname , int psalary ){
        this.id = pid;
        this.name = pname;
        this.salary = psalary ;
        salaryEarned = 0 ;
        
    }
     public void setId(int id){
        this.id = id ;        
    }
    public int getId(){
        return id ;
    }
    
     public void setName(String name){
        this.name = name ;        
    }
    public String getName(){
        return name ;
    }
    
     public void setSalary(int salary){
        this.salary = salary ;        
    }
    public int getSalary(){
        return salary ;
    }
    
    public void recievedSalary(int salary){
        salaryEarned += salary ;
        School.updateTotalMoneyspent(salary);
    }
    
    public String toString(){
        return id + " " + name + " " + salary + " " + salaryEarned ;
    }
}
