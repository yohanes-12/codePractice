// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Arrays;
import java.util.StringJoiner;
public class Main {
    public static void main(String[] args) {
        if(args == null || args.length == 0) {
            System.out.println("<no input>");
        }
        String finalSentence = "";
        int  len = args.length;
        for(int i = 0; i < len-1; ++i) {
            finalSentence += (args[i] + " "); //inefficient
        }
        finalSentence += (args[len-1] + ".");
        System.out.println(finalSentence);
    }
}