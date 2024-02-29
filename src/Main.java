//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(10,10);
        Point p2 = new Point(100, 100);
        Segment segment = new Segment(p1, p2);
        System.out.println(segment.toSvg());

        Point[] points = new Point[10];
    }
}