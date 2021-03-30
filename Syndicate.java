public class Syndicate extends Employee{
    private int syndID;
    private float syndTaxes;
    public Syndicate(int syndID){
        this.syndID=syndID;
        this.syndTaxes=0;
    }

    public int getSyndID() {
        return syndID;
    }
    public float getSyndTaxes() {
        return syndTaxes;
    }
    public void setSyndTaxes(float syndTaxes) {
        this.syndTaxes = syndTaxes;
    } 
    public void addTaxes(float tax){
        float oldvalue;
        oldvalue = getSyndTaxes();
        setSyndTaxes(oldvalue+tax);
    }
}