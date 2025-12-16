package collections.lambda;

interface StringFunction {
    String run (String str);
}

public class Example1 {
    public static void main(String[] args) {
        StringFunction f = (s) -> s + " Hello Lambda";
        StringFunction ask = (s) -> s + " Hello Ask";
        printFormatted("ask", f);
        printFormatted("lambda:", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
