
package school.manegement.system;


public class Student {
    private int id ;
    private String name ;
    private int grade ;
    private int feesPaid ;
    private final int feesTotal;
    
    public Student (int pid , String pname , int pgrade){
        this.id = pid ;
        this.name = pname ;
        this.grade = pgrade ;
        this.feesPaid = 0;
        this.feesTotal = 30000;
        
    }
    
    public void setGrade(int grade){
        this.grade = grade ;        
    }
    public int getGrade(){
        return grade ;
    }
    
    public void setId (int Id){
        this.id = Id ;
    }
    public int getId (int Id){
        return Id ;
    }
    
    public void setName(String name){
        this.name = name ;
    }
    public String getName (){
        return name ;
    }
    
    public void setFeesPaid(int fees){
        this.feesPaid += fees ; 
        School.updateTotalMoneyEarned(fees);
    }
    public int getFeesPaid (){
        return feesPaid ;
    }
    
    public int getRemaningfees(){
        return   feesTotal - feesPaid ;
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + grade + " " +feesPaid ;  
    }
    
}
