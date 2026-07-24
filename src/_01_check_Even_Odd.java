public class _01_check_Even_Odd {

    public static void EvenOdd(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("even number");
        }
        else{
            System.out.println("Odd number");
        }
    }


    public static void main(String[] args) {
        int n=8;

        EvenOdd(n);
    }
}
