    import java.util.List;

    @RestController
    @RequestMapping("/emp") //all requests coming to emp as a location url

    public class EmpController{

        @Autowired //will help to inject beans/objects into the controller class

        @GetMapping("/get/all") //getting info of the employees
        //as a convnetion, make sure not to expose the name of the function in the path
        public List<Employee>  getAll(){

            //but we need to re-direct this request to the exact location
            //controller does not know about the data
            //So we need to take help of service
            return EmployeeService.getAll();

            //Request is coming to Controller
            //Controller is transferring this request to Service
            //Service is transferring this request to Repesitory
            //and then the steps rolls back to Controller
        }


        //emp will identify the contrller and /add will identify the path
     @PostMapping("/add") //creating API
    public String add(@RequestBody Employee emp){//taking data inside function 
    eturn EmployeeService.add(emp);//passing the employee object to service
    }

    @PutMapping("/edit")
    public String edit(@RequestBody Employee emp){

        return EmployeeService.edit(emp);

    @DeleteMapping("/delete")
    //use index of the employee in the List to delete it
    //we do not need to use RequestBody to get the entire object.
    //We can use just a parameter so RequestParam
    public String delete(@RequestBody Employee employee_no){
    
        return EmployeeService.delete(employee_no);

    }
}
