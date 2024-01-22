//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Raagul",88,10);
        System.out.println(e1);

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
        if(e1.attendance == 1){
            System.out.println("Employee is present");
            e1.workhour = 8;
        }
        else if(e1.attendance == 0) {
            System.out.println("Employee is absent");
        }
        else {
            System.out.println("Employee is Part-Time");
            e1.workhour = 4;
        }

        Main m1 = new Main();
        System.out.println(m1.calcsal(e1));
    }

    // Function for Calculating the salary of the employee
    double calcsal(Employee e){
        return e.workhour*e.wageperhour;
    }
}