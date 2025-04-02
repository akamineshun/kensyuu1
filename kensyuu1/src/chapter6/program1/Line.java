package chapter6.program1;

//Line.java
public class Line implements Figure {
 // 線の始点を表すPoint型フィールド
 private Point p1;
 
 // 線の終点を表すPoint型フィールド
 private Point p2;

 // 引数なしコンストラクタ
 public Line() {
     this.p1 = new Point(0, 0);  // p1は(0, 0)で初期化
     this.p2 = new Point(0, 0);  // p2は(0, 0)で初期化
 }

 // 4つのint型データを受け取るコンストラクタ
 public Line(int x1, int y1, int x2, int y2) {
     this.p1 = new Point(x1, y1);  // p1を指定された座標で初期化
     this.p2 = new Point(x2, y2);  // p2を指定された座標で初期化
 }

 // 図形描画機能の実装
 @Override
 public void draw() {
     System.out.println("[線を描画] 始点(" + p1.getX() + "," + p1.getY() + ")から終点(" 
                        + p2.getX() + "," + p2.getY() + ")まで");
 }

 // 長さ測定機能の実装
 @Override
 public double getPerimeter() {
     // (x2 - x1)^2 + (y2 - y1)^2 の平方根を計算して長さを算出
     double dx = p2.getX() - p1.getX();
     double dy = p2.getY() - p1.getY();
     return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
 }
}
