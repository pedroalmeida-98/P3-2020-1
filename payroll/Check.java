public class Check extends Employee{
    private float value;
    private String textValue;
    private String city;
    private String date;
    public Check(float value, String textValue, String city, String date){
        this.value=value;
        this.textValue=textValue;
        this.city=city;
        this.date=date;
    }
    public float getValue() {
        return value;
    }
    public void setValue(float value) {
        this.value = value;
    }
    public String getTextValue() {
        return textValue;
    }
    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }
    public String getCity() {
        return city;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
}