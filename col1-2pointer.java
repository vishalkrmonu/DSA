import java.util.Arrays;
class col4 {
    public static void main(String[] args) {
        int n = 5, k;
        int arr[] = { 1, 4, 45, 6, 10, 8 };
        int x = 16;
        Arrays.sort(arr);
        System.out.println("sorting array is  ");
        for (k = 0; k < 6; k++) {
            System.out.println(arr[k]);
        }
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (arr[i] + arr[j] == x) {
                // return true;
                System.out.println("true");
                return;
            } else if (arr[i] + arr[j] < x) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println("false");
    }
}
