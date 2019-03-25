package project404;

public class CourseTopic {
	private Course course;
	private Topic topic;
	private double percentage;

	public CourseTopic(Course course, Topic topic, double percentage) {
		super();
		this.course = course;
		this.topic = topic;
		this.percentage = percentage;
	}

	public Course getCourse() {
		return course;
	}

	public double getPercentage() {
		return percentage;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "CourseTopic [topic=" + topic + ", percentage=" + percentage + "]";
	}

	
	
}
