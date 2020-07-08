
package school.manegement.system;

import java.util.ArrayList;
import java.util.List;
public class School {
    private List<Teatcher> teatchers = new ArrayList();
    private List<Student> students = new ArrayList();
    private static int totalMoneyEarned ;
    private static int totalMoneySpent ;
    
    public School (ArrayList<Student> s ,ArrayList<Teatcher> t){
        this.students = s ;
        this.teatchers = t ;
        totalMoneyEarned = 0 ;
        totalMoneySpent = 0;
        
    }
    public List<Student> getStudents (){
        return students ; 
    }
     public List<Teatcher> getTeatchers (){
        return teatchers ; 
    }
     
     public void addStudent (Student student){
         students.add(student);
         
     }
     
     public void addTeatcher (Teatcher teatcher){
         teatchers.add(teatcher);
         
     }
     public static void updateTotalMoneyEarned (int money){
         
         totalMoneyEarned += money ;  
     } 
      public static void updateTotalMoneyspent (int money){
         
         totalMoneyEarned -= money ;  
     } 
     
     public int  profit(){
         return totalMoneyEarned - totalMoneySpent ;
     } 
    public int getTotalMoney(){
        return  totalMoneyEarned;
    }
    
     public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    
}
