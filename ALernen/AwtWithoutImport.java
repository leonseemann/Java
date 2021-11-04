package ALernen;

public class AwtWithoutImport {
    public static void main(String[] args) {
        java.awt.Point p = new java.awt.Point();

        java.awt.Polygon t = new java.awt.Polygon();
        t.addPoint(10, 10);
        t.addPoint(10, 20);
        t.addPoint(20, 10);

        System.out.println(p);
        System.out.println(t.contains(15, 15));
    }
}
