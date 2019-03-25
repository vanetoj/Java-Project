package project404;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private int id;
	private String name;
	private List<CourseTopic> courseTopics = new ArrayList<>();

	public Course(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addCourseTopic(CourseTopic courseTopic) {
		courseTopics.add(courseTopic);
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", courseTopics=" + courseTopics + "]";
	}
	
}
