import java.util.Locale;

public class TransformationDecorator extends ShapeDecorator{
    private boolean translate = false;
    private Vec2 translateVector;

    public TransformationDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public String toSvg(String parameters) {
        String transform ="";
        if(translate == true){
            transform += String.format(
                    Locale.ENGLISH,"translate(%f %f") ", translateVector.x,translateVector.y);
        }
            return super.toSvg(
                    String.format(Locale.ENGLISH,
                            "transform=\"%s\" %s ", color, parameters)
            );
        return super.toSvg(parameters);
    }

    public static class Builder{
    private boolean translate = false;
        private Vec2 translateVector;
        Shape shape;

        public void setShape(Shape shape) {
            this.shape = shape;
        }

        public Builder setTranslateVector(Vec2 translateVector) {
            this.translateVector = translateVector;
            this.translate = true;
            return this;
        }
        public TransformationDecorator build(){
            TransformationDecorator tr = new TransformationDecorator(shape);
            tr.transalte = translate;
            tr.translateVector= translateVector;
            return tr;
        }
    }
}