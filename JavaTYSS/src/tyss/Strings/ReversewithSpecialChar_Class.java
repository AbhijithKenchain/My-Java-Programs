package tyss.Strings;

public class ReversewithSpecialChar_Class {

    public static void main(String[] args) {
        String s = "my$ na%me is$ %prak@ash";
        //String s1 = s.replaceAll(" ", "");
        //System.out.println(s1);

        String des = "";
        System.out.println("before reversing String is----->" + s);
        char[] c = s.toCharArray();
        for (int i = 0; i< s.length(); i++) {
            if (c[i] >= 'a' && c[i] <= 'z') {
                des = des + c[i];
            }
        }
        System.out.println(des);

        int count = des.length();
        

        for (int i = 0; i < s.length()-1; i++) {  // Change: Use s.length() instead of s.length()-1
            if (s.charAt(i) != ' ') {
                System.out.print(des.charAt(count));
            } else {
                System.out.print(s.charAt(i));
            }
        }
    }
}
