package edu.bu.runners;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import edu.bu.domain.Cat;

public class JsonExample {
	public static void main(String[] a) throws IOException {
		Cat cat = new Cat(1, 2);
		ObjectMapper om = new ObjectMapper();
		String jsonString = om.writeValueAsString(cat);
		System.out.println(jsonString);
		Cat readValue = om.readValue(jsonString, Cat.class);
		System.out.println(readValue);
 
		List<Cat> cats = new ArrayList<>();
		cats.add(new Cat(15, 20));
		cats.add(new Cat(150, 200));

		try {
			om.enable(SerializationFeature.INDENT_OUTPUT);
			jsonString = om.writeValueAsString(cats);
			System.out.println(jsonString);
			// This is how to read json list
			List<Cat> catsList = om.readValue(jsonString, new TypeReference<List<Cat>>() {
			});
			System.out.println(catsList);
		} catch (Exception ex) { // TODO Auto-generated catch block
			ex.printStackTrace();
		}

	}
}
