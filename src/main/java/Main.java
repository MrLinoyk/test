import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        int [] ints = {1, 2 ,3 ,4 ,5};
        String [] indexes = {"1,3-5", "2", "3-4"};
        Port port = new Port();
        System.out.println(port.stringArrayToArraySequence(indexes));
        System.out.println(port.second3(indexes));


    }
}
