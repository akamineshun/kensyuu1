package chapter6.program1;

public abstract class Shape implements Figure {
    // 抽象クラスなので、直接のインスタンス化はできません。
    // ここでは共通のメソッドの定義を行います。
    
    // 図形描画機能の抽象メソッド
    public abstract void draw();
    
    // 長さ測定機能の抽象メソッド
    public abstract double getPerimeter();
}
