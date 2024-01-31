package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        StringBuilder sb = new StringBuilder(message);
        String reversed = sb.reverse().toString();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        System.out.println(reversed);
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String reversed) {
        return reversed;
    }
        
}