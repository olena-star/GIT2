public class ArrayOne {
    public static void main(String[] args) {

        int n = 8;
        int[] a = {1, 5, 3, 6, 8, 7, 4};

        int arraySum = 0;
        int generalSum = 0;
        int result = 0;

        for (int i = 0; i < n - 1; i++) {
            arraySum += a[i];
            generalSum += (i + 1);
        }
        result = generalSum + n - arraySum;
        System.out.println(result);
    }
}//