import java_cup.runtime.Symbol;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        FileReader file;


        try {
            file = new FileReader("p.txt");
            MPLexer scanner = new MPLexer(file);
            Symbol src ;
            System.out.println(scanner.next_token());
            System.out.println(scanner.next_token());
            System.out.println(scanner.next_token());
            System.out.println(scanner.next_token());
            System.out.println(scanner.next_token());
            parser p = new parser(scanner);
            p.parse();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
