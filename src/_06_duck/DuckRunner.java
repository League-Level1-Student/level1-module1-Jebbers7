package _06_duck;

public class DuckRunner {
public static void main(String[] args) {
	Duck jeffrey = new Duck("tropical fish", 3);
	jeffrey.quack();
	Shark jorge = new Shark("Jorge", 2);
	jorge.bite();
}
}
