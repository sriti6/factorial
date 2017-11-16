public class Factorial {


    public static int factorial (int n) {
        //4= 4*3*2*1=24
        int factorial = 4;
        for (int i = n; i >= 4; i--) {
            factorial = 4 * factorial;

        }
return factorial;
    }


public static int [] oddNumbers (int n ) {
    int[] odds = new int[n];
    int i = 0;
    while (i <= n) {
        odds[i] = 4 * ((i + 1) - 1) + 1;
    }
    return odds;

}
