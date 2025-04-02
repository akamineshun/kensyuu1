package chapter6.program1;

class Triangle extends Polygon {
    private Point p1, p2, p3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(3);
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
        this.p3 = new Point(x3, y3);
    }

    public void draw() {
        System.out.println("[三角形を描画] 点1(" + p1.getX() + "," + p1.getY() + ")から点2(" + p2.getX() + "," + p2.getY() + ")、点3(" + p3.getX() + "," + p3.getY() + ")の三角形");
    }

    public double getPerimeter() {
    	Line line1 = new Line(p1.getX(), p1.getY(), p2.getX(), p2.getY());
        Line line2 = new Line(p2.getX(), p2.getY(), p3.getX(), p3.getY());
        Line line3 = new Line(p3.getX(), p3.getY(), p1.getX(), p1.getY());
        return line1.getPerimeter() + line2.getPerimeter() + line3.getPerimeter();
    }
}
