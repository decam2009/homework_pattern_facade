public class BinOps {
    public String sum(String a, String b) {
        int a1 = Integer.parseInt(a , 2);
        int a2 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(a1 + a2);
    }

    public String mult(String a, String b) {
        int a1 = Integer.parseInt (a, 2);
        int a2 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(a1 * a2);
    }
}
