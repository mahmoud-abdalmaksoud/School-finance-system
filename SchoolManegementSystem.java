
package school.manegement.system;
import java.util.ArrayList;


public class SchoolManegementSystem {

   
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList();
        ArrayList<Teatcher> teatchers = new ArrayList();
        
        Student mahmoud = new Student (1 , "mahmoud" ,7 );
        Student mohamed = new Student (2 , "mohamed" ,8 );
        Student moustafa = new Student (3 , ",moustafa" ,9 );
        
        students.add(mahmoud);
        students.add(mohamed);
        students.add(moustafa);
        
        Teatcher elsaied = new Teatcher(5, "elsaied" , 9000 );
        Teatcher hany = new Teatcher( 16 , "hany" , 6000 );
        Teatcher badr = new Teatcher( 14 , "badr" , 12000 );
        
        teatchers.add(badr);
        teatchers.add(hany);
        teatchers.add(elsaied);
        School SM = new School (students , teatchers);
        Teatcher ahmed = new Teatcher (55 , "ahmed", 15000);
        SM.addTeatcher(ahmed);
        mahmoud.setFeesPaid(20000);
        mohamed.setFeesPaid(10000);
        moustafa.setFeesPaid(30000);
         System.out.println("GHS has earned $"+ SM.getTotalMoney());
badr.recievedSalary(12000);
hany.recievedSalary(6000);
elsaied.recievedSalary(9000);
 System.out.println("SM has spent for salary to " + badr.getName()+" " 
         +hany.getName()
         +" "+elsaied.getName()
        +" and now has $" + SM.getTotalMoney());
 System.out.println(mahmoud);
 




        



        
    }
    
}
