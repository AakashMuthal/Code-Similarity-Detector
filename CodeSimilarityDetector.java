import java.io.*;
import java.util.*;

public class CodeSimilarityDetector {

    public static String readFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        StringBuilder content = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }

        reader.close();
        return content.toString();
    }

    public static String cleanCode(String code) {

        code = code.replaceAll("//.*", "");

        code = code.replaceAll("/\\*.*?\\*/", "");

        code = code.replaceAll("\\s+", "");

        return code;
    }

    public static int lcs(String s1, String s2) {

        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);

            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter first file path:");
            String file1 = scanner.nextLine();

            System.out.println("Enter second file path:");
            String file2 = scanner.nextLine();

            String code1 = readFile(file1);
            String code2 = readFile(file2);

            code1 = cleanCode(code1);
            code2 = cleanCode(code2);

            int lcsLength = lcs(code1, code2);

            int totalLength = code1.length() + code2.length();

            double similarity = (2.0 * lcsLength / totalLength) * 100;

            System.out.println("\nCode Similarity: " + String.format("%.2f", similarity) + "%");

        } catch (Exception e) {
            System.out.println("Error reading files.");
        }

        scanner.close();
    }
}