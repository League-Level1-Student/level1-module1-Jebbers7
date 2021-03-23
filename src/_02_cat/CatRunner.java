package _02_cat;

public class CatRunner {
public static void main(String[] args) {
	Cat kit = new Cat("kit");
	kit.meow();
	kit.printName();
	for(int i = 0; i < 9; i++) {
	kit.kill();
}}
}
