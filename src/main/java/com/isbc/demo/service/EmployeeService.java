import java.util.List;

@Service
public class EmpService{

@Autowired
EmpRepository empRepository;


public List <Employee> getAll(){
    return empRepository.getAll();

}

public String add(Employee emp){
    return EmpRepository.add(emp);
}

public String edit(Employee emp){
    return EmpRepository.edit(emp);
}

public String delete(String employee_no){
    return EmpRepository.delete(employee_no);
}

}