public class Comissioned extends Employee{
    private float salary;
    private float salePercentage;
    private float comisssions;
    public Comissioned(float salary,float salePercentage){
        this.salary=salary;
        this.salePercentage=salePercentage;
        this.comisssions=0;
    }

    public float getSalary() {
        return salary;
    }
    public float getSalePercentage() {
        return salePercentage;
    }
    public float getComisssions() {
        return comisssions;
    }
    public void setComisssions(float comisssions) {
        this.comisssions = comisssions;
    }
    public void addComissions(float value){
        float oldvalue;
        oldvalue=getComisssions();
        this.setComisssions(oldvalue+value);
    }
}