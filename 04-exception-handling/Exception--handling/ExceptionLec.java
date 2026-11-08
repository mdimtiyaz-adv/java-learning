// it is good to handle all the exception in the program even if we havent written the specifically for all.
public class ExceptionLec {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        int nums[] = new int[5];
        String str = null;

        try {
            j = 18 / i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        } catch (ArithmeticException e) {
            System.out.println("cannot divide by zero");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("stay in your boundary");
        } catch (Exception e) {
            System.out.println("something wrong");
        }
        System.out.println(j);
        System.out.println("finished");
    }
}
