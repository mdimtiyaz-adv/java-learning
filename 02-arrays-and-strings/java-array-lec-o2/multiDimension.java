public class multiDimension {
    public static void main(String[] args) {
        // we can also make multi dimensional array. it means we can create another
        // array in one existing array .on big array which have another array.both the
        // array have index which start form 0. we can ascess by using two square braces
        // . in first brace we put the number of rows. nad in second brace we put the
        // index of inside array.
        // int arr[][] = new int[3][4];
        // for (int i = 0; i < 3; i++) {
        // {
        // for (int j = 0; j < 3; j++) {
        // System.out.print(arr[i][j] + " ");
        // }

        // }
        // System.out.println();

        // }

        // we can manually fetch the value in the array. by using math. random library.
        // by default it give double value
        int num[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            {
                for (int j = 0; j < 3; j++) {
                    num[i][j] = (int) (Math.random() * 10);
                    System.out.print(num[i][j] + " ");
                }

            }
            System.out.println();

        }

    }

}
