public class StringForLoop {
    public static void main(String[] args) {
        String testStr = "ajkjkjkasl;jkbjkl;ajs";
        String u = "";
        for (int i = 0; i < testStr.length(); i++) {
            String c = testStr.substring(i, i+1);
            if (c.equals("a") == false) {
                u = u + c;
            }
        }
        System.out.println("ORIGINAL: " + testStr);
        System.out.println(" REMOVED: " + u);
    }
}
