public class TiposPrimitivos {
    public static void main(String[] args){
        byte b = 10; // 1 byte
        short s = 100; // 2 bytes, maior valor positivo 2^15 - 1
        int i = 40; // 4 bytes
        long l = 100; // 8 bytes

        float f = 10.0f; // 4 bytes
        double d = 20.0; // 8 bytes

        float g = (float) d; // casting

        boolean bb = true;
        char c = 'a';
    }
}