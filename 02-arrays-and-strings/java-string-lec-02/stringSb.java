public class stringSb {

    public static void main(String[] args) {
        // string is immuatable sp we use stringbuffer to mutate the string. it is
        // another datatype.
        // StringBuffer sb = new StringBuffer();
        // System.out.println(sb.capacity()); gives capacity means border short string.
        // it can be increased as the length of string increase
        StringBuffer sb = new StringBuffer("imtiyaz");
        System.out.println(sb.length());// gives length
        System.out.println(sb.append(" ansari"));
        System.out.println(sb.insert(0, "md "));
        System.out.println(sb.reverse());
        System.out.println(sb.toString());

    }
}