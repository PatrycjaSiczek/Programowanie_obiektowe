public class Main {
    public static void main(String[] args) {
//        Style style = new Style("lime", "red", null);
//        Vec2 point1 = new Vec2(0, 100);
//        Vec2 point2 = new Vec2(100, 102);
//
//        Segment line = new Segment(point1, point2);
//        Polygon polygon = Polygon.sqare(line, style);
//
//        Ellipse ellipse = new Ellipse(new Vec2(150, 200), 20, 30, style);
//
//        SvgScene svgScene = new SvgScene();
//        svgScene.addShape(polygon);
//        svgScene.addShape(ellipse);
//        svgScene.saveHtml("./test.html");
        Vec2 point1 = new Vec2(0, 100);
        Vec2 point2 = new Vec2(100, 102);
        Vec2 point3 = new Vec2(50, 100);
        Polygon polygon = new Polygon(3,new Style(null,null,null));
        SolidFilledPolygon solidFilledPolygon= new SolidFilledPolygon(3,"red");
        solidFilledPolygon.setPoint(0,point1);
        solidFilledPolygon.setPoint(1,point2);
        solidFilledPolygon.setPoint(2,point3);

        Shape filledPolygon = new SolidFillShapeDecorator(polygon,"blue");
        Shape transformedPolygon = TransformationDecorator.Builder().setShape(filledPolygon).setTranslateVector(point3).build();
        SvgScene svgScene = new SvgScene();
        svgScene.addShape(filledpolygon);
        svgScene.saveHtml("./test.html");
    }
}