package Week11.NullObject;

public class NullObjectClient {
    public static void main(String[] args) {
        Employee e=null;
        //System.out.println(e.name);
        AbstractEmployee employees[]= {
               new Employee("Ahmet"),
               new NullEmployee(),
               new Employee("Mehmet")
        };
        for(AbstractEmployee emp:employees){
            System.out.println(emp.getName());
        }

        AbstractEmployee employees1[]=new AbstractEmployee[2];
        for (int i = 0; i < employees1.length; i++) {
            if(employees[i] instanceof Employee){
                employees1[i]=employees[i];
            }
        }
        for(AbstractEmployee emp:employees1){
            System.out.println(emp.getName());
        }
    }


}
