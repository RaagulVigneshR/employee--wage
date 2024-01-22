public class Employee {
    String name;
    Integer id;

    Integer wageperhour;
    Integer workhour = 0;

    Integer attendance;
    Employee(String n,Integer i,Integer w){
        this.name = n;
        this.id = i;
        this.wageperhour = w;
    }



}
