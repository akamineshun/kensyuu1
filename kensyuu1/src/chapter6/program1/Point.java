package chapter6.program1;

public class Point {
 // 座標フィールド
 private int x;
 private int y;

 // 引数なしのコンストラクタ
 public Point() {
     this.x = 0; // 初期値0
     this.y = 0; // 初期値0
 }

 // x, yを受け取るコンストラクタ
 public Point(int x, int y) {
     this.x = x;
     this.y = y;
 }

 // x座標を取得するメソッド
 public int getX() {
     return this.x;
 }

 // x座標を設定するメソッド
 public void setX(int x) {
     this.x = x;
 }

 // y座標を取得するメソッド
 public int getY() {
     return this.y;
 }

 // y座標を設定するメソッド
 public void setY(int y) {
     this.y = y;
 }
}

