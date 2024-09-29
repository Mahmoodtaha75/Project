import java.util.*;

class payroll {
    public int numberofdays = 20;
    public int number_of_attendence;
    public float attendence_percentage;
    public long salary;
    String name;
    public float bonus;
    float result;

    void attendence() {
        attendence_percentage = ((float)number_of_attendence / numberofdays) * 100;
        
    }

    void payment() {

        details();
        attendence();

        if (attendence_percentage >= 90) {
            System.out.println("salary:" + (salary + bonus));
        } else if (attendence_percentage >= 85) {
            result = salary * 0.10f;
            bonus = bonus*0.10f;
            System.out.println("salary:" + (salary - result + bonus));
        } else if (attendence_percentage >= 75) {
            result = salary * 0.20f;
             bonus = bonus*0.15f;
            System.out.println("salary:" + (salary - result + bonus));
        } else if (attendence_percentage >= 60) {
            result = salary * 0.30f;
             bonus = bonus*0.20f;
            System.out.println("salary:" + (salary - result + bonus));
        } else if (attendence_percentage >= 45) {
            result = salary * 0.40f;
             bonus = bonus*0.25f;
            System.out.println("salary :" + (salary - result));
        }else{
            System.out.println("fire him right now");
        }
    }

    void details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the emp:");
        name = sc.next();
        System.out.println("Enter the salary: ");
        salary = sc.nextInt();
        System.out.println("enter the attendence of the emp:");
        number_of_attendence = sc.nextInt();
        System.out.println("Enter the bonus allocation:");
        bonus = sc.nextInt();
        sc.close();

    }

    public static void main(String[] args) {
        payroll pr = new payroll();
        pr.payment();
    }
}
