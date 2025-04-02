package chapter6.program1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("図形描画[ 0:円 2:線 3:三角形 4:長方形 44:正方形 ] : >");
        int choice = scanner.nextInt();

        switch (choice) {
            case 0: // 円
                Circle circle = new Circle(100, 100, 20);
                circle.draw();
                System.out.println("周囲の長さは、" + circle.getPerimeter());
                break;

            case 2: // 線
                Line line = new Line(0, 0, 100, 100);
                line.draw();
                System.out.println("周囲の長さは、" + line.getPerimeter());
                break;

            case 3: // 三角形
                Triangle triangle = new Triangle(0, 0, 100, 100, 0, 200);
                triangle.draw();
                System.out.println("周囲の長さは、" + triangle.getPerimeter());
                System.out.println("内角の和は、180");
                break;

            case 4: // 長方形
                Rectangle rectangle = new Rectangle(0, 0, 100, 50);
                rectangle.draw();
                System.out.println("周囲の長さは、" + rectangle.getPerimeter());
                System.out.println("内角の和は、360");
                break;

            case 44: // 正方形
                Square square = new Square(0, 0, 200);
                square.draw();
                System.out.println("周囲の長さは、" + square.getPerimeter());
                System.out.println("内角の和は、360");
                break;

            default:
                System.out.println("無効な選択肢です。");
        }

        scanner.close();
    }
}
