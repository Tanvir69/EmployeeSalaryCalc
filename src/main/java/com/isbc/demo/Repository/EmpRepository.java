 import java.util.ArrayList;


 @Repository
 public class EmpRepository {
    List<Employee>employee=new ArrayList<Employee>();

    public List<Employee> getAll() {
        return employee;
    }

    //adding new employee via postman

    public String add(Employee emp){
        employee.add(emp);
        return "Successfully added"
    }
    //using the same funcnction names in all for simplicity
    public String edit(Employee emp){
        //searching the targetted employee by EID since employee is unique
        employee.stream().filter(e -> e.getEID() == emp.getEID()).forEach(e -> {
            e.setAddr("Homeless");
            e.set_balance(1000000);


        });

        return "Successfully Updated!!";
    }
    
    public String delete(Employee emp){
        //this will delete the object entirely from here.
        //searching for the employee from the List and from the data taken from Repository
        employee.removeIf(e -> e.getEID() == emp.getEID());
        return "Deleted Successfully";
}
}
