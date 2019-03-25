package project404;

import java.util.HashMap;
import java.util.Map;

public class Professor {
	private int id;
	private String name;
	private Map<Integer, Expertise> expertises = new HashMap<>();

	public Professor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addExpertise(Expertise expertise) {
		this.expertises.put(expertise.getTopic().getId(), expertise);
	}

	@Override
	public String toString() {
		return "Professor [id=" + id + ", name=" + name + ", expertises=" + expertises + "]";
	}
}
