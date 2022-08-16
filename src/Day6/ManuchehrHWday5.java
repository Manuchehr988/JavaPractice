package Day6;

public class ManuchehrHWday5 {

    public static void main(String[] args) {

       

        // Calculate total of number 563;

        int num = 563;
        int total = 0;
        int divider = 10;


        System.out.println("number = " + num);
        int remainder = num%divider;
        System.out.println("remainder = " + remainder);
        total += remainder;
        System.out.println("total = " + total);

        num /= divider;
        System.out.println("number = " + num);
        remainder = num%divider;
        System.out.println("remainder = " + remainder);
        total += remainder;
        System.out.println("total = " + total);

        num /= divider;
        System.out.println("number = " + num);
        remainder = num%divider;
        System.out.println("remainder = " + remainder);
        total += remainder;
        System.out.println("total = " + total);


        

    }
}
