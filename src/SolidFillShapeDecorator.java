public class SolidFillShapeDecorator extends ShapeDecorator {
    private String color;

    public SolidFillShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
        this.color=color;
    }

    @Override
    public String toSvg(String parameters) {
        return super.toSvg(parameters);
        @Override
        public String toSvg(String parameters) {
            return super.toSvg(
                    String.format(Locale.ENGLISH,
                            "fill=\"%s\" %s ", color, parameters)
            );

        }
}
