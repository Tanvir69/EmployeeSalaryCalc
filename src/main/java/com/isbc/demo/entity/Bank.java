public class Bank {
    private String acc_Type;
    private String acc_Name;
    private String acc_Number;
    private double curr_Balance;
    private String bank_Name;
    private String branch_Name;

    public BankAccount(String acc_Type, String acc_Name, String acc_Number, double curr_Balance, String bank_Name, String branch_Name) {
        this.acc_Type = acc_Type;
        this.acc_Name = acc_Name;
        this.acc_Number = acc_Number;
        this.curr_Balance = curr_Balance;
        this.bank_Name = bank_Name;
        this.branch_Name = branch_Name;
    }

    public BankAccount(double curr_Balance) {

        this.curr_Balance = curr_Balance;

    }
    
    /**
     * @return String return the acc_Type
     */
    public String getAcc_Type() {
        return acc_Type;
    }

    /**
     * @param acc_Type the acc_Type to set
     */
    public void setAcc_Type(String acc_Type) {
        this.acc_Type = acc_Type;
    }

    /**
     * @return String return the acc_Name
     */
    public String getAcc_Name() {
        return acc_Name;
    }

    /**
     * @param acc_Name the acc_Name to set
     */
    public void setAcc_Name(String acc_Name) {
        this.acc_Name = acc_Name;
    }

    /**
     * @return String return the acc_Number
     */
    public String getAcc_Number() {
        return acc_Number;
    }

    /**
     * @param acc_Number the acc_Number to set
     */
    public void setAcc_Number(String acc_Number) {
        this.acc_Number = acc_Number;
    }

    /**
     * @return double return the curr_Balance
     */
    public double getCurr_Balance() {
        return curr_Balance;
    }

    /**
     * @param curr_Balance the curr_Balance to set
     */
    public void setCurr_Balance(double curr_Balance) {
        this.curr_Balance = curr_Balance;
    }

    /**
     * @return String return the bank_Name
     */
    public String getBank_Name() {
        return bank_Name;
    }

    /**
     * @param bank_Name the bank_Name to set
     */
    public void setBank_Name(String bank_Name) {
        this.bank_Name = bank_Name;
    }

    /**
     * @return String return the branch_Name
     */
    public String getBranch_Name() {
        return branch_Name;
    }

    /**
     * @param branch_Name the branch_Name to set
     */
    public void setBranch_Name(String branch_Name) {
        this.branch_Name = branch_Name;
    }

}