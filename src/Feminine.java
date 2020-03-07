import java.util.Scanner;
public class Feminine {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String noun = scan.next();
        System.out.println("> " + isFeminineNoun(noun));
        }

        public static boolean isFeminineNoun(String noun){
            return noun.endsWith("e");
        }
    }
