package Practice;
class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3};

        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
