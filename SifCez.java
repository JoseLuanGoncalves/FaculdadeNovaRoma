import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
    // Write your code here
        StringBuilder res = new StringBuilder();

        // Ensure the rotation factor k is within the range 0-25
        k = k % 26;

        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                // Rotate lowercase letters
                char rapazeado = (char) ('a' + (c - 'a' + k) % 26);
                res.append(rapazeado);
            } else if (Character.isUpperCase(c)) {
                // Rotate uppercase letters
                char rapazeado = (char) ('A' + (c - 'A' + k) % 26);
                res.append(rapazeado);
            } else {
                // Non-alphabetic characters remain unchanged
                res.append(c);
            }
        }

        return res.toString();
    }
    }



public class SifCez {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
