package hello;

import animals.Animals;
import animal.reptile.*;
import animal.fish.*;
import animal.bird.*;

public class Main {
	public static void main(String[] args) {
		Animals animal = new Animals();
		System.out.println(animal.showInfo());

		Reptile reptile = new Reptile();
		System.out.println(reptile.showInfo());

		Crocodile croc = new Crocodile();
		System.out.println(croc.showInfo());

		Fish fish = new Fish();
		System.out.println(fish.showInfo());

		whale Whale = new whale();
		System.out.println(Whale.showInfo());

		Bird bird = new Bird();
		System.out.println(bird.showInfo());

		Eagle eagle = new Eagle();
		System.out.println(eagle.showInfo());
	}

}
