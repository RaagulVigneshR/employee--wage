public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Aryan", 1, 200);

        int totalDaysWorked = 0;
        while (e1.totalWorkHours < 100 && totalDaysWorked < 20) {
            int check = (int) ((Math.random() * 10)) % 3;

            if (check == 0) {
                e1.attendance = 0;
            } else if (check == 1) {
                e1.attendance = 1;
            } else {
                e1.attendance = 2;
            }

            switch (e1.attendance) {
                case 1:
                    System.out.println("Employee is present");
                    e1.workHour = 8;
                    break;
                case 2:
                    System.out.println("Employee is absent");
                    e1.workHour = 0;
                    break;
                default:
                    System.out.println("Employee is part-time");
                    e1.workHour = 4;
            }
            e1.totalWorkHours += e1.workHour;
            totalDaysWorked++;
            System.out.println("Day " + totalDaysWorked + " - Total Work Hours: " + e1.totalWorkHours);
        }
        Main m1 = new Main();
        System.out.println("Total Work Hours : "+e1.totalWorkHours);
        System.out.println("Total Salary: " + m1.calculateSalary(e1));
    }
    double calculateSalary(Employee e){
        return e.totalWorkHours * e.wagePerHour;
    }
}