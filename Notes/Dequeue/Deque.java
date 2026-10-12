
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String s = "Hello";
        Deque<Character> dqq = new ArrayDeque<>();

        // Insert every character at the front
        for (int i = 0; i < s.length(); i++) {
            dqq.addFirst(s.charAt(i));
        }

        StringBuilder sb = new StringBuilder();

        // Remove characters from the front
        while (!dqq.isEmpty()) {
            sb.append(dqq.removeFirst());
        }

        String reversed = sb.toString();
        String rev="oleha";

        System.out.println("Original: " + s);
        System.out.println("Reversed: " + reversed);
        boolean flag =true;
        for(int i=0;i<s.length();i++){
          if(s.charAt(i)!=rev.charAt(s.length()-i-1)){
          flag=false;
          }
        }
        if(flag){
          System.out.print("Palindrome");
        }else{
          System.out.print("Nhi");
        }
    }
}
