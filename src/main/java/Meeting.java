public class Meeting extends Task {

    protected String topic;
    protected String project;
    protected String start;
    public Meeting(int id, String topic, String start, String project){
        super(id);
        this.topic = topic;
        this.start = start;
        this.project = project;
    }

    public String getTopic() {
        return topic;
    }

    public String getStart() {
        return start;
    }

    @Override
    public boolean matches(String query) {
        return topic.contains(query) || project.contains(query);
    }
}
