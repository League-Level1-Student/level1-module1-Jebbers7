package _06_duck;

public class Shark {
		int numberOfKids;
		String name;
		void swim () {
			System.out.println(name + " is swimming!");
		}
		void bite () {
			System.out.println(name + " is angry and has bitten someone!");
		}
		Shark(String name, int numberofKids){
			this.name = name;
			this.numberOfKids = numberOfKids;
		}
	}

