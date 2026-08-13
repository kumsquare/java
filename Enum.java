enum status{
    SUCCESS(100),
    FAILURE,
    PENDING(50),
    IN_PROGRESS(70),
    COMPLETED(100),
    CANCELLED,
    ERROR(20),
    TIMEOUT(50),
    UNKNOWN;
    private int price;
    status(int p){
        price=p;
    }

    status(){
        price=0;
    }

    public int getPrice() {
        return price;
    }

}
public class Enum{
    public static void main(String []args){
        status s = status.SUCCESS;
        System.out.println("The status is: " + s);
        System.out.println("The ordinal of SUCCESS is: " + s.ordinal());
        System.out.println("The name of the enum is: " + s.name());
        for(status i: status.values()){
            System.out.println(i+" "+i.getPrice());
        }
        s= status.valueOf("PENDING");
        System.out.println("The status is: " + s);

    }
}