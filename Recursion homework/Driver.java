import java.io.*;

/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */



public class Driver {
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("Enter string: ");
        foo();
        
        
}

public static void foo() throws java.io.IOException {
    char c = (char) System.in.read();
    
    do {
         foo();
        }
        while (c != '.');
         
    System.out.print(c);
}
}
