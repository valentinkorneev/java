package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello("world");
		hello("User");
		hello("Jackass");

		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.l + " равна " + s.area());

		Rectangle r = new Rectangle(4, 6);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + r.area());

		Point p1 = new Point(2,0);
		Point p2 = new Point(6,0);

		System.out.println("Расстояние между двумя точками p1 и p2 равно " + Point.distance(p1, p2));

	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody +"!");
	}





}