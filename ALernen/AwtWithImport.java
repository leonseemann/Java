package ALernen;

import java.awt.Point;
import java.awt.Polygon;

public class AwtWithImport {
    public static void main(String[] args) {
        Point p = new Point();

        Polygon t = new Polygon();

        t.addPoint(10, 10);
        t.addPoint(10, 20);
        t.addPoint(20, 10);

        System.out.println(p);
        System.out.println(t.contains(15, 15));
    }
}
