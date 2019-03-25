package project404;

public class Expertise {
	private Professor prof;
	private Topic topic;
	private int level;

	public Expertise(Topic topic, Professor prof, int level) {
		super();
		this.prof = prof;
		this.topic = topic;
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public Professor getProf() {
		return prof;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void setProf(Professor prof) {
		this.prof = prof;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "Expertise [topic=" + topic + ", level=" + level + "]";
	}
	
	
}
