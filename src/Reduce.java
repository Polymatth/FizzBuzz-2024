public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduce(5));
    }
    private static int reduce(int n){
        int i = 0;
        while (n > 0) {
            if (n % 2 == 0){
                n = n / 2;
            }

            else {
                n -= 1;
            }
            i += 1;
        }
        return i;
    }
}
