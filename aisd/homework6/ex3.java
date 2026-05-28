package aisd.homework6;

import java.util.ArrayList;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(input1.nextLine());
        ArrayList<String> wordList = new ArrayList<>();
        while (input2.hasNext()) {
            wordList.add(input2.next());
        }
        for (int idx = wordList.size() - 1; idx >= 0; idx--) {
            System.out.println(wordList.get(idx));
        }
    }
}