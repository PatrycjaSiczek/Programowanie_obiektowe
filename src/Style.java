import java.util.Locale;
public class Style {
    final public String fillColor, strokeColor;
    final public Double strokeWidth;

    public Style(String fillColor, String strokeColor, Double strokeWidth) {
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
        this.strokeWidth = strokeWidth;
    }

    public String toSvg() {
        return String.format(Locale.ENGLISH, "" +
                        "style=\"stroke:%s;stroke-width:%f;fill:%s\"",
                strokeColor, strokeWidth, fillColor);
    }
}