public class Ellipse implements Shape{
    public Ellipse(Vec2 point, int i, int i1, Style style) {
    }import java.util.Locale;

    public class Ellipse extends Shape {
        private Vec2 center;
        private double rx,ry;
        public Ellipse(Vec2 center, double rx, double ry, Style style){
            this.style=style;
            this.center=center;
            this.rx=rx;
            this.ry=ry;
        }
        public String toSvg(String parameters){
            return String.format(Locale.ENGLISH,"<ellipse cx=\"%f\" cy=\"%f\" rx=\"%f\" ry=\"%f\"\n" +
                    " %s />",center.x,center.y,rx,ry,style.toSvg());
        }

    }
}
