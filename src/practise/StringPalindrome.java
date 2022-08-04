package practise;

public class StringPalindrome {

    public static void main(String[] args) {

        StringBuffer s = new StringBuffer("dinesh");
        StringBuffer copy=new StringBuffer(s.reverse());
        System.out.println(copy.toString());
        StringBuffer rev= (s.reverse());
        System.out.println(copy.equals(rev));

    }
}
