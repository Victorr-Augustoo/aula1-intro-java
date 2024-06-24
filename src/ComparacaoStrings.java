public class ComparacaoStrings {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello"); // operador new aloca uma nova memoria
    
        System.out.println(a == b); // interning -> cache de strings
        System.out.println(a == c);
        System.out.println(a.equals(c)); // jeito certo de comparar strings


        
    
    }
    
}
