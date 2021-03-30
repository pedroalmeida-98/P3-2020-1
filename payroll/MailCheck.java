public class MailCheck extends Employee{
    private float value;
    private String textValue;
    private String city;
    private String date;
    private String zipcode;

    public MailCheck(float value, String textValue, String city, String date, String zipcode){
        this.value=value;
        this.textValue=textValue;
        this.city=city;
        this.date=date;
        this.zipcode=zipcode;
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
    public String getZipcode() {
        return zipcode;
    }
}