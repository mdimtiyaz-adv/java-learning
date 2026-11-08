public class array {

    public static void main(String[] args) {
        // array- need->to store multiple value of same data type
        // implementation
        // int arr[] = { 1, 2, 3 };
        // arr[2] = 5; updating
        // System.out.println(arr[2]);
        // System.out.println(arr[2]);
        // we can also make array dynamically and ascess it. first we have to specify
        // its shape and provide a value
        int num1[] = new int[4];
        // initially the value of the array will be 0.
        num1[1] = 2;
        num1[2] = 3;
        num1[0] = 1;
        num1[3] = 9;
        for (int i = 0; i < 4; i++) {

            System.out.println(num1[i]);
        }

    }
}