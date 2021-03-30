public class Employee{
    private String name;
    private String address;
    private String payment;
    private int workerID;

    public Employee(String name, String address,String payment){
        this.name=name;
        this.address=address;
        this.payment=payment;
    }

    void printWorkerInfo(){
        System.out.printf("Name:%s\nAddress:%s\nPayment Method:%s\nID::%d\n", name,address,payment,workerID);
    }
}