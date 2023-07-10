public class Employee{
    private String eID;
    private String name;
    private String mobileNum;
    private int grade;
    private String Emp_name;
    private String addr;
    private Bank Bank_acc;
    private Bank balance;



    public Employee(String eID, String Emp_name, int grade, String address, String mobile, Bank bankAccount){
        this.eId = employeeId;
        this.Emp_name = name;
        this.grade = grade;
        this.address = address;
        this.mobile = mobile;
        this.Bank_acc = bankAccount;

    }

    /**
     * @return String return the eID
     */
    public String getEID() {
        return eID;
    }

    /**
     * @param eID the eID to set
     */
    public void setEID(String eID) {
        this.eID = eID;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the mobileNum
     */
    public String getMobileNum() {
        return mobileNum;
    }

    /**
     * @param mobileNum the mobileNum to set
     */
    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    /**
     * @return int return the grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * @return String return the Emp_name
     */
    public String getEmp_name() {
        return Emp_name;
    }

    /**
     * @param Emp_name the Emp_name to set
     */
    public void setEmp_name(String Emp_name) {
        this.Emp_name = Emp_name;
    }

    /**
     * @return String return the addr
     */
    public String getAddr() {
        return addr;
    }

    /**
     * @param addr the addr to set
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * @return Bank return the Bank_acc
     */
    public Bank getBank_acc() {
        return Bank_acc;
    }

    /**
     * @param Bank_acc the Bank_acc to set
     */
    public void setBank_acc(Bank Bank_acc) {
        this.Bank_acc = Bank_acc;
    }

    public void set_balance(double amount) {
        Bank_acc.setCurr_Balance

    }

}