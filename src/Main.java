//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Raagul",88);
        System.out.println(e1);
        // Using Random function to generate the attendance
        int check = (int)((Math.random()*10))%2;
        // Condition for the attendance
        if(check == 0){
            e1.attendance = Boolean.FALSE;

        }
        else {
            e1.attendance = Boolean.TRUE;
        }
        // Check weather employee is present or not
        if(e1.attendance){
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is absent");
        }

    }
}