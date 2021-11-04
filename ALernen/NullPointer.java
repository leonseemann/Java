package ALernen;

public class NullPointer {
    public static void main(String[] args) { // 2
        java.awt.Point p = null; // 3
        String s = null;
        p = new java.awt.Point();
        s = ""; // 4
        p.setLocation(1, 2); // 5
        s.length(); // 6
    }
}
