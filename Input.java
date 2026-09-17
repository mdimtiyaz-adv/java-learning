import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {
    // println is a method.out is object and system is class and system extends
    // inputstream .same as system hai in to take input form user. but this method
    // print ascii value. so we have bufferreader which takes its parent obj as
    // arguement and then we have input streamreader which also takes arguement of
    // its parent obj.
    public static void main(String[] args) throws IOException {
        // System.out.println();
        // int num = System.in.read();
        // System.out.println(num);
        // but java says you dont need to do that we have special class .bufferreader.
        // it takes the construter of input stream reader. and also inputstreamreader
        // take
        // the object of parent. there is also a resurce as we pass the object in
        // bufferreader it willact as resource so we have to close . bufferreader gives
        // the string so for integer we have to parse it.
        // System.out.println("enter the number");
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);
        // bf.close();
        // we have modern method scanner . it has all types of method.
        System.out.println("enter another number");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println(num1);
        sc.close();
    }
}
