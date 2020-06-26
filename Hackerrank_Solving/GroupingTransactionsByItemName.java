import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    /*
     * Complete the 'groupTransactions' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY transactions as parameter.
     */

    public static List<String> groupTransactions(List<String> transactions) {
    // Write your code here
    String item;
    ArrayList<String> ans = new ArrayList<>();
    Map<String,Integer> frequencyMap = new HashMap<>();
    for(String trans : transactions)
    {
        Integer count = frequencyMap.get(trans);    
        if(count == null)
            count = 0;
        frequencyMap.put(trans, count+1);
    }
    for(Map.Entry<String,Integer>entry:frequencyMap.entrySet())
    {
        item = entry.getKey() + " " + entry.getValue();
        ans.add(item);
    }
    Collections.sort(ans);
    return ans;
    }
    
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int transactionsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> transactions = new ArrayList<>();

        for (int i = 0; i < transactionsCount; i++) {
            String transactionsItem = bufferedReader.readLine();
            transactions.add(transactionsItem);
        }

        List<String> result = Result.groupTransactions(transactions);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(result.get(i));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
