package project404;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		new Main().go();
	}

	private void go() {
		Course c1 = new Course(303, "Data Structures");
		Course c2 = new Course(490, "Web Development");
		Course c3 = new Course(371, "Database");
		Course c4 = new Course(550, "Design and Analysis of Algorithms");
		Course c5 = new Course(201, "Programming in Python");

		List<Course> courses = new ArrayList<>();
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		courses.add(c4);
		courses.add(c5);

		Topic t1 = new Topic(1, "Programming");
		Topic t2 = new Topic(2, "HTML");
		Topic t3 = new Topic(3, "PHP");
		Topic t4 = new Topic(4, "C++");
		Topic t5 = new Topic(5, "Statistics");

		List<Topic> topics = new ArrayList<>();
		topics.add(t1);
		topics.add(t2);
		topics.add(t3);
		topics.add(t4);
		topics.add(t5);

		c1.addCourseTopic(new CourseTopic(c1, t1, 20.0));
		c1.addCourseTopic(new CourseTopic(c1, t4, 30.0));
		c3.addCourseTopic(new CourseTopic(c3, t1, 05.0));
		
		
		Professor p1 = new Professor(1, "John Smith");
		Professor p2 = new Professor(1, "Samir Khan");
		Professor p3 = new Professor(1, "Ann Jackson");
		List<Professor> profs = new ArrayList<>();
		profs.add(p1);
		profs.add(p2);
		profs.add(p3);

		Expertise e1 = new Expertise(t1,  p1, 5);
		Expertise e2 = new Expertise(t2,  p1, 1);
		Expertise e3 = new Expertise(t2,  p2, 5);
		
		p1.addExpertise(e1);
		p1.addExpertise(e2);
		p2.addExpertise(e3);
		
		for (Course c : courses) {
			System.out.println(c);
		}
		for (Professor p : profs) {
			System.out.println(p);
		}
		
		
		
	}

}
