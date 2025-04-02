package chapter6.program1;

public class Circle extends Shape {
    private Point center;  // 円の中心を表すPoint型フィールド
    private int radius;    // 円の半径を表すint型フィールド
    
    // 引数なしコンストラクタ
    public Circle() {
        this.center = new Point(0, 0); // 中心を(0, 0)で初期化
        this.radius = 0;               // 半径を0で初期化
    }

    // 引数ありコンストラクタ
    public Circle(int x, int y, int r) {
        this.center = new Point(x, y); // x, y座標を受け取ってcenterに設定
        this.radius = r;               // 半径をrで設定
    }

    // 図形描画機能の実装
    @Override
    public void draw() {
        System.out.println("[円を描画] 中心点(" + center.getX() + "," + center.getY() + ")から半径" + radius);
    }

    // 円周の長さを計算する機能の実装
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;  // 円周の長さは 2 * π * 半径
    }
}
