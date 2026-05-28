package aisd.homework4;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        String twoS = s + s;
        if (s.length() == t.length() && twoS.contains(t)){
            System.out.println("Т - циклический сдвиг");
        } else {
            System.out.println("Т - не циклический сдвиг");
        }
    }
}
