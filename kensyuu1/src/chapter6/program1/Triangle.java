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
        System.out.println("[三角形を描画] 点1(" + p1.x + "," + p1.y + ")から点2(" + p2.x + "," + p2.y + ")、点3(" + p3.x + "," + p3.y + ")の三角形");
    }

    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }
}
