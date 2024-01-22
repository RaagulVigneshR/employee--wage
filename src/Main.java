
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Raagul",88,10);
        System.out.println(e1);



        Integer days=20;
        for(int i=0;i< days;i++) {

            // Using Random function to generate the attendance
            int check = (int)((Math.random()*10))%3;

            // Condition for the attendance
            if(check == 0){
                e1.attendance = 0;
            }
            else if(check == 1) {
                e1.attendance = 1;
            }
            else {
                e1.attendance = 2;
            }

            // Check weather employee is present or not
            switch (e1.attendance) {
                case 1:
                    System.out.println("Employee is present");
                    e1.workhour = 8;
                    e1.noofdayspresent+=1;
                    break;
                case 2:
                    System.out.println("Employee is absent");
                    break;
                default:
                    System.out.println("Employee is part time");
                    e1.workhour = 4;
                    e1.noofdayspresent+=1;
            }
        }

        //Creating an Object to call the function from the Main function
        Main m1 = new Main();

        System.out.println("Salary for the employee is : "+m1.calcsal(e1));

        System.out.println("Monthly wage of the employee is : "+m1.calcmon(e1));
    }

    // Function for Calculating the salary of the employee
    double calcsal(Employee e){
        return e.workhour*e.wageperhour;
    }
    // Function for calculating the monthly payout of the employee
    double calcmon(Employee e){
        return e.noofdayspresent*calcsal(e);
    }
}