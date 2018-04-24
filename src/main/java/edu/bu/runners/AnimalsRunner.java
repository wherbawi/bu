package edu.bu.runners;

import java.util.ArrayList;

import edu.bu.domain.Animal;
import edu.bu.domain.Cat;
import edu.bu.domain.Fish;

public class AnimalsRunner {

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();
		Cat e = new Cat(10, 10);
		animals.add(e);

		animals.add(new Fish(10, 10));
		int ix = 16;
		for (Animal animal : animals) {
			System.out.println(animal);
		}

		/*
		 * ObjectMapper om = new ObjectMapper();
		 * om.configure(SerializationFeature.INDENT_OUTPUT, true); try { String
		 * writeValueAsString = om.writeValueAsString(animals);
		 * System.out.println(writeValueAsString); List<Animal> readValue =
		 * om.readValue(writeValueAsString, new TypeReference<List<Animal>>() { }); }
		 * catch (Exception ex) { // TODO Auto-generated catch block
		 * ex.printStackTrace(); }
		 */
	}

}
