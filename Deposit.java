public class Deposit extends Employee{
    private int agency;
    private String accNumber;
    private float value;
    public Deposit(int agency, String accNumber, float value){
        this.agency=agency;
        this.accNumber=accNumber;
        this.value=value;
    }

    public int getAgency() {
        return agency;
    }
    public String getAccNumber() {
        return accNumber;
    }
    public float getValue() {
        return value;
    }
    public void setValue(float value) {
        this.value = value;
    }
    
}