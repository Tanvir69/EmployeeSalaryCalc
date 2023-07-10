import java.util.HashMap;
import java.util.Map;

public class Company {
    private List<Employee> employees;
    //private Bank Bank_acc='1122';
    private double company_balance=0;
    private double basicSalaryOfLowestGrade=0;
    


    public Company(double company_balance, double basicSalaryOfLowestGrade) {
        employees = new ArrayList<>(); //loosely coupled
        this.company_balance+=company_balance;
        this.basicSalaryOfLowestGrade+=basicSalaryOfLowestGrade;
    }

    // Getters and Setters

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    /*public void addEmployee(Employee employee) {
        employees.add(employee);
    }*/

    //the input is the basic salary for Grade 6 employee
    //itterating thorugh the list of employees to calculcate the salary for each

           // Calculate basic salary for each grade
        Map<Integer, double> gradeSalaryMap = new HashMap<>();

        // Grade 6 (lowest grade)
        gradeSalaryMap.put(6, basicSalaryOfLowestGrade);



        // Calculate basic salary for higher grades
        public void calculateSalary() {
        for (int grade = 5; grade >= 1; grade--) {
            int prev_GradeSalary = gradeSalaryMap.get(grade + 1);
            int curr_GradeSalary = previousGradeSalary + 5000;
            gradeSalaryMap.put(grade, currentGradeSalary);
        }

        accountBalance=new Bank(company_balance); //setting bank balance of company
 
        for (Employee employee : employees) {
            double grade=employee.getGrade();

            if(grade==6){
            double basicSalary = gradeSalaryMap.get(grade);
            double houseRent = 0.2 * basicSalary; //20%
            double medicalAllowance = 0.15 * basicSalary; //15%
            double totalSalary = basicSalary + houseRent + medicalAllowance; //sum of external allowances plus basic is total
            }
            else{
            double basicSalary = gradeSalaryMap.get(grade);
            double houseRent = 0.2 * basicSalary; //20%
            double medicalAllowance = 0.15 * basicSalary; //15%
            double Emp_totalSalary = basicSalary + houseRent + medicalAllowance; //sum of external allowances plus basic is total
            }
        


            
            double company_balance = accountBalance.getCurr_Balance();
            //double currentBalance = employeeAccount.getCurrentBalance();

            if (currentBalance >= Emp_totalSalary) {
                accountBalance.setCurr_Balance(currentBalance - Emp_totalSalary); // reduce company's balance
                employee.set_balance(Emp_totalSalary)
            } else {
                // Additional logic to handle insufficient balance scenario
                System.out.println("Insufficient balance in the company account to transfer salary to employee: " + employee.getName());
            }
        }
    }

    public void addMoneyToCompanyAccount(double amount) {
        double currentBalance = companyBankAccount.getCurrentBalance();
        companyBankAccount.setCurrentBalance(currentBalance + amount);
    }
}