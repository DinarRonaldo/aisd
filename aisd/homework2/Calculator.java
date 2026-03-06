package aisd.homework2;

public class Calculator {

    public static int evaluate(String amy) {
        Stack numberStack = new Stack();
        for (int i = 0; i < amy.length(); i++) {
            char ch = amy.charAt(i);
            if (ch == '+') {
                int a = numberStack.extract().getValue();
                int b = numberStack.extract().getValue();
                numberStack.insert(new StackNode(b + a));
            }
            else if (ch == '-') {
                int a = numberStack.extract().getValue();
                int b = numberStack.extract().getValue();
                numberStack.insert(new StackNode(b - a));
            }
            else if (ch == '*') {
                int a = numberStack.extract().getValue();
                int b = numberStack.extract().getValue();
                numberStack.insert(new StackNode(b * a));
            }
            else if (ch >= '0' && ch <= '9') {
                int number = ch - '0';
                numberStack.insert(new StackNode(number));
            }
        }
        return numberStack.extract().getValue();
    }
}
