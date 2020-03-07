public class exercise2 {

    public static void main (String[] args){
        cipher("Family", 2);
    }
    public static String cipher(String msg, int step) {
        String s = "";
        for (int i = 0; i < msg.length(); i++) {
            char c = (char) (msg.charAt(i) + step);
            if (c > 'z')
                s = s + (char) (msg.charAt(i) - (26 - step));
            else
                s = s + (char) (msg.charAt(i) + step);
        }
        System.out.println(s.toUpperCase());
        return s;
    }
}


