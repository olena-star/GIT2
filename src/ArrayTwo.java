public class ArrayTwo {
    public static void main(String[] args) {
        int n = 9;
        int k = 7;
        int pairs = 0;
        int[] arr = {1, 6, 2, 3, 5, 7, 4, 2, 3};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j) {
                    continue;
                } else {
                    if (arr[i] + arr[j] == k) {
                        pairs++;
                    }
                }
            }//
        }
        System.out.println("Колличество пар в массиве: " + pairs);
    }
}
